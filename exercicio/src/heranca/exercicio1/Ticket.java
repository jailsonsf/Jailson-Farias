package heranca.exercicio1;

public class Ticket
{

  private float value;
  public Ticket ( float value )
  {
    setValue (value);
  }

  public void setValue(float value)
  {
    this.value = value;
  }

  public float getValue()
  {
    return value;
  }

  @Override
  public String toString()
  {
    return "Ingresso: R$ " + getValue();
  }
  
}