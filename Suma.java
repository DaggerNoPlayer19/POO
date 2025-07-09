import java.util.InputMismatchException; // Asegurate de importar esto
import java.util.Scanner;

public class Suma {
    // ESTE ES EL METODO QUE DEBES LLAMAR DESDE MenuCalculadora
    public static void ejecutarOperacion(Scanner scanner) {
        System.out.println("\n--- Operacion: Suma ---");
        try {
            System.out.print("Ingresa el primer numero: ");
            // No cierres el scanner aqui, ya que es el mismo que en MenuCalculadora
            double numero1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            double numero2 = scanner.nextDouble();
            double suma = numero1 + numero2; // Es mejor usar double para operaciones generales de calculadora
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un numero valido.");
            scanner.next(); // Limpia la entrada incorrecta del buffer
        }
    }

    // Puedes mantener el metodo main si quieres que Suma.java se pueda ejecutar de forma independiente
    // Pero MenuCalculadora NO lo llamara.
    public static void main(String[] args) {
        Scanner localScanner = new Scanner(System.in); // Scanner local para ejecucion independiente
        ejecutarOperacion(localScanner); // Llama al metodo de operacion
        localScanner.close(); // Cierra el scanner local
    }
}