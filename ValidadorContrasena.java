import java.util.Scanner;

public class ValidadorContrasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;
        boolean esSegura;

        do {
            System.out.println("Ingresa una contrasena (minimo 8 caracteres, 1 mayuscula, 1 minuscula, 1 numero):");
            contrasena = scanner.nextLine();

            // Usa una única expresión regular para validar todos los criterios excepto la longitud
            // ^                 : Inicio de la cadena
            // (?=.*[A-Z])       : Al menos una mayuscula
            // (?=.*[a-z])       : Al menos una minuscula
            // (?=.*\\d)         : Al menos un digito
            // .{8,}             : Al menos 8 caracteres de cualquier tipo
            // $                 : Fin de la cadena
            esSegura = contrasena.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$");

            if (!esSegura) {
                System.out.println("La contraseña no cumple con todos los requisitos. Intenta de nuevo.");
            } else {
                System.out.println("¡Contrasena segura! Has ingresado: " + contrasena);
            }

        } while (!esSegura);

        scanner.close();
    }
}