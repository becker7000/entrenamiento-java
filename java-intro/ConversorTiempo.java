import java.util.Scanner;

public class ConversorTiempo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int segundos;
        int minutos;

        System.out.print("\n\t Escribe los segundos: ");
        segundos = Integer.parseInt(entrada.nextLine());

        // Todavía están los segundos de entrada:
        System.out.printf("\n\t %d segundos son equivalentes a",segundos);

        // 400 -> 6 minutos
        minutos = segundos/60;
        segundos = segundos%60; // segundos%=60;

        // %d es código de formato que se usa para presentar enteros
        System.out.printf("\n\t %d minutos con %d segundos",minutos,segundos);

        entrada.close();

    }

}
