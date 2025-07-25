package model;

public class ContactData {

    private String firstname;
    private String lastname;
    private String photoPath;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData withPhoto(String photoPath) {
        this.photoPath = photoPath;
        return this;
    }

}
