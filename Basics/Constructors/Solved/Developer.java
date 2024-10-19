package Basics.Constructors.Solved;


public class Developer {
    
    private String name;
    private String tech;

    public Developer(String name, String tech) {
        this.name = name;
        this.tech = tech;

    }

   
    public void Introduction()
    {
        String message="Im "+ name + "and i love"+tech;
        System.out.println(message);
    }
    public static void main(String[] args) {
        Developer dev=new Developer("Matt","Fullstack dev");
        dev.Introduction();

    }
}
