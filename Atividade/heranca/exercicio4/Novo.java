package heranca.exercicio4;

public class Novo extends Imovel
{

    private float adicional;
    public Novo( String endereco, float preco, float adicional )
    {
        super(endereco, preco);
        setAdicional(adicional);
    }

    public void setAdicional(float adicional)
    {
        this.adicional = adicional;
    }

    public float getAdicional()
    {
        return adicional;
    }

    @Override
    public String toString()
    {
        return "Preço Imovel Novo: R$ " + ( getPreco() + getAdicional() );
    }
}