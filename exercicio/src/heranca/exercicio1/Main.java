package heranca.exercicio1;

public class Main
{
    public static void main (String[] args)
    {
        Ingresso i = new Ingresso(10);
        IngressoVIP iVip = new IngressoVIP(10, 5);

        System.out.println(i);
        System.out.println(iVip);
    }
}