package heranca.exercicio3;

public class Recursive implements Factorial
{

    @Override
    public int calcular(int number)
    {
        if (number == 1)
        {
            return number;
        } else {
            return number *= calcular(number - 1);
        }
    }
}