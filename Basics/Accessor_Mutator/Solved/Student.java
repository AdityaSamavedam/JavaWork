package Basics.Accessor_Mutator.Solved;

public class Student {

    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
     
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
    Student s1=new Student("Emma",3.9);
    Student s2=new Student("Alice",4.9);
    s2=s1;
    s2.setGpa(4.01);
    System.out.println(s1.getGpa());
        
    }
}
