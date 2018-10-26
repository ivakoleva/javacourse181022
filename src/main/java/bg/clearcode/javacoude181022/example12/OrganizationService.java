package bg.clearcode.javacoude181022.example12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
public class OrganizationService {
    //Collections.synchronizedList(new ArrayList);
    // CopyOnWriteArrayList - non-locking read, but copying on each write
    final private List<Organization> organizationList;

    private final Object monitor = new Object();
    private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public OrganizationService() {
        organizationList = IntStream.range(0, 100).boxed().map(i -> {
            final Organization organization = new Organization();
            organization.setName("Organization_" + i);
            return organization;
        }).collect(Collectors.toList());
    }

    // MODIFYING
    public boolean addOrganization(final Organization organization) {
        assert organization != null;
        //synchronized (monitor) {
        Runner1.threadPrint("Adding organization: " + organization);
        reentrantReadWriteLock.writeLock().lock();
        try {
            return organizationList.add(organization);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
            Runner1.threadPrint("Organization added: " + organization);
        }
        //}
    }

    public boolean removeOrganization(final Organization organization) {
        assert organization != null;
        //synchronized (monitor) {
        Runner1.threadPrint("Removing organization: " + organization);
        reentrantReadWriteLock.writeLock().lock();
        try {
            return organizationList.remove(organization);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
            Runner1.threadPrint("Organization removed: " + organization);
        }
        //}
    }

    // SEARCH
    public List<Organization> getOrganizationsByPredicate(final Predicate<Organization> predicate) {
        Runner1.threadPrint("Start retrieving list of organizations");
        reentrantReadWriteLock.readLock().lock();
        try {
            return organizationList.stream().filter(predicate).collect(Collectors.toList());
        } finally {
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reentrantReadWriteLock.readLock().unlock();
            Runner1.threadPrint("End retrieving list of organizations");
        }
    }

    public Optional<Organization> getOrganizationFirstOrderedByComparatorFilteredByPredicate(final Comparator<Organization> comparator,
                                                                                             final Predicate<Organization> predicate) {
        Runner1.threadPrint("Start retrieving organization");
        reentrantReadWriteLock.readLock().lock();
        try {
            return organizationList.stream().sorted(comparator).filter(predicate).findFirst();
        } finally {
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reentrantReadWriteLock.readLock().unlock();
            Runner1.threadPrint("End retrieving organization");
        }
    }


}
