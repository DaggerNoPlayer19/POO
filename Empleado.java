class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void verificarSalarioCompetitivo() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.printf("Salario: $%.2f%n", salario);

        double umbralCompetitivo = 3000.00;

        if (salario > umbralCompetitivo) {
            System.out.println("Estado del salario: COMPETITIVO");
        } else {
            System.out.println("Estado del salario: NO COMPETITIVO (menor o igual a $" + umbralCompetitivo + ")");
        }
    }
}