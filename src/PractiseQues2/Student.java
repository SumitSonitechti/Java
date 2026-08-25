package PractiseQues2;/* Student Result Management System
Total Marks: 10
Scenario: A school wants to maintain student information digitally. Each student has a name, roll number, and marks. The data should be protected from direct access. The school also wants to maintain the total number of students created.
(a) Design a class Student with private data members: name (String), rollNo (int), and marks (double). Provide public getter and setter methods. [4]
(b) Write a parameterized constructor to initialize all three fields. [2]
(c) Add a static variable studentCount that increases whenever a new student object is created. [2]
(d) Complete the class using the following driver code so that the expected output is produced. [2]
*/

public class Student
{
    private String name;
    private int rollNo;
    private double marks;
    public static int studentCount;

    Student(String name,int rollNo,double marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
        studentCount++;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void setMarks(double marks){
        this.marks=marks;
    }
    public double getMarks(){
        return marks;
    }
}

