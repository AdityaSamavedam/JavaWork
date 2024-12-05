package Basics.Constructors.Solved;

public class House {
    private String color;  // optional
    private int size;      // optional
    private String type;   // optional

    // Private constructor to enforce the use of the builder
    private House(Builder builder) {
        this.color = builder.color;
        this.size = builder.size;
        this.type = builder.type;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

    // Static nested Builder class
    public static class Builder {
        private String color;  // optional
        private int size;      // optional
        private String type;   // optional

        // Method to set color
        public Builder setColor(String color) {
            this.color = color;
            System.out.println(this);
            return this;
        }

        // Method to set size
        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        // Method to set type
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        // Build method to create the House object
        public House build() {
            System.out.println(this);
            return new House(this);
        }
    }

    // Main method to demonstrate the Builder pattern
    public static void main(String[] args) {
        // Creating a House object using the builder
        House house = new House.Builder()
                .setColor("Blue")
                .setSize(1500)
                .setType("Villa")
                .build();

        System.out.println(house);

        // Creating a House object with only some attributes
        House house2 = new House.Builder()
                .setColor("Green")
                .build();

        System.out.println(house2);
       
    }
}

//Builder class
//A static inner class that helps construct House objects. It has a constructor that requires the type.
//It has methods for setting the optional attributes (color and size), which return the builder itself for chaining.