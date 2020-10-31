package net.dilwit.j8.fi.supporting;

public class My {

    private String firstName;
    private String lastName;

    public My() {
        this.firstName = "default";
        this.lastName = "default";
    }

    public My(String firstName) {
        this();
        this.firstName = firstName;
    }

    public My(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " : " + lastName;
    }
}
