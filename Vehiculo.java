class Vehiculo {
    String marca;
    int anioFabricacion;
    int anioActual = 2025; // Asumimos el año actual para la practica

    public Vehiculo(String marca, int anioFabricacion) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public void verificarCirculacion() {
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Año de fabricacion: " + anioFabricacion);

        if ((anioActual - anioFabricacion) <= 10) {
            System.out.println("Estado de circulacion: PUEDE CIRCULAR");
        } else {
            System.out.println("Estado de circulacion: POSIBLEMENTE RESTRINGIDO (mas de 10 años)");
        }
    }
}