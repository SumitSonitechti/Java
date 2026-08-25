//Total Marks: 10
//Scenario: A transport company wants to represent different types of vehicles. All vehicles have a brand and speed, while a car additionally has the number of doors.
//        (a) Create a superclass Vehicle with protected data members brand and speed, and a parameterized constructor. [3]
//        (b) Create a subclass Car that inherits from Vehicle and contains an additional data member numberOfDoors. [3]
//        (c) Use super() to initialize the superclass fields and create a method display() to display all details. [2]
//        (d) Complete the classes using the driver code. [2]
package PractiseQue4.PractiseQue4;

class Car extends Vehicle
{
    int numberOfDoors;
    Car(String brand,int speed,int numberOfDoors){
        super(brand,speed);
        this.numberOfDoors=numberOfDoors;
    }
    void display(){
        System.out.println("speed is:"+brand);
        System.out.println("speed is:"+speed);
        System.out.println("speed is:"+numberOfDoors);
    }
}