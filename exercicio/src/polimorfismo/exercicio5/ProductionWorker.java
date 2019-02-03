package polimorfismo.exercicio5;

public class ProductionWorker extends Employee
{
    private double remuneration;
    private int qtdProduction;

    @Override
    public double calculateGain ()
    {
        return getRemuneration() * getQtdProduction();
    }

    public void setRemuneration(double remuneration)
    {
        this.remuneration = remuneration;
    }

    public double getRemuneration ()
    {
        return remuneration;
    }

    public void setQtdProduction (int qtdProduction)
    {
        this.qtdProduction = qtdProduction;
    }

    public int getQtdProduction ()
    {
        return qtdProduction;
    }
}