package heranca.exercicio3;

public class Recursivo implements Fatorial
{

    @Override
    public int calcular(int numero)
    {
        if (numero == 1)
        {
            return numero;
        } else {
            return numero *= calcular(numero - 1);
        }
    }
}