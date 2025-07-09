import java.util.Scanner;
public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu calificación: ");
        int calificacion = scanner.nextInt();
        if (calificacion >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        scanner.close();
    }
}