package Activity04;

public class person {
    private String name;
    private int id;
    private int gradelevel;

    // Constructor
    public person(String name, int id, int gradelevel) {
        this.name = name;
        this.id = id;
        this.gradelevel = gradelevel;
    }


    // Method to display name and id
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade Level: " + gradelevel);
    }
}
