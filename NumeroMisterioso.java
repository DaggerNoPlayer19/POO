import java.util.Scanner;
import java.util.Random;

public class NumeroMisterioso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intentos = 7;

        System.out.println("¡Adivina el numero secreto entre 1 y 100!");

        while (intentos > 0) {
            System.out.print("Intento #" + (8 - intentos) + ": ");
            int intento = sc.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el numero.");
                break;
            } else {
                if (Math.abs(numeroSecreto - intento) < 10) {
                    System.out.println("¡Estás muy cerca!");
                }

                if (intento > numeroSecreto) {
                    System.out.println("El numero es menor.");
                } else {
                    System.out.println("El numero es mayor.");
                }
            }

            intentos--;
        }

        if (intentos == 0) {
            System.out.println("Se te acabaron los intentos. El numero era: " + numeroSecreto);
        }

        sc.close();
    }
}
