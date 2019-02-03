package polimorfismo.exercicio3;

import java.util.ArrayList;

public class Addition implements Operation
{
    @Override
    public float calculate (float num1, float num2)
    {
        return num1 + num2;
    }

    @Override
    public float calculate (ArrayList<Float> numbers)
    {
        float result = 0;

        for (int i = 0; i < numbers.size(); i ++)
        {
            result += numbers.get(i);
        }

        return result;
    }
    
}