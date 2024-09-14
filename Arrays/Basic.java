public class Basic {
  public static void main(String[] args) {

    // So far, we have been storing one piece of data in variables
       String name = "Andre";
       int pets = 3;
       boolean isStudent = true;

       System.out.println(name);
       System.out.println(pets);
       System.out.println(isStudent);

       // To store groups of data in a single variable, we use arrays
       String[] names = {"Andre", "Karl", "Rashida", "Olivia"};
       // The entire array can be accessed by using forloop
      for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
       }

      // To log a single element, we use the name of the array with the index in brackets
     System.out.println(names[1]); 

     // Arrays are zero-indexed, so the index of first element in the array is 0
     System.out.println(names[0]); 

      // We can also use index to replace data in an array
    // Returns "Olivia"
    System.out.println(names[3]);

     //Replaces "Olivia" with "Carter"
     names[3] = "Carter"; 

     // Logs "Carter"
     System.out.println(names[3]);

     // We use the array's length property to determine how many elements are in the array
     System.out.println(names.length);

  }
}