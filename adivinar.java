import java.util.Scanner;
import java.util.Random;

public class adivinar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secreto = random.nextInt(100) + 1;
        int intentos = 5;
        boolean adivinado = false;

        System.out.println("Adivina el número secreto entre 1 y 100. Tienes 5 intentos.");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": ");
            int guess = scanner.nextInt();

            if (guess == secreto) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                adivinado = true;
                break;
            } else if (guess < secreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, no has adivinado el número. Era: " + secreto);
        }

        scanner.close();
    }
}