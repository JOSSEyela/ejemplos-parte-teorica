import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            animal miMascota;
            int opc;
            Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Que mascota tienes?");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. salir.");
            System.out.print("Seleccione una opción: ");
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc){

                case 1:
                    miMascota = new perro();
                    System.out.println("================================ ");
                    miMascota.hacerSonido(); // Muestra el sonido que haria un perro
                    System.out.println("================================ ");
                    break;
                case 2:
                    miMascota = new gato();
                    System.out.println("================================ ");
                    miMascota.hacerSonido(); // Muestra el sonido que haria un gato
                    System.out.println("================================ ");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Seleccione un número de 1 al 3: ");
                    break;
            }
        }while (opc != 3);
        }
}