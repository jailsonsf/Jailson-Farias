package heranca.exercicio2;

public class Manager extends Employee
{

    private String department;

    public Manager(String name, float salary, String department)
    {
        super(name, salary);
        setDepartment(department);
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

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getName() + "\n"
         + "Salário: R$ " + getSalary() + "\n"
          + "Dpt. " + getDepartment();
    }

}