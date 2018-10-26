package bg.clearcode.javacoude181022.example12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
public class OrganizationService {
    private List<Organization> organizationList;

    public OrganizationService() {
        organizationList = IntStream.range(0, 100).boxed().map(i -> {
            final Organization organization = new Organization();
            organization.setName("Organization_" + i);
            return organization;
        }).collect(Collectors.toList());
    }

    // MODIFYING
    public synchronized boolean addOrganization(final Organization organization) {
        assert organization != null;
        return organizationList.add(organization);
    }

    public synchronized boolean removeOrganization(final Organization organization) {
        assert organization != null;
        return organizationList.remove(organization);
    }

    // SEARCH
    public synchronized List<Organization> getOrganizationsByPredicate(final Predicate<Organization> predicate) {
        return organizationList.stream().filter(predicate).collect(Collectors.toList());
    }

    public synchronized Optional<Organization> getOrganizationFirstOrderedByComparatorFilteredByPredicate(final Comparator<Organization> comparator,
                                                                                             final Predicate<Organization> predicate) {
        return organizationList.stream().sorted(comparator).filter(predicate).findFirst();
    }
}
