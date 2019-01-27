package heranca.exercicio4;

public class Main
{
    public static void main(String[] args)
    {
        Imovel n = new Novo("Rua Comum", 45000, 5000);
        Imovel v = new Velho("Rua Comum", 50000, 5000);

        System.out.println(n);
        System.out.println(v);
    }
}