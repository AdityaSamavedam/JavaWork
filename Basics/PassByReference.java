package Basics;

class MyObject {
    int value;

    public MyObject(int value) {
        this.value = value;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        MyObject obj = new MyObject(5);
        modifyObject(obj);
        System.out.println("After modifyObject: " + obj.value); // Output: 10
        reassignObject(obj);
        System.out.println("After reassignObject: " + obj.value); // Output: 10
    }

    public static void modifyObject(MyObject obj) {
        obj.value = 10; // This changes the original object's value
    }

    public static void reassignObject(MyObject obj) {
        obj = new MyObject(20); // This does not change the original reference
    }
}

