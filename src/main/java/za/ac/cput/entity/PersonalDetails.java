package za.ac.cput.entity;

public class PersonalDetails {
    private String contactEmail;
    private String contactCellNumber;
    private String qualificationType;

    private PersonalDetails (PersonalDetails.Builder builder){
        this.contactCellNumber = builder.contactCellNumber;
        this.contactEmail = builder.contactEmail;
        this.qualificationType = builder.qualificationType;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactCellNumber() {
        return contactCellNumber;
    }

    public String getQualificationType() {
        return qualificationType;
    }


    public String toString() {
        return "PersonalDetails{" +
                "contactEmail='" + contactEmail + '\'' +
                ", contactCellNumber='" + contactCellNumber + '\'' +
                ", qualificationType='" + qualificationType + '\'' +
                '}';
    }

    public static class Builder{
        private String contactEmail;
        private String contactCellNumber;
        private String qualificationType;

        public Builder setContactEmail(String contactEmail){
            this.contactEmail = contactEmail;
            return this;
        }

        public Builder setContactCellNumber(String contactCellNumber){
            this.contactCellNumber = contactCellNumber;
            return this;
        }

        public Builder setQualificationType(String qualificationType){
            this.qualificationType = qualificationType;
            return this;
        }

        public Builder copy(PersonalDetails personalDetails) {
            this.contactEmail = personalDetails.contactEmail;
            this.contactCellNumber = personalDetails.contactCellNumber;
            this.qualificationType = personalDetails.qualificationType;
            return this;
        }

        public PersonalDetails build(){
            return new PersonalDetails(this);
        }
    }
}
