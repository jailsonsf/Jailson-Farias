package heranca.exercicio2;

public class Empregado
{

    protected String nome;
    protected float salario;

    public Empregado(String nome, float salario)
    {
        setNome(nome);
        setSalario(salario);
    }

    public void setNome ( String nome )
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setSalario ( float salario )
    {
        this.salario = salario;
    }

    public float getSalario()
    {
        return salario;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + "\n" + "Salário: R$ " + getSalario();
    }
}