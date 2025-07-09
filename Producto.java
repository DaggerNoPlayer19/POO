class Producto {
    String nombre;
    int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public void verificarDisponibilidad() {
        System.out.println("Producto: " + nombre);
        System.out.println("Stock actual: " + stock);

        if (stock > 0) {
            System.out.println("Estado: DISPONIBLE");
        } else {
            System.out.println("Estado: AGOTADO");
        }
    }
}