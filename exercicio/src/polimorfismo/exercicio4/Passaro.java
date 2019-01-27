package polimorfismo.exercicio4;

public class Passaro extends Ave
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
        System.out.println(getNome() + " voou devagar");
    }

    @Override
    public void alimentar ()
    {
        System.out.println(getNome() + " comeu minhocas");
    }
}