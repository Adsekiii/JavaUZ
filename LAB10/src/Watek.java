import java.util.Date;

public class Watek extends Thread{
    int threadID;
    static  int id = 0;
    public void run() {
        ++id;
        this.threadID = id;
        System.out.println("Thread id: " + this.threadID);
        System.out.println(new Date());
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("koniec działania");
    }
}
