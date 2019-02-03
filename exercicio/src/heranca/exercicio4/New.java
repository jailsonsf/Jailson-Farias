package heranca.exercicio4;

public class New extends Property
{

    private float additional;
    public New( String address, float price, float additional )
    {
        super(address, price);
        setAdditional(additional);
    }

    public void setAdditional(float additional)
    {
        this.additional = additional;
    }

    public float getAdditional()
    {
        return additional;
    }

    @Override
    public String toString()
    {
        return "Preço Imovel Novo: R$ " + ( getPrice() + getAdditional() );
    }
}