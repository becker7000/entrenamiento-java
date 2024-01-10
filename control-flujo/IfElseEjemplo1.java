import java.util.Scanner;

public class IfElseEjemplo1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("\n\t Escribe un número entero: ");
        numero = Integer.parseInt(entrada.nextLine());

        if(numero%2 == 0){
            System.out.println("\n\t El número es par");
        }else{
            System.out.println("\n\t El número es impar");
        }

    }

}

/*
*  2,4,6,8,10
*  2/2=1 resta 0
*  4/2=2 resta 0
*  6/2=3 resta 0
* */