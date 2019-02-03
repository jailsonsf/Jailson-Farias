package polimorfismo.exercicio4;

public abstract class Mammal extends Animal
{
    @Override
    public abstract void move ();

    @Override
    public abstract void eat ();

    @Override
    public String getDescription()
    {
        return getName() + " é um mamífero";
    }
}