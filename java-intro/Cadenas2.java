import java.util.Scanner;

public class Cadenas2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Bienvenid@ "+nombre);
        System.out.println("La inicial de tu nombre es: "+nombre.charAt(0));
        System.out.println("Tu nombre tiene "+nombre.length()+" letras");

    }

}
