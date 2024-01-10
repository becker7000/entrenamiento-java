import java.util.Scanner;

public class IfEjemplo3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("\n\t Escribe un número entre 2 y 5: ");
        numero = Integer.parseInt(entrada.nextLine());

        if(numero>=2 && numero<=5){
            System.out.print("\n\t El número está en el rango");
        }else{
            System.out.print("\n\t El número está fuera del rango");
        }

        entrada.close();

    }

}
