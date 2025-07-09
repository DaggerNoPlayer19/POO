import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificacion;
        double sumaCalificaciones = 0;
        int contadorCalificaciones = 0;

        System.out.println("Ingresa calificaciones entre 0 y 10 (ingresa un numero negativo para terminar):");

        while (true) {
            System.out.print("Calificacion: ");
            calificacion = scanner.nextDouble();

            if (calificacion < 0) {
                break;
            }

            if (calificacion >= 0 && calificacion <= 10) {
                sumaCalificaciones += calificacion;
                contadorCalificaciones++;
            } else {
                System.out.println("Calificacion invalida. Debe estar entre 0 y 10.");
            }
        }

        if (contadorCalificaciones > 0) {
            double promedio = sumaCalificaciones / contadorCalificaciones;
            System.out.printf("El promedio de las %d calificaciones ingresadas es: %.2f%n", contadorCalificaciones, promedio);
        } else {
            System.out.println("No se ingresaron calificaciones validas para calcular el promedio.");
        }

        scanner.close();
    }
}
