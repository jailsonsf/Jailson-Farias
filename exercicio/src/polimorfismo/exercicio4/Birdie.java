package polimorfismo.exercicio4;

public class Birdie extends Bird
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
    public void move ()
    {
        System.out.println(getName() + " voou devagar");
    }

    @Override
    public void eat ()
    {
        System.out.println(getName() + " comeu minhocas");
    }
}