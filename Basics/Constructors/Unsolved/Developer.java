// TODO: Create a constructor function called 'Developer' that takes in 'name' and 'tech'

// TODO: Call  a method called 'introduction()' that introduces the Developer with their name and favorite tech

// TODO: Create a new object using the 'Developer' constructor

// TODO: Call the 'introduction()' method on the new object

package Basics.Constructors.Unsolved;

public class Developer {
    private String name;
    private String tech;

    public Developer(String name, String tech) {
        this.name = name;
        this.tech = tech;
    }
    
    public String introduction() {
        return "The developer's name is " + this.name + " and their favorite tech is " + this.tech + ".";
    }

    public static void main(String[] args) {
        Developer dev1 = new Developer("John","Frontend");
        System.out.println(dev1.introduction());
    }
}