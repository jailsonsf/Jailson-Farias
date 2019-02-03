package polimorfismo.exercicio3;

import java.util.ArrayList;

public interface Operation
{
    public float calculate (float num1, float num2);
    public float calculate (ArrayList<Float> numeros);
}