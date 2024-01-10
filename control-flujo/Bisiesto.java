import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int anio;

        System.out.print("\n\t Escribe un año: ");
        anio = Integer.parseInt(entrada.nextLine());

        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.print("\n\t El año es bisiesto");
        } else {
            System.out.print("\n\t El año no es bisiesto");
        }

        entrada.close();

    }

}
