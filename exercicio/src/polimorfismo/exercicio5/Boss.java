package polimorfismo.exercicio5;

public class Boss extends Employee
{
    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    @Override
    public double calculateGain ()
    {
        return getMonthlySalary();
    }
}