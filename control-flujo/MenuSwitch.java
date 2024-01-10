import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        // Usando text blocks: """ (texto deseado) """
        System.out.print(
                """
                    Menú:
                    1. Primera opción
                    2. Segunda opción
                    3. Tercera opción
                    4. Cuarta opción
                """);
        System.out.print("\t Opción: ");
        opcion = Integer.parseInt(entrada.nextLine());

        switch (opcion){ // switch-case
            case 1:
                System.out.print("\n\t Seleccionaste la primera opción");
                break;
            case 2:
                System.out.print("\n\t Seleccionaste la segunda opción");
                break;
            case 3:
                System.out.print("\n\t Seleccionaste la tercera opción");
                break;
            case 4:
                System.out.print("\n\t Seleccionaste la cuarta opción");
                break;
            default:
                System.out.print("\n\t Opción no contemplada");
                break;
        }

        entrada.close();

    }

}
