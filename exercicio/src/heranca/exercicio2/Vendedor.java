package heranca.exercicio2;

public class Vendedor extends Empregado
{

    private float comissao;

    public Vendedor (String nome, float salario, float perComissao)
    {
        super(nome, salario);
        setComissao(perComissao);
    }

    public float calcularSalario()
    {
        return getSalario() + (getSalario() * (comissao / 100));
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + "\n" +
        "Salário s/ comissão: R$ " + getSalario() + "\n" +
        "Salário c/ comissão: R$ " + calcularSalario() + "\n" +
        "Porcentageem de comissão: " + getComissao();

    }

    public void setComissao(float comissao)
    {
        this.comissao = comissao;
    }

    public float getComissao()
    {
        return comissao;
    }

    @Override
    public void setNome (String nome)
    {
        this.nome = nome;
    }

    @Override
    public String getNome()
    {
        return nome;
    }

    @Override
    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    @Override
    public float getSalario()
    {
        return salario;
    }

}