package polimorfismo.exercicio2;

public class Funcionario
{

    private String nome;
    private String cpf;
    private String email;
    private int registro;
    private String dataNascimento;
    private String funcao;
    private String senha;

    public String realizarLogin (String email, String senha)
    {
        return "Realizando Login com email";
    }

    public String realizarLogin (int registro, String senha)
    {
        return "Realizando Login com registro";
    }

    public Funcionario (String nome, String cpf, String email, 
        int registro, String dataNascimento, 
        String funcao, String senha) {

            setNome(nome);
            setCPF(cpf);
            setEmail(email);
            setRegistro(registro);
            setDataNasc(dataNascimento);
            setFuncao(funcao);
            setSenha(senha);

    }

    public Funcionario(){}

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

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setRegistro (int registro)
    {
        this.registro = registro;
    }

    public int getRegistro ()
    {
        return registro;
    }

    public void setDataNasc (String dataNasc)
    {
        this.dataNascimento = dataNasc;
    }

    public String getDataNasc ()
    {
        return dataNascimento;
    }

    public void setFuncao (String funcao)
    {
        this.funcao = funcao;
    }

    public String getFuncao ()
    {
        return funcao;
    }

    public void setSenha (String senha)
    {
        this.senha = senha;
    }

    public String getSenha ()
    {
        return senha;
    }

}