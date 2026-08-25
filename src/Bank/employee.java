package Bank;

//import java.util.*;
public class employee {
    String name;
    int id;
    double salary;
    String designation;
    public void display(){
        System.out.println("Name of the Employee : "+name);
        System.out.println("ID of the Employee : "+id);
        System.out.println("Salary of the Employee : "+salary);
        System.out.println("Designation of the Employee : "+designation);
    }
    public static void main(String[] args){
       employee ob = new employee();
       ob.display();
    }
}
