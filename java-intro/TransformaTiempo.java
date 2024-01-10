import java.util.Scanner;

public class TransformaTiempo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int segundos;
        int minutos;

        System.out.print("\n\t Escribe la cantidad de segundos: ");
        segundos = Integer.parseInt(entrada.nextLine());

        // Supongamos que entran: 400 segundos
        minutos = segundos/60; // 400 / 60 = 6 minutos
        segundos = segundos%60; // 400 % 60 = 40 segundos

        System.out.print("\n\t Los segundos de entrada son equivalentes a");
        System.out.printf("\n\t %d minutos con %d segundos",minutos,segundos);

    }

}

/*
*  10 % 3 = 1
*  12 % 5 = 2
*  14 % 4 = 2
*  30 % 6 = 0
* */
