package Activity04;

public class staff extends person {
    private String department;

    // Constructor
    public staff(String name, int id, int age, String department) {
        super(name, id, age); // Call the parent constructor
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Override displayInfo to include department
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
