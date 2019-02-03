package polimorfismo.exercicio2;

public class Manager extends Employee
{
    @Override
    public String toString()
    {
        return getName() + " é gerente";
    }
}