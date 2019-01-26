package Encapsulamento.exercicio2;

public class Carro
{

    private String marca;
    private String cor;
    private String ano;

    public Carro ( String marca, String cor, int ano)
    {
        setMarca (marca);
        setCor (cor);
        setAno (ano);
    }

    public void setMarca ( String marca)
    {
        this.marca = marca;
    }

    public void setCor ( String cor)
    {
        this.cor = cor;
    }

    public void setAno ( int ano)
    {
        this.ano = ano;
    }

    public String getMarca ()
    {
        return marca;
    }

    public String getCor ()
    {
        return cor;
    }

    public int getAno ()
    {
        return ano;
    }
}