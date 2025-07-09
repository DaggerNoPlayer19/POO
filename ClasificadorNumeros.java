import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasificadorNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("--- Clasificador de Numeros ---");
        System.out.print("Ingresa un numero entero: ");

        try {
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El numero " + numero + " es POSITIVO.");
            } else if (numero < 0) {
                System.out.println("El numero " + numero + " es NEGATIVO.");
            } else {
                System.out.println("El numero es CERO.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida. Por favor, ingresa un numero entero.");
        } finally {
            scanner.close();
        }
    }
}