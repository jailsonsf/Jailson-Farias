package heranca.exercicio2;

public class Employee
{

    protected String name;
    protected float salary;

    public Employee(String name, float salary)
    {
        setName(name);
        setSalary(salary);
    }

    public void setName ( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSalary ( float salary )
    {
        this.salary = salary;
    }

    public float getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getName() + "\n" + "Salário: R$ " + getSalary();
    }
}