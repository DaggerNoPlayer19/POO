import java.util.Scanner;
public class Naturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int numero = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);

        scanner.close();
    }
}