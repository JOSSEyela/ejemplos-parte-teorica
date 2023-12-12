public class Main {
    public static void main(String[] args) {
        venta primerventa = new venta("cerveza", 4000, 6);
        primerventa.mostrarInformacion(); // este metodo es el heredado de la superclase "tineda"
        primerventa.mostrarDetalles();    // este es metodo propio de la subclase "venta"
    }
}
