import java.util.InputMismatchException;
import java.util.Scanner;

public class ContadorDeNotas {
    public static void main(String[] args) {
        System.out.println("=== Ejecutando: Contador de Notas ===");
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3;

        try {
            System.out.print("Ingrese la nota 1 (0-100): ");
            nota1 = scanner.nextDouble();
            System.out.print("Ingrese la nota 2 (0-100): ");
            nota2 = scanner.nextDouble();
            System.out.print("Ingrese la nota 3 (0-100): ");
            nota3 = scanner.nextDouble();

            double promedio = (nota1 + nota2 + nota3) / 3;
            System.out.printf("El promedio de las notas es: %.2f%n", promedio);

            if (promedio >= 70) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: REPROBADO");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida. Por favor, ingrese un numero para las notas.");
            // No cerramos el scanner aqui porque MenuPrincipal lo maneja.
            // En un programa independiente, cerrarias el scanner.
        } finally {
            // No cerrar scanner aqui, ya que es gestionado por MenuPrincipal
            // Si este fuera un programa standalone, aqui seria scanner.close();
        }
        System.out.println("=== Fin de Contador de Notas ===");
    }
}