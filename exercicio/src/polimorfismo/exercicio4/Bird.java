package polimorfismo.exercicio4;

public abstract class Bird extends Animal
{
    @Override
    public abstract void move ();

    @Override
    public abstract void eat ();

    @Override
    public String getDescription()
    {
        return getName() + " é uma ave";
    }
}