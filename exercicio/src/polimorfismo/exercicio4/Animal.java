package polimorfismo.exercicio4;

public abstract class Animal
{

    private String descricao;
    private String nome;

    public abstract void locomover ();
    public abstract void alimentar ();

    public void setDescricao (String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao ()
    {
        return getNome() + " é um animal";
    }

    public String getDescricao2 ()
    {
        return descricao;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    

}