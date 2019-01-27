package polimorfismo.exercicio5;

public abstract class Empregado
{
    private String nome;
    private String cpf;
    private String rg;

    public abstract double calcularGanho();

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome ()
    {
        return nome;
    }

    public void setCPF (String cpf)
    {
        this.cpf = cpf;
    }

    public String getCPF ()
    {
        return cpf;
    }

    public void setRG (String rg)
    {
        this.rg = rg;
    }

    public String getRG ()
    {
        return rg;
    }

}