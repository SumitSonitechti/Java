package Threading;

public class Even extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
