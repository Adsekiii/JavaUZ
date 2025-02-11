public class Sterownik extends Inicjalizacja{
    public Sterownik()
    {
        super("Sterownik regulujący prędkość obrotową");
    }

    public void run()
    {
        super.run();
        System.out.println("Reguluję prędkość");
    }
}
