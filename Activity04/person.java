package Activity04;

public class person {
    private String name;
    private int id;

    // Constructor 
    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display name and id
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
