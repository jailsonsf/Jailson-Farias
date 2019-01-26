package heranca.exercicio3;

public class Main
{
    public static void main(String[] args)
    {

        Recursivo r = new Recursivo();
        Iterativo i = new Iterativo();

        System.out.println("Recursivo: " + r.calcular(5));
        System.out.println("Iterativo: " + i.calcular(6));
    }
}