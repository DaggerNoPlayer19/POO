import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(20) + 1;
        int adivinanza = 0;
        int intentos = 0;

        System.out.println("¡Estoy pensando en un numero entre 1 y 20!");

        while (adivinanza != numeroSecreto) {
            System.out.print("Adivina el numero: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroSecreto) {
                System.out.println("¡Demasiado bajo! Intenta de nuevo.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("¡Demasiado alto! Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el numero " + numeroSecreto + " en " + intentos + " intentos.");
            }
        }
        scanner.close();
    }
}