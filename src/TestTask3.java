import task3.Rational;

import java.util.Arrays;
import java.util.Random;

public class TestTask3 {

    public static void main(String[] args) {

        Rational[] arr = new Rational[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            long numerator = random.nextInt(100) + 1;
            long denominator = random.nextInt(99) + 1;
            arr[i] = new Rational(numerator, denominator);
        }

        Arrays.sort(arr);

        Rational min = arr[0];
        Rational max = arr[arr.length - 1];

        Rational sum = new Rational(0, 1);
        for (Rational r : arr) {
            sum = sum.add(r);
        }

        Rational product = new Rational(1, 1);
        for (Rational r : arr) {
            product = product.multiply(r);
        }

        Rational difference = max.subtract(min);
        Rational division = max.divide(min);

        System.out.println("Min rational: " + min);
        System.out.println("Max rational: " + max);

        System.out.println("Sum of all rationals: " + sum);
        System.out.println("Product of all rationals: " + product);

        System.out.println("Difference (max - min): " + difference);
        System.out.println("Division (max / min): " + division);
    }
}

