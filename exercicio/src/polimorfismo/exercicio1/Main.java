package polimorfismo.exercicio1;

public class Main
{
    public static void main (String[] args)
    {

        Employee f = new Employee("juquinha", "123.456.789-10", "juquinha@gmail.com", 1, "01/02/1988", "vendedor", "juquinha123");

        System.out.println(f.Login("juquinha@gmail.com", "juquinha123"));

        System.out.println(f.Login(1, "juquinha123"));
    }
}