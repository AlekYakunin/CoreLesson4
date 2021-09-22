package task2;

public class Contact {
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(String phoneNumber, String lastName, String firstName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
