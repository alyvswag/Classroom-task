package OopIntro;

public class Car {
    private String make;
    private String model;
    private int year;
    private static int maxSpeedLimit = 120;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void setMaxSpeedLimit(int maxSpeedLimit) {
        Car.maxSpeedLimit = maxSpeedLimit;
    }

    public static int getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void displayInfo() {
        System.out.println("Masinin adi: " + make);
        System.out.println("Masinin modeli: " + model);
        System.out.println("Masinin ili: " + year);
    }


}
