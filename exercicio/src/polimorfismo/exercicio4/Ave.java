package polimorfismo.exercicio4;

public abstract class Ave extends Animal
{
    @Override
    public abstract void locomover ();

    @Override
    public abstract void alimentar ();

    @Override
    public String getDescricao()
    {
        return getNome() + " é uma ave";
    }
}