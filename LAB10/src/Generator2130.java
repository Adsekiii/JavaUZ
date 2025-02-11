import java.util.Random;

public class Generator2130 extends Thread{
    public void run()
    {
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            int r = rand.nextInt(20+1) - 10;
            System.out.println("Wątek " + this.getName() + " wygenerował liczbę: " + r);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
