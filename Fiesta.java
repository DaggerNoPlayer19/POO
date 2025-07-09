import java.util.Scanner;

public class Fiesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes entrar a la fiesta.");
        } else if (edad >= 16) {
            System.out.println("Puedes entrar a la fiesta con un permiso.");
        } else {
            System.out.println("No puedes entrar a la fiesta.");
        }
        scanner.close();
    }
}
