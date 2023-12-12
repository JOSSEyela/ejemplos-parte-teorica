//esta vendria siendo la superclase o clase padre
class tienda {
    String producto;
    int precio;

    public tienda(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + producto + ", Precio: " + precio);
    }
}
