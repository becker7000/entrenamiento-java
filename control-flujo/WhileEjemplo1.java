import java.util.Scanner;

public class WhileEjemplo1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i=1;
        int banderilla=1; // Variable de control

        while(banderilla!=2){ // Condición
            System.out.printf("\n\t Hola %d",i);
            i++; // Incremento
            System.out.print("\n\t 1.Otro hola, 2.Terminar ");
            banderilla = Integer.parseInt(entrada.nextLine());
        }

        entrada.close();
    }

}
