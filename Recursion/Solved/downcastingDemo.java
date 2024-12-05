package Recursion.Solved;

import java.util.ArrayList;

class Device {
    public void powerOn() {
        System.out.println("Powering on device");
    }
}

class Laptop extends Device{
    @Override
    public void powerOn() {
        System.out.println("Powering on laptop");
    }
    
    public void osVersion() {
        System.out.println("Windows 11");
    }
}

class Phone extends Device {
    @Override
    public void powerOn() {
        System.out.println("Powering on phone");
    }

    public void callPhone() {
        System.out.println("Calling phone...");
    }
}

public class downcastingDemo {
    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList<>();
        devices.add(new Laptop());
        devices.add(new Phone());
        for (Device eachDevice : devices) {
            eachDevice.powerOn();
            if (eachDevice instanceof Laptop) {
                Laptop laptop = (Laptop) eachDevice;
                laptop.osVersion();
            }
            else if (eachDevice instanceof Phone) {
                Phone phone = (Phone) eachDevice;
                phone.callPhone();
            }
        }
    }
}   