package heranca.exercicio1;

public class Ingresso
{

  private float valor;
  public Ingresso ( float valor )
  {
    setValor ( valor );
  }

  public void setValor(float valor)
  {
    this.valor = valor;
  }

  public float getValor()
  {
    return valor;
  }

  @Override
  public String toString()
  {
    return "Ingresso: R$ " + getValor();
  }
  
}