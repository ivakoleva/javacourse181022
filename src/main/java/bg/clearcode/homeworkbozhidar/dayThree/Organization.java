package bg.clearcode.homeworkbozhidar.dayThree;

import java.time.LocalDateTime;

public class Organization extends StateEntityImpl {
    private String eik;
    private String organizationName;
    private String organizationType;

    Organization(final String organizationName, final String organizationType, final LocalDateTime since) {
        super.issueDate(since);
        this.organizationName = organizationName;
        this.organizationType = organizationType;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(final String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(final String organizationType) {
        this.organizationType = organizationType;
    }

    public String getEik() {
        return eik;
    }

    public void setEik(final String eik) {
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
