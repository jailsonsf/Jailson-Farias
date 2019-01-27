package polimorfismo.exercicio5;

public class TrabalhadorComissionado extends Empregado
{
    private double salario;
    private double comissao;
    private double qtdVendas;

    public void setSalario (double salario)
    {
        this.salario = salario;
    }

    public double getSalario ()
    {
        return salario;
    }

    public void setComissao (double comissao)
    {
        this.comissao = comissao;
    }

    public double getComissao ()
    {
        return comissao;
    }

    public void setQtdVendas (double qtdVendas)
    {
        this.qtdVendas = qtdVendas;
    }

    public double getQtdVendas ()
    {
        return qtdVendas;
    }

    @Override
    public double calcularGanho ()
    {
        return getSalario() + (getComissao() * getQtdVendas());
    }
}