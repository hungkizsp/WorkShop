package workshop;

public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    // Default constructor
    public Guitar() {
        this.serialNumber = "";
        this.price = 0;
        this.builder = "";
        this.model = "";
        this.backWood = "";
        this.topWood = "";
    }

    // Parameterized constructor
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    // Getters and Setters
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        if (!builder.isEmpty()) {
            this.builder = builder;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()) {
            this.model = model;
        }
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        if (!backWood.isEmpty()) {
            this.backWood = backWood;
        }
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        if (!topWood.isEmpty()) {
            this.topWood = topWood;
        }
    }

    
    @Override
    public String toString() {
        return "Guitar Details: \n" +
               "Serial Number: " + serialNumber + "\n" +
               "Price: " + price + "\n" +
               "Builder: " + builder + "\n" +
               "Model: " + model + "\n" +
               "Back Wood: " + backWood + "\n" +
               "Top Wood: " + topWood;
    }

    // Method 
    public void createSound() {
        System.out.println("Creating sound for the guitar...");
        System.out.println(toString());
    }
}
