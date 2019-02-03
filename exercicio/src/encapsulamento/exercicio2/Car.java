package encapsulamento.exercicio2;

public class Car
{

    private String brand;
    private String color;
    private int year;

    public Car ( String brand, String color, int year)
    {
        setBrand (brand);
        setColor (color);
        setYear (year);
    }

    public void setBrand ( String brand)
    {
        this.brand = brand;
    }

    public void setColor ( String color)
    {
        this.color = color;
    }

    public void setYear ( int year)
    {
        this.year = year;
    }

    public String getBrand ()
    {
        return brand;
    }

    public String getColor ()
    {
        return color;
    }

    public int getYear ()
    {
        return year;
    }

}