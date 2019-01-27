package heranca.exercicio4;

public class Velho extends Imovel
{

    private float desconto;

    public Velho( String endereco, float preco, float desconto )
    {
        super(endereco, preco);
        setDesconto(desconto);
    }

    public void setDesconto( float desconto )
    {
        this.desconto = desconto;
    }

    public float getDesconto()
    {
        return desconto;
    }

    @Override
    public String toString()
    {
        return "Preço Imovel Velho: R$ " + ( getPreco() - getDesconto());
    }
}