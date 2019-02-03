package polimorfismo.exercicio2;

public class Main
{
    public static void main (String[] args)
    {
        Employee g = new Employee();
        g.setFunction("atendente");

        String name = "Zezinho";

        if (g.getFunction().equals("gerente"))
        {
            g = new Manager();
            g.setName(name);
        } else if (g.getFunction().equals("atendente")) {

            g = new Attendant();
            g.setName(name);
        }

        System.out.println(g);
    }
}