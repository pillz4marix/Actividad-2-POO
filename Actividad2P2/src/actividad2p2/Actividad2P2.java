package actividad2p2;

public class Actividad2P2 {
    public static void main(String[] args) {

        int[] pares = new int[50];
        int indice = 0;

        // Generar y almacenar los números pares
        for (int i = 2; i <= 100; i += 2) {
            pares[indice] = i;
            indice++;
        }

        // Recorrer el arreglo y mostrar los números
        System.out.println("numeros pares del 2 al 100:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.print("Programa Finalizado.");
    }
}
