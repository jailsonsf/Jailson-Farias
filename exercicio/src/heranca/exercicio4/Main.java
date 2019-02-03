package heranca.exercicio4;

public class Main
{
    public static void main(String[] args)
    {
        Property n = new New("Rua Comum", 45000, 5000);
        Property v = new Old("Rua Comum", 50000, 5000);

        System.out.println(n);
        System.out.println(v);
    }
}