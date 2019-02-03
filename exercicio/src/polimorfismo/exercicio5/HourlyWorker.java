package polimorfismo.exercicio5;

public class HourlyWorker extends Employee
{
    private double hourSalary;
    private int qtdHours;

    @Override
    public double calculateGain ()
    {
        return getHourSalary() * getQtdHours();
    }

    public void setHourSalary (double hourSalary)
    {
        this.hourSalary = hourSalary;
    }

    public double getHourSalary()
    {
        return hourSalary;
    }

    public void setQtdHoras (int qtdHours)
    {
        this.qtdHours = qtdHours;
    }

    public double getQtdHours()
    {
        return qtdHours;
    }
}