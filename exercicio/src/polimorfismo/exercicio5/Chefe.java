package polimorfismo.exercicio5;

public class Chefe extends Empregado
{
    private double salarioMensal;

    public void setSalarioMensal(double salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal()
    {
        return salarioMensal;
    }

    @Override
    public double calcularGanho ()
    {
        return getSalarioMensal();
    }
}