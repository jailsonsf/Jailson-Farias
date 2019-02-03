package heranca.exercicio3;

public class Iterative implements Factorial
{

    private int factorial;

    @Override
    public int calcular (int number)
    {
        if (number == 0 || number == 1)
        {
            return 1;
        } else {

            factorial = number;

            for (int i = 2; i < number; i ++)
            {
                factorial *= i;
            }

            return factorial;
        }
    }
}