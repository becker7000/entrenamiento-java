import java.io.IOException;
import java.util.Scanner;

public class WhileMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion=0; // Valor auxiliar para que pueda iniciar el while

        while(true){ // Genera un while infinito

            // Limpiamos la pantalla:
            try{
                ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c","cls"); // Construir un proceso
                try {
                    Process process = processBuilder.inheritIO().start(); // Se crea un proceso para iniciarse
                    process.waitFor(); // Se espera a que el sistema termine sus procesos prioritarios
                }catch (IOException exception){
                    System.out.println("\n\t Error en algún estandar de entrada/salida");
                    System.out.println("\n\t -> "+exception.getMessage());
                }
            }catch (Exception exception){
                System.out.println("\n\t Error de construcción de proceso -> "+exception.getMessage());
            }

            System.out.print(
                    """
                        
                        
                        Menú:
                        1. Mostrar lista de productos
                        2. Crear un producto
                        3. Buscar un producto
                        4. Actualizar un producto
                        5. Eliminar un producto
                        6. Salir
                    """
            );

            System.out.print("\n\t Opción: ");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion){
                case 1 -> System.out.println("\n\t Seleccionaste mostrar la lista de productos");
                case 2 -> System.out.println("\n\t Seleccionaste crear un producto");
                case 3 -> System.out.println("\n\t Seleccionaste buscar un producto ");
                case 4 -> System.out.println("\n\t Seleccionaste actualizar un producto");
                case 5 -> System.out.println("\n\t Seleccionaste eliminar un producto");
                case 6 -> System.out.println("\n\t Seleccionaste salir");
                default -> System.out.println("\n\t Opción no contemplada...");
            }

            // Termina el ciclo while
            if(opcion==6)
                break;

            // Código auxiliar:
            /*
            if(opcion>=1 && opcion<=5){
                System.out.print("\n\t Opción del menú");
            }else if(opcion==6){
                System.out.print("\n\t Saliendo...");
                break; // Rompe con el while
            }else{
                System.out.print("\n\t Opción no contemplada...");
            }
            */

            System.out.println("\n\t Teclea [ENTER] para reiniciar el menú");
            entrada.nextLine(); // Pone una pausa hasta que se digite una tecla...

        }

        entrada.close();

    }

}
