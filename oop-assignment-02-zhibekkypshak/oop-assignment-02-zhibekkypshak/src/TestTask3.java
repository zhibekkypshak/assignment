import task3.Rational;
import java.util.Random;

public class TestTask3 {

    public static void main(String[] args) {

        Rational[] arr = new Rational[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            long num = rand.nextInt(100) + 1;
            long den = rand.nextInt(99) + 1;
            arr[i] = new Rational(num, den);
        }

        Rational min = arr[0];
        Rational max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        Rational sum = new Rational(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(arr[i]);
        }

        Rational product = new Rational(1, 1);
        for (int i = 0; i < arr.length; i++) {
            product = product.multiply(arr[i]);
        }

        Rational diff = max.subtract(min);
        Rational div = max.divide(min);

        System.out.println("Min rational: " + min);
        System.out.println("Max rational: " + max);
        System.out.println("Sum of all rationals: " + sum);
        System.out.println("Product of all rationals: " + product);
        System.out.println("Difference (max - min): " + diff);
        System.out.println("Division (max / min): " + div);
    }
}

