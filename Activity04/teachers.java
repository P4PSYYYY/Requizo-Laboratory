package Activity04;

public class teachers extends person {
    private String subject;

    // Constructor 
    public teachers(String name, int id, String subject) {
        super(name, id); // Call the constructor of the parent class (person)
        this.subject = subject;
    }

    // Method to display subject along with name and id
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the parent class
        System.out.println("Subject: " + subject);
    }
}
