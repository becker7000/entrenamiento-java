import java.util.Scanner;

public class ForDouble {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double funcion;
        double minimo, maximo;

        System.out.print("\n\t Este programa evualúa la función: x^(3)-4x+2");
        System.out.print("\n\t Escribe el rango para evaluar la función");
        System.out.print("\n\t Valor mínimo: ");
        minimo = Double.parseDouble(entrada.nextLine());
        System.out.print("\n\t Valor máximo: ");
        maximo = Double.parseDouble(entrada.nextLine());

        for(double x=minimo; x<=maximo; x+=0.2){
            funcion = Math.pow(x,3)-4*x+2;
            System.out.printf("\n\t f(%.3f) = %.3f",x,funcion);
        }

        entrada.close();

    }

}
