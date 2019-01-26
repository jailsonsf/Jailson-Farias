package heranca.exercicio2;

public class Main
{
    public static void main (String[] args)
    {
        Empregado g = new Gerente("Zezinho", 5000, "Vendas");
        Empregado v = new Vendedor("Juquinha", 1500, 10);

        System.out.println("Gerente: \n" + g + "\n\n");
        System.out.println("Vendedor: \n" + v);
    }

}