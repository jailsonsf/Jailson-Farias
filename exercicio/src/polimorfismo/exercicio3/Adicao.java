package polimorfismo.exercicio3;

import java.util.ArrayList;

public class Adicao implements Operacao
{
    @Override
    public float calcular (float num1, float num2)
    {
        return num1 + num2;
    }

    @Override
    public float calcular (ArrayList<Float> numeros)
    {
        float resultado = 0;

        for (int i = 0; i < numeros.size(); i ++)
        {
            resultado += numeros.get(i);
        }

        return resultado;
    }
    
}