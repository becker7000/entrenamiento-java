import java.util.Scanner;

public class ForTablas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t ¿Que tabla de multiplicar quieres? R: ");
        entero = Integer.parseInt(entrada.nextLine());

        System.out.println("\n\t Tabla del "+entero);
        for(int i=1; i<=10; i++){
            System.out.printf("\n\t %d * %d = %d", entero, i, entero*i);
        }

        entrada.close(); // Cerramos el Scanner entrada
    }

}
