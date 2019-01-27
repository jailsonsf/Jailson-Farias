package polimorfismo.exercicio5;

public class TrabalhadorProducao extends Empregado
{
    private double remuneracao;
    private int qtdProduzida;

    @Override
    public double calcularGanho ()
    {
        return getRemuneracao() * getQtdProduzida();
    }

    public void setRemuneracao (double remuneracao)
    {
        this.remuneracao = remuneracao;
    }

    public double getRemuneracao ()
    {
        return remuneracao;
    }

    public void setQtdProduzida (int qtdProduzida)
    {
        this.qtdProduzida = qtdProduzida;
    }

    public int getQtdProduzida ()
    {
        return qtdProduzida;
    }
}