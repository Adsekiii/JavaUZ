public class Pralka {
    Bęben bęben;
    Czujnik cisnienie;
    Czujnik temperatury;
    Czujnik poziomuWody;

    Elektrozawor elektrozawor;
    FiltrWody filtrWody;
    GralkaDoWody gralkaDoWody;
    Panel panel;
    PojemnikNaDetergenty pojemnikNaDetergenty;
    PompaWodna pompaWodna;
    SilnikInwerterowy silnikInwerterowy;
    Sterownik sterownik;


    public Pralka()
    {
        panel = new Panel();
        panel.run();
        bęben = new Bęben();
        bęben.run();
        pojemnikNaDetergenty = new PojemnikNaDetergenty();
        pojemnikNaDetergenty.wsypProszek();
        pojemnikNaDetergenty.wlejPlyn();
        elektrozawor = new Elektrozawor();
        elektrozawor.run();
        cisnienie = new Czujnik("cisnienie");
        cisnienie.run();
        temperatury = new Czujnik("temperatury");
        temperatury.run();
        poziomuWody = new Czujnik("poziomuWody");
        poziomuWody.run();
        filtrWody = new FiltrWody();
        filtrWody.run();
        gralkaDoWody = new GralkaDoWody();
        gralkaDoWody.run();
        pompaWodna = new PompaWodna();
        pompaWodna.run();
        silnikInwerterowy = new SilnikInwerterowy();
        silnikInwerterowy.run();
        sterownik = new Sterownik();
        sterownik.run();
        poziomuWody.run();
        bęben.wyjmijPranie();
    }
}
