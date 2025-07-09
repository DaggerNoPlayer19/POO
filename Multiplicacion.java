import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplicacion {
    // Metodo para realizar la operacion de multiplicacion
    public static void ejecutarOperacion(Scanner scanner) {
        System.out.println("\n--- Operacion: Multiplicacion ---");
        try {
            System.out.print("Ingresa el primer numero: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            double numero2 = scanner.nextDouble();
            double resultado = numero1 * numero2;
            System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un numero valido.");
            scanner.next(); // Limpia la entrada incorrecta del buffer
        }
    }

    // Metodo main opcional para ejecutar Multiplicacion.java de forma independiente
    public static void main(String[] args) {
        Scanner localScanner = new Scanner(System.in);
        ejecutarOperacion(localScanner);
        localScanner.close();
    }
}