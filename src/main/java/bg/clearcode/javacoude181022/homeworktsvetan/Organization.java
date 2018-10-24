package bg.clearcode.javacoude181022.homeworktsvetan;

import java.time.LocalDate;

public class Organization extends StateEntityImpl {
    private String eik;
    private String organizationName;
    private String organizationType;

    public Organization() {
    }

    Organization(String organizationName, String organizationType, String creationDate) {
        this.organizationName = organizationName;
        this.organizationType = organizationType;
        super.setIssueDate(creationDate);
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getEik() {
        return eik;
    }

    public void setEik(String eik) {
        this.eik = eik;
    }

    @Override
    public String getIdentificationCode() {
        return eik;
    }

    @Override
    public String getName() {
        return this.organizationName + " " + this.organizationType;
    }
}
