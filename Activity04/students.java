package Activity04;

public class students {
     private int gradelevel;

     public students(int gradelevel) {
         this.gradelevel = gradelevel;
     }
        public int getGradeLevel() {
            return gradelevel;
        }
        public void displayInfo() {
            System.out.println("Grade Level: " + gradelevel);
        }
}
