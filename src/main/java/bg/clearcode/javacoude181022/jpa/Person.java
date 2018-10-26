package bg.clearcode.javacoude181022.jpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
@Entity
public class Person extends BaseEntity {
    //@Transient
    @Basic(optional = false)
    private String name;

    @Basic(optional = false)
    private String family;

    @Column(nullable = false)//(name = "something_else")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ElementCollection
    private List<String> titles;

    @Embedded
    private User user;

    /*@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Organization organization;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }*/
}
