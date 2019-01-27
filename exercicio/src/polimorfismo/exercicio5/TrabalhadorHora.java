package polimorfismo.exercicio5;

public class TrabalhadorHora extends Empregado
{
    private double salarioHora;
    private int qtdHoras;

    @Override
    public double calcularGanho ()
    {
        return getSalarioHora() * getQtdHoras();
    }

    public void setSalarioHora (double salarioHora)
    {
        this.salarioHora = salarioHora;
    }

    public double getSalarioHora ()
    {
        return salarioHora;
    }

    public void setQtdHoras (int qtdHoras)
    {
        this.qtdHoras = qtdHoras;
    }

    public double getQtdHoras ()
    {
        return qtdHoras;
    }
}