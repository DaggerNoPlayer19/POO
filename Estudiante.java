import java.util.InputMismatchException;
import java.util.Scanner;

class Estudiante {
    String nombre;
    double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void mostrarEstado() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 60) { // Suponiendo 60 como calificacion minima para aprobar
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
