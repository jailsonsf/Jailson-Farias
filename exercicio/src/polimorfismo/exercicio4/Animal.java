package polimorfismo.exercicio4;

public abstract class Animal
{

    private String description;
    private String name;

    public abstract void move ();
    public abstract void eat ();

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getDescription ()
    {
        return getName() + " é um animal";
    }

    public String getDescription2 ()
    {
        return description;
    }

    public void setName (String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    

}