import java.util.Scanner;
public class vehicle {
    // Private attributes
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor
    public vehicle() {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to display
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    public static class car extends vehicle {
        // Additional attribute for car
        private int numberOfDoors;

        // Constructor
        public car(String brand, int speed, String fuelType, int numberOfDoors) {
            super(brand, speed, fuelType); // Call the parent constructor
            this.numberOfDoors = numberOfDoors;
        }

        // Getter for numberOfDoors
        public int getNumberOfDoors() {
            return numberOfDoors;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }
    public static class motorcycle extends vehicle {
        private boolean hasSidecar;
        
        public motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
            super(brand, speed, fuelType); // Call the parent constructor
            this.hasSidecar = hasSidecar;
        }
        public boolean hasSidecar() {
            return hasSidecar;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
        System.out.println("Enter 1 for Car or 2 for Motorcycle: ");
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter brand: ");
                String brand = scanner.next();
                
                System.out.print("Enter speed: ");
                int speed = scanner.nextInt();
                
                System.out.print("Enter fuel type: ");
                String fuelType = scanner.next();
                
                System.out.print("Enter number of doors: ");
                int numberOfDoors = scanner.nextInt();
                
                car car = new car(brand, speed, fuelType, numberOfDoors);
                car.displayInfo();
                break;
            case 2:
                System.out.print("Enter brand: ");
                brand = scanner.next();
                
                System.out.print("Enter speed: ");
                speed = scanner.nextInt();
                
                System.out.print("Enter fuel type: ");
                fuelType = scanner.next();
                
                System.out.print("Does have a sidecar (Yes/No): ");
                String hasSidecarInput = scanner.next();
                boolean hasSidecar = hasSidecarInput.equalsIgnoreCase("Yes");

                motorcycle motorcycle = new motorcycle(brand, speed, fuelType, hasSidecar);
                motorcycle.displayInfo();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.print("\nDo you want to continue? (1 for yes /2 for no): ");
        choice = scanner.nextInt();
        } while(choice == 1);
        System.out.println("Thank You!.");

        scanner.close();
    }
}