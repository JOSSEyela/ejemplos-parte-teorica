public interface printable {
    // Método abstracto
    void print();

    // Método default
    default void getInfo() {
        System.out.println("Hola Mundo, hola profe");
    }
}



