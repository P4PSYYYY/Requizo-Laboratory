package Activity04;

public class students extends person {
    private String gradeLevel;

    // Constructor
    public students(String name, int id, int age, String gradeLevel) {
        super(name, id, age); // Call the parent constructor with the required third argument
        this.gradeLevel = gradeLevel;
    }

    // Getter for gradeLevel
    public String getGradeLevel() {
        return gradeLevel;
    }

    // Setter for gradeLevel
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // Override displayInfo to include gradeLevel
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent displayInfo method
        System.out.println("Grade Level: " + gradeLevel);
    }
}