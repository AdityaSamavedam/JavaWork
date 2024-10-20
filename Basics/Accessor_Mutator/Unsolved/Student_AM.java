package Basics.Accessor_Mutator.Unsolved;

public class Student_AM {

    private String name;
    private double gpa;

    public Student_AM(String newName, double newGPA) {
        name = newName;
        gpa = newGPA;
    }

    public String getName() {
        return name;
    }

    public void setGPA(double updatedGPA) {
        gpa = updatedGPA;
    }

    public double getGPA() {
        return gpa;
    }    

    public static void main(String[] args) {
        Student_AM sam = new Student_AM("Sam", 4.0);
        System.out.println(sam.getName() + " is the name of the student.");
        sam.setGPA(3.8);
        System.out.println(sam.getGPA() + " is the updated GPA of Sam.");
    }
}


/*
 * TODO : Instantiate a new Student object called sam
 * TODO: How would you printout the name associated with student object
 * instantiated in above question
 * TODO:Write a method that changes the value of student object's gpa variable
 */