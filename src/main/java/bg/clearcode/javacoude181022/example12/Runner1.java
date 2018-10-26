package bg.clearcode.javacoude181022.example12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner1 {
    private static final OrganizationService organizationService = new OrganizationService();

    private static final Predicate<Organization> organizationNamePredicate = organization -> {
        final String organizationName = organization.getName();
        final int value = organizationName.charAt(organizationName.length() - 1);
        return value == 0 || value % 2 != 0;
    };

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
            final List<Organization> organizationListEvenNames =
                    organizationService.getOrganizationsByPredicate(organizationNamePredicate);
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
                    organizationNamePredicate);
            System.out.println(Thread.currentThread().getName() + ": first even name: " +
                    (organizationOptional.isPresent() ? organizationOptional.get() : "no such organization found."));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        final ExecutorService executorService = Executors.newFixedThreadPool(10);
        IntStream.range(0, 100).forEach(i -> {
            executorService.execute(runnableReading);
            executorService.execute(runnableModifying);
        });

        // recommended using private monitors (implementation-specific)
        /*synchronized (organizationService) {
            System.out.println("taking the monitor from main thread");
            while (true) {
            }
        }*/

        try {
            Thread.sleep(1000 * 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void threadPrint(final String message) {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }
}
