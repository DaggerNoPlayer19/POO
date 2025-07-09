import java.util.ArrayList;
import java.util.Scanner;

public class numprimgem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }

        for (int i = 0; i < primos.size() - 1; i++) {
            if (primos.get(i + 1) - primos.get(i) == 2) {
                System.out.println(primos.get(i) + " y " + primos.get(i + 1) + " son primos gemelos.");
            }
        }
        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}