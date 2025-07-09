public class ContadorWhile {
    public static void main(String[] args) {
        System.out.println("=== Ejecutando: Contador con While ===");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        System.out.println("Conteo finalizado.");
        System.out.println("=== Fin de Contador con While ===");
    }
}