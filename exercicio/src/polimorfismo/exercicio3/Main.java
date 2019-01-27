package polimorfismo.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        Adicao a = new Adicao();
        Subtracao s = new Subtracao();
        Divisao d = new Divisao();
        Multiplicacao m = new Multiplicacao();

        Scanner in = new Scanner(System.in);
        ArrayList<Float> numeros = new ArrayList<Float>();

        float num = 1;

        while (num != 0)
        {
            num = in.nextFloat();

            if (num != 0)
            {
                numeros.add(num);
            }
        }

        in.close();

        if (numeros.size() == 2)
        {
            System.out.println("Soma: " + a.calcular(numeros.get(0), numeros.get(1)));
            System.out.println("Subtração: " + s.calcular(numeros.get(0), numeros.get(1)));
            System.out.println("Divisão: " + d.calcular(numeros.get(0), numeros.get(1)));
            System.out.println("Multiplicação: " + m.calcular(numeros.get(0), numeros.get(1)));

        } else {
        	
            System.out.println("Soma: " + a.calcular(numeros));
            System.out.println("Subtração: " + s.calcular(numeros));
            System.out.println("Divisão: " + d.calcular(numeros));
            System.out.println("Multiplicação: " + m.calcular(numeros));
            
        }

    }
}