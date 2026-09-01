package Threading;

public class MyMain {
    public static void main(String[] args){
        Even e = new Even();
        Odd o = new Odd();
        e.setName("Even Thread");
        System.out.println(e.getName());
        System.out.println(e.getPriority());
        e.setPriority(10);
        o.setName("Odd Thread");
        System.out.println(e.getPriority());
        e.start();
        o.start();
    }
}
