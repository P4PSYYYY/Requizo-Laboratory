package Activity04;

class SchoolTest {
    public static void main(String[] args) {
        // Create objects of Student, Teacher, and Staff
        students student = new students("Kent", 19, "1st year");
        teachers teacher = new teachers("ms. bagsic", "Filipino", 5);
        staff staff = new staff("Mr. clean", "Janitor", 10);

        // Call displayInfo() method for each object
        student.displayInfo();
        teacher.displayInfo();
        staff.displayInfo();
    }
}
class students {
    private String name;
    private int age;
    private String grade;

    public students(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

class teachers {
    private String name;
    private String subject;
    private int yearsOfExperience;

    public teachers(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println();
    }
}

class staff {
    private String name;
    private String position;
    private int yearsOfService;

    public staff(String name, String position, int yearsOfService) {
        this.name = name;
        this.position = position;
        this.yearsOfService = yearsOfService;
    }

    public void displayInfo() {
        System.out.println("Staff Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println();
    }
}