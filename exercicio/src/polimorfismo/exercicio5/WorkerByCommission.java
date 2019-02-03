package polimorfismo.exercicio5;

public class WorkerByCommission extends Employee
{
    private double salary;
    private double comission;
    private double qtdSales;

    @Override
    public double calculateGain ()
    {
        return getSalary() + (getComission() * getQtdSales());
    }

    public void setSalario (double salary)
    {
        this.salary = salary;
    }

    public double getSalary ()
    {
        return salary;
    }

    public void setComission (double comission)
    {
        this.comission = comission;
    }

    public double getComission ()
    {
        return comission;
    }

    public void setQtdSales (double qtdSales)
    {
        this.qtdSales = qtdSales;
    }

    public double getQtdSales ()
    {
        return qtdSales;
    }
}