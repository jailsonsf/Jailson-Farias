package heranca.exercicio4;

public class Imovel
{
    public Imovel (String endereco, float preco)
    {
        setEndereco(endereco);
        setPreco(preco);
    }

    private String endereco;
    private float preco;

    public void setEndereco( String endereco )
    {
        this.endereco = endereco;
    }

    public void setPreco( float preco )
    {
        this.preco = preco;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public float getPreco()
    {
        return preco;
    }
}