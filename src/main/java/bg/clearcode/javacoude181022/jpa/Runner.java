package bg.clearcode.javacoude181022.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000 * 5);

        final EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("JavaCourse181022");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        // TODO: uncomment to populate
        //populateEntities.accept(entityManager);

        // JPQL
        //entityManager.createNamedQuery("select Person p where p.name = :name", )

       /* Person person = null;
        final Organization organization = new Organization();
        organization.setName("OrganizationNew");
        organization.setPersonList(Arrays.asList(person));

        final EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        try {
            person = entityManager.find(Person.class, 2L);
            person.setOrganization(organization);
            entityManager.persist(person);
        } finally {
            entityTransaction.commit();
        }
        System.out.println(person);*/

        Organization organization = null;
        entityManager.getTransaction().begin();
        try {
            organization = entityManager.find(Organization.class, 2L);
            //organization.setPersonList(null);
            organization.getPersonList().clear();
            entityManager.persist(organization);
            entityManager.remove(organization);
        } finally {
            entityManager.getTransaction().commit();
        }
        System.out.println(organization);

        //entityManager.createNamedQuery("")
    }

    public static Consumer<EntityManager> populateEntities = entityManager -> {
        final Person person = new Person();
        person.setName("Dilqna");
        person.setFamily("Georgieva");
        person.setDateOfBirth(LocalDate.of(1980, Month.APRIL, 12));
        person.setGender(Gender.FEMALE);
        person.setTitles(Arrays.asList("PhD.", "Professor"));

        final User user = new User();
        user.setUsername("username1");
        user.setPassword("password1");
        person.setUser(user);

        final Organization organization = new Organization();
        organization.setName("OrganizationName");
        organization.setPersonList(Arrays.asList(person));
        //person.setOrganization(organization);

        final EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        try {
            entityManager.persist(organization);
            entityManager.persist(person);
            // persist 2
        } finally {
            entityTransaction.commit();
        }
    };


}
