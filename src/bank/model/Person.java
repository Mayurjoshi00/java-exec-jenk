package bank.model;

public class Person {
    protected String name;
    protected String dob;
    protected String pan;
    protected String aadhaar;

    public Person(String name, String dob, String pan, String aadhaar) {
        this.name = name;
        this.dob = dob;
        this.pan = pan;
        this.aadhaar = aadhaar;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("PAN: " + pan);
        System.out.println("Aadhaar: " + aadhaar);
    }
}