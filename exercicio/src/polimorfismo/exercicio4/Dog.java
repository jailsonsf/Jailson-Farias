package polimorfismo.exercicio4;

public class Dog extends Mammal
{
    private String type;

    public void setType (String type)
    {
        this.type = type;
    }

    public String getType ()
    {
        return type;
    }

    @Override
    public void move()
    {
        System.out.println(getName() + " correu");
    }

    @Override
    public void eat ()
    {
        System.out.println(getName() + " comeu ração");
    }
}