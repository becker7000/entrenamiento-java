import java.util.Scanner;

public class MenuSwitchMejorado {

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

        switch (opcion){
            case 1 -> { // Abrimos un bloque en caso de más de una sentencia
                System.out.print("\n\t Seleccionaste la primera opción");
                System.out.print("\n\t Otro texto");
            }
            case 2 -> System.out.print("\n\t Seleccionaste la segunda opción");
            case 3 -> System.out.print("\n\t Seleccionas la tercera opción");
            case 4 -> System.out.print("\n\t Seleccionas la cuarto opción");
            default -> System.out.print("\n\t Opción no contemplada");
        }

        entrada.close();

    }

}
