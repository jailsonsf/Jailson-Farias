package polimorfismo.exercicio2;

public class Attendant extends Employee
{
    @Override
    public String toString ()
    {
        return getName() + " é atendente";
    }
}