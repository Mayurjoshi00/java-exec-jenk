package bank.model;

public class Employee extends Person {
    protected String companyName;
    protected String doj;
    protected double ctc;

    public Employee(String name, String dob, String pan, String aadhaar,
                    String companyName, String doj, double ctc) {

        super(name, dob, pan, aadhaar);
        this.companyName = companyName;
        this.doj = doj;
        this.ctc = ctc;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Company: " + companyName);
        System.out.println("DOJ: " + doj);
        System.out.println("CTC: " + ctc);
    }
}