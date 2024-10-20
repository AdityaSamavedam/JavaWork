package Basics.Constructors.Solved;

public class House {

    private String color;
    private int size;
    private String type;

    public House(Builder builder) {
        this.color = color;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Size: " + size + ", Type: " + type;
    }

    public static class Builder {

        private String color;
        private int size;
        private String type;

        public Builder setColor(String color) {
            this.color = color;
            System.out.println(this);
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            System.out.println(this);
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            System.out.println(this);
            return this;
        }

        public House build() {
            System.out.println(this);
            return new House(this);
        }

        public static void main(String[] args) {
            House newHouse = new House.Builder().setColor("white").setSize(5).setType("apartment").build();
            System.out.println(newHouse);
        }
    }
}
