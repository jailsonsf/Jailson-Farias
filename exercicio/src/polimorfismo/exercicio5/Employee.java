package polimorfismo.exercicio5;

public abstract class Employee
{
    private String name;
    private String cpf;
    private String rg;

    public abstract double calculateGain();

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public void setCPF (String cpf)
    {
        this.cpf = cpf;
    }

    public String getCPF ()
    {
        return cpf;
    }

    public void setRG (String rg)
    {
        this.rg = rg;
    }

    public String getRG ()
    {
        return rg;
    }

}