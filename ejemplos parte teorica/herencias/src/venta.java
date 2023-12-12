// esta clase vendria siendo la subclase la cual heredara las propiedades de la superclase

class venta extends tienda {
    int cantidad;

    public venta(String producto, int precio, int cantidad) {
        super(producto, precio); // Llama al constructor de la superclase "tienda"
        this.cantidad = cantidad;
    }



    public void mostrarDetalles() {
        System.out.println("Producto: " + producto+ ", Precio: " + precio + ", cantidad: " + cantidad+ ", Total: " + precio * cantidad );
    }
}