public class Panel extends Inicjalizacja
{

    Program program;

    public Panel()
    {
        super("Panel przedni");
    }

    public void run()
    {
        super.run();
        program = new Program();
    }

}
