package encapsulamento.exercicio1;

public class Person
{

    public Person (String name, String lastName, int age, String cpf)
    {
        setName (name);
        setLastName (lastName);
        setAge (age);
        setCPF (cpf);
        
    }

    private String name;
    private String lastName;
    private int age;
    private String cpf;

    public void setName ( String name)
    {
        this.name = name;
    }

    public void setLastName ( String lastName)
    {
        this.lastName = lastName;
    }

    public void setCPF ( String cpf)
    {
        this.cpf = cpf;
    }

    public void setAge ( int age)
    {
        this.age = age;
    }

    public String  getName ()
    {
        return name;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public String getCPF ()
    {
        return cpf;
    }

    public int getAge ()
    {
        return age;
    }

    public String getFullName ()
    {
        return name + " " + lastName;
    }
    
}