package bg.clearcode.javacoude181022.example12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner1 {
    private static final OrganizationService organizationService = new OrganizationService();

    public static void main(final String[] args) {
        final Runnable runnableModifying = () -> {
            final Organization organization = new Organization();
            organization.setName("Organization_" + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + ": adding " + organization.getName());
            organizationService.addOrganization(organization);
            System.out.println(Thread.currentThread().getName() + ": added " + organization.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ": removing " + organization.getName());
            organizationService.removeOrganization(organization);
            System.out.println(Thread.currentThread().getName() + ": removed " + organization.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        final Runnable runnableReading = () -> {
            System.out.println(Thread.currentThread().getName() + ": getting list of even names");
            final List<Organization> organizationListEvenNames = organizationService.getOrganizationsByPredicate(organization -> {
                final int value = Integer.valueOf(organization.getName().split("_")[1]);
                return value == 0 || value % 2 != 0;
            });
            System.out.println(Thread.currentThread().getName() + ": list of even names:");
            organizationListEvenNames.forEach(System.out::println);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ": getting first even name");
            final Optional<Organization> organizationOptional = organizationService.getOrganizationFirstOrderedByComparatorFilteredByPredicate(
                    Comparator.comparing(Organization::getName),
                    organization -> {
                        final int value = Integer.valueOf(organization.getName().split("_")[1]);
                        return value == 0 || value % 2 != 0;
                    }); // todo: extract predicate for reuse
            System.out.println(Thread.currentThread().getName() + ": first even name: " +
                    (organizationOptional.isPresent() ? organizationOptional.get() : "no such organization found."));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // TODO: wrap it up
        /*final ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> System.out.println("hi!"));
        try {
            Thread.sleep(1000 * 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


    }
}
