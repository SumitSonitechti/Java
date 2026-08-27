package StudentResultSystem;

public class Student {
    String name;
    int marks;
    Student(String name){
        this.name=name;
//        this.marks=marks;
    }
    public void setMarks(int marks)throws MarksException{
        if (marks<0 || marks>100)
        {
            throw new MarksException("Invalid marks");
        }
        else{
            this.marks=marks;

        }

    }
}
