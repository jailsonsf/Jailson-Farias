package heranca.exercicio2;

public class Salesman extends Employee
{

    private float commission;

    public Salesman (String name, float salary, float perCommission)
    {
        super(name, salary);
        setCommission(perCommission);
    }

    public float calculateSalary()
    {
        return getSalary() + (getSalary() * (commission / 100));
    }

    @Override
    public String toString()
    {
        return "Nome: " + getName() + "\n" +
        "Salário s/ comissão: R$ " + getSalary() + "\n" +
        "Salário c/ comissão: R$ " + calculateSalary() + "\n" +
        "Porcentageem de comissão: " + getCommission();

    }

    public void setCommission(float commission)
    {
        this.commission = commission;
    }

    public float getCommission()
    {
        return commission;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    @Override
    public float getSalary()
    {
        return salary;
    }

}