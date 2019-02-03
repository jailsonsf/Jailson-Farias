package heranca.exercicio4;

public class Property
{
    public Property (String address, float price)
    {
        setAddress(address);
        setPrice(price);
    }

    private String address;
    private float price;

    public void setAddress( String address )
    {
        this.address = address;
    }

    public void setPrice( float price )
    {
        this.price = price;
    }

    public String getAddress()
    {
        return address;
    }

    public float getPrice()
    {
        return price;
    }
}