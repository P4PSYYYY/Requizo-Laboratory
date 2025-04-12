public class vehicle {
    // Private attributes
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor
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

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    public class car extends vehicle {
        // Additional attribute for car
        private int numberOfDoors;

        // Constructor
        public car(String brand, int speed, String fuelType, int numberOfDoors) {
            super(brand, speed, fuelType);
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
    public class motorcycle extends vehicle {
        private boolean hasSidecar;
        
        public motorcycle(String brand, int speed, String fueltype, int numberOfDoors, boolean hasSidecar) {
            super(brand, speed, fuelType);
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
}