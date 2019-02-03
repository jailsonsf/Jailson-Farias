package polimorfismo.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Division d = new Division();
        Multiplication m = new Multiplication();

        Scanner in = new Scanner(System.in);
        ArrayList<Float> numbers = new ArrayList<Float>();

        float num = 1;

        while (num != 0)
        {
            num = in.nextFloat();

            if (num != 0)
            {
                numbers.add(num);
            }
        }

        in.close();

        if (numbers.size() == 2)
        {
            System.out.println("Soma: " + a.calculate(numbers.get(0), numbers.get(1)));
            System.out.println("Subtração: " + s.calculate(numbers.get(0), numbers.get(1)));
            System.out.println("Divisão: " + d.calculate(numbers.get(0), numbers.get(1)));
            System.out.println("Multiplicação: " + m.calculate(numbers.get(0), numbers.get(1)));

        } else {
        	
            System.out.println("Soma: " + a.calculate(numbers));
            System.out.println("Subtração: " + s.calculate(numbers));
            System.out.println("Divisão: " + d.calculate(numbers));
            System.out.println("Multiplicação: " + m.calculate(numbers));
            
        }

    }
}