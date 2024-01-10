import java.util.Scanner;

public class Tricotomia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("\n\t Escribe un número: ");
        numero = Integer.parseInt(entrada.nextLine());

        if(numero>0){
            System.out.print("\n\t El número es positivo");
        }else if(numero<0){
            System.out.print("\n\t El número es negativo");
        }else{
            System.out.print("\n\t El número es cero");
        }

    }

}
