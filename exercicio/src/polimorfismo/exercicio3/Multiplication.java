package polimorfismo.exercicio3;

import java.util.ArrayList;

public class Multiplication implements Operation
{
    @Override
    public float calculate (float num1, float num2)
    {
        return num1 * num2;
    }

    @Override
    public float calculate (ArrayList<Float> numbers)
    {
        float result = numbers.get(0);

        for (int i = 1; i < numbers.size(); i ++)
        {
            result *= numbers.get(i);
        }

        return result;
    }
}