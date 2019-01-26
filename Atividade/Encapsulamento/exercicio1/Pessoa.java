package Encapsulamento.exercicio1;

public class Pessoa
{

    public Pessoa (String nome, String sobrenome, int idade, String cpf)
    {
        setNome (nome);
        setSobrenome (sobrenome);
        setIdade (idade);
        setCPF (cpf);
        
    }

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public void setNome ( String nome)
    {
        this.nome = nome;
    }

    public void setSobrenome ( String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public void setCPF ( String cpf)
    {
        this.cpf = cpf;
    }

    public void setIdade ( int idade)
    {
        this.idade = idade;
    }

    public String  getNome ()
    {
        return nome;
    }

    public String getSobrenome ()
    {
        return sobrenome;
    }

    public String getCPF ()
    {
        return cpf;
    }

    public int getIdade ()
    {
        return idade;
    }

    public String getNomeCompleto ()
    {
        return nome + " " + sobrenome;
    }
    
}