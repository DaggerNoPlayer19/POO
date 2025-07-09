public class ContadorNumeros {
    public static void main(String[] args) {
        int[] numeros = {4, -2, 0, 7, -5, 0, 3};
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0)
                positivos += 1;
            else if (numeros[i] < 0)
                negativos += 1;
            else
                ceros += 1;
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números ceros: " + ceros);
    }
}