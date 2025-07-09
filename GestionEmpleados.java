import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionEmpleados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreEmpleado;
        double salarioEmpleado;

        System.out.println("--- Gestion de Empleados ---");

        System.out.print("Ingresa el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();

        System.out.print("Ingresa el salario del empleado (ej. 3500.75): ");
        try {
            salarioEmpleado = scanner.nextDouble();

            if (salarioEmpleado >= 0) {
                Empleado empleado = new Empleado(nombreEmpleado, salarioEmpleado);
                empleado.verificarSalarioCompetitivo();
            } else {
                System.out.println("El salario no puede ser negativo.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida para el salario. Por favor, ingresa un numero.");
        } finally {
            scanner.close();
        }
    }
}