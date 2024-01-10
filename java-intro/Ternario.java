import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("\n\t Escribe tu edad: ");
        edad = Integer.parseInt(entrada.nextLine());

        // %s es el código de formato para presentar cadenas(String)
        System.out.printf("\n\t %s", edad >= 18 ? "Es mayor de edad" : "Es menor de edad" );

    }

}
