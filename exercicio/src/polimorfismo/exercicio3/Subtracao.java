package polimorfismo.exercicio3;

import java.util.ArrayList;

public class Subtracao implements Operacao
{
    @Override
    public float calcular (float num1, float num2)
    {
        return num1 - num2;
    }

    @Override
    public float calcular (ArrayList<Float> numeros)
    {
        float resultado = numeros.get(0);

        for (int i = 1; i < numeros.size(); i ++)
        {
            resultado -= numeros.get(i);
        }

        return resultado;
    }
}