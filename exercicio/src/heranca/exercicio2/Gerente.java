package heranca.exercicio2;

public class Gerente extends Empregado
{

    private String departamento;

    public Gerente(String nome, float salario, String departamento)
    {
        super(nome, salario);
        setDepartamento(departamento);
    }

    @Override
    public void setNome(String nome)
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

    public void setDepartamento(String depart)
    {
        this.departamento = depart;
    }

    public String getDepartamento()
    {
        return departamento;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + "\n"
         + "Salário: R$ " + getSalario() + "\n"
          + "Dpt. " + getDepartamento();
    }

}