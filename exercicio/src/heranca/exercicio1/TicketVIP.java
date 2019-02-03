package heranca.exercicio1;

public class TicketVIP extends Ticket
{

    private float additional;

    public TicketVIP(float value, float additional)
    {
        super(value);
        setAdicional(additional);
    }

    public void setAdicional(float additional)
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
        return "Ingresso VIP: R$ " + (super.getValue() + getAdditional());
    }

    @Override
    public float getValue()
    {
        return super.getValue() + getAdditional();
    }
}