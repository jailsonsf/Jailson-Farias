package heranca.exercicio1;

public class IngressoVIP extends Ingresso
{

    private float adicional;

    public IngressoVIP(float valor, float adicional)
    {
        super(valor);
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
        return "Ingresso VIP: R$ " + (super.getValor() + getAdicional());
    }

    @Override
    public float getValor()
    {
        return super.getValor() + getAdicional();
    }
}