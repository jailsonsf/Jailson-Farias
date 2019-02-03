package heranca.exercicio4;

public class Old extends Property
{

    private float discount;

    public Old( String address, float price, float discount )
    {
        super(address, price);
        setDiscount(discount);
    }

    public void setDiscount( float discount )
    {
        this.discount = discount;
    }

    public float getDiscount()
    {
        return discount;
    }

    @Override
    public String toString()
    {
        return "Preço Imovel Velho: R$ " + ( getPrice() - getDiscount());
    }
}