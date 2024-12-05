package Basics.Accessor_Mutator.Solved;

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

    //Write a method that changes the value of student object's gpa variable
    public void setGpa(double newGPA)
    {
        gpa=newGPA;
    }

    public double getGPA()
    {
        return gpa;
    }
    public static void main(String[] args) {
        
        // Instantiate a new Student object called sam
        Student_AM sam=new Student_AM("Sam roelle", 3.9);
        //How would you printout the name associated with student object
        System.out.println(sam.getName());
        sam.setGpa(4.1);
        System.out.println(sam.getGPA());
      
    }
}