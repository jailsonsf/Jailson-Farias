package polimorfismo.exercicio4;

public abstract class Mamifero extends Animal
{
    @Override
    public abstract void locomover ();

    @Override
    public abstract void alimentar ();

    @Override
    public String getDescricao()
    {
        return getNome() + " é um mamífero";
    }
}