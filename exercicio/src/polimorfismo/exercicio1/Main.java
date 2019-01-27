package polimorfismo.exercicio1;

public class Main
{
    public static void main (String[] args)
    {

        Funcionario f = new Funcionario("juquinha", "123.456.789-10", "juquinha@gmail.com", 1, "01/02/1988", "vendedor", "juquinha123");

        System.out.println(f.realizarLogin("juquinha@gmail.com", "juquinha123"));

        System.out.println(f.realizarLogin(1, "juquinha123"));
    }
}