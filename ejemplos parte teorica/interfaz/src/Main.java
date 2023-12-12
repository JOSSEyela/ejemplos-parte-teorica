public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print(); // Llama al método print() implementado en MyClass
        obj.getInfo(); // Llama al método default getInfo() de la interfaz Printable
    }
}