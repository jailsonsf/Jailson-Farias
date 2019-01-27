package polimorfismo.exercicio4;

public class Macaco extends Mamifero
{
    private String tipo;

    public void setTipo (String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo ()
    {
        return tipo;
    }

    @Override
    public void locomover ()
    {
        System.out.println(getNome() + " pulou de galho em galho");
    }

    @Override
    public void alimentar ()
    {
        System.out.println(getNome() + " comeu várias bananas");
    }
}