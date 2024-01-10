import java.util.Scanner;

public class ForFactorial {

    public static void main(String[] args) {

        // 3! = 3*2*1 = 6
        // 4! = 4*3*2*1 = 24
        // 5! = 5*4*3*2*1 = 120

        Scanner entrada = new Scanner(System.in);
        long entero;
        // Las variables que guardan un multiplicación es recomendable que inicien en 1
        long factorial=1;

        System.out.print("\n\t Escribe un número entero para calcular su factorial: ");
        entero = Integer.parseInt(entrada.nextLine());

        for(long i=entero; i>=1 ; i--){
            factorial*=i; // factorial = factorial*i;
        }

        System.out.printf("\n\t %d ! = %d",entero,factorial);

        /*
            entero = 5
            fact = 1

            inicia el for:
            i=5 <- entero

            fact = fact*i = 1*5 = 5
            i = i-1 = 5-1 = 4

            fact = fact*i = 5*4 = 20
            i = i-1 = 4-1 = 3

            fact = fact*i = 20*3 = 60
            i = i-1 = 3-1 = 2

            fact = fact*i = 60*2 = 120
            i = i-1 = 2-1 = 1

            fact = fact*i = 120*1 = 120
            i = i-1 = 1-1 = 0   <- termina el for

         */


        entrada.close();

    }

}
