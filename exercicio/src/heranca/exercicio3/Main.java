package heranca.exercicio3;

public class Main
{
    public static void main(String[] args)
    {
        Recursive r = new Recursive();
        Iterative i = new Iterative();

        System.out.println("Recursivo: " + r.calcular(5));
        System.out.println("Iterativo: " + i.calcular(6));
    }
}