package heranca.exercicio2;

public class Main
{
    public static void main (String[] args)
    {
        Employee g = new Manager("Zezinho", 5000, "Vendas");
        Employee v = new Salesman("Juquinha", 1500, 10);

        System.out.println("Gerente: \n" + g + "\n\n");
        System.out.println("Vendedor: \n" + v);
    }
}