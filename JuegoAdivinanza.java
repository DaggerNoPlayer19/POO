import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int contadorIntentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un numero entre 1 y 100. ¡Intenta adivinarlo!");

        while (!adivinado) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            contadorIntentos++;

            if (intento < 1 || intento > 100) {
                System.out.println("Por favor, ingresa un numero entre 1 y 100.");
            } else if (intento < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR.");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero secreto es MENOR.");
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el numero secreto (" + numeroSecreto + ") en " + contadorIntentos + " intentos!");
                adivinado = true;
            }
        }
        scanner.close();
    }
}

