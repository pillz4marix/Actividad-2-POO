package actividad2p1;
import java.util.Scanner;
public class Actividad2P1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();

        while (nombre.equalsIgnoreCase("admin") && !nombre.equals("Admin")) {
            System.out.println("Error al escribir el nombre, intenta de nuevo:");
            nombre = sc.nextLine();
        }

        if (nombre.equals("Admin")) {
            System.out.println("Bienvenido, Admin, tienes acceso especial");
        } else {
            System.out.println("Hola " + nombre + ", bienvenido/a al programa");
        }

        System.out.print("Programa Finalizado.");
    }
}
