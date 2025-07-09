import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreEstudiante;
        double promedioEstudiante;

        System.out.println("--- Registro de Estudiantes ---");

        System.out.print("Ingresa el nombre del estudiante: ");
        nombreEstudiante = scanner.nextLine();

        System.out.print("Ingresa el promedio del estudiante (ej. 75.5): ");
        try {
            promedioEstudiante = scanner.nextDouble();

            if (promedioEstudiante >= 0 && promedioEstudiante <= 100) {
                Estudiante estudiante = new Estudiante(nombreEstudiante, promedioEstudiante);
                estudiante.mostrarEstado();
            } else {
                System.out.println("Promedio invalido. Debe estar entre 0 y 100.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida para el promedio. Por favor, ingresa un numero.");
        } finally {
            scanner.close();
        }
    }
}