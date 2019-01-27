package heranca.exercicio3;

public class Iterativo implements Fatorial
{

    private int fatorial;

    @Override
    public int calcular (int numero)
    {
        if (numero == 0 || numero == 1)
        {
            return 1;
        } else {

            fatorial = numero;

            for (int i = 2; i < numero; i ++)
            {
                fatorial *= i;
            }

            return fatorial;
        }
    }
}