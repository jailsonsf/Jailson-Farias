package polimorfismo.exercicio2;

public class Main
{
    public static void main (String[] args)
    {
        Funcionario g = new Funcionario();
        g.setFuncao("atendente");

        String nome = "Zezinho";

        if (g.getFuncao().equals("gerente"))
        {
            g = new Gerente();
            g.setNome(nome);
        } else if (g.getFuncao().equals("atendente")) {

            g = new Atendente();
            g.setNome(nome);
        }

        System.out.println(g);
    }
}