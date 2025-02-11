public class Kalkulator {
    int a,b,c,d,e,f,g;
    public Kalkulator(int a)
    {
        this.a=a;
    }
    public Kalkulator(int a, int b, int c, int d)
    {
        this(a);
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public Kalkulator(int a, int b, int c, int d, int e, int f, int g)
    {
        this(a,b,c,d);
        this.e=e;
        this.f=f;
        this.g=g;
    }
    public Kalkulator(Kalkulator k)
    {
        this(k.a,k.b,k.c,k.d,k.e,k.f,k.g);
    }
    int dodawanie()
    {
        return a+b+c+d+e+f+g;
    }
}
