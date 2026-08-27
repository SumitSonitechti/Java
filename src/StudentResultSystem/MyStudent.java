package StudentResultSystem;

public class MyStudent {
    public static void main(String[] args) {
        Student ob=new Student("Sumit");
        try{
            ob.setMarks(99);
            System.out.println("Marks accepted "+ob.marks);
        }
        catch (MarksException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Result processing completed.");
        }
    }
}
