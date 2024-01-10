import java.util.Scanner;

public class WhileEjemplo2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double calificacion;
        double promedio = 0;
        int contador=0;
        int opcion;
        boolean banderilla=true;

        while(banderilla){

            System.out.print("\n\t Escribe una calificacion: ");
            calificacion=Double.parseDouble(entrada.nextLine());
            contador++;
            promedio+=calificacion;

            System.out.print("\n\t ¿Deseas escribir otra? 1.Si, 2.No => ");
            opcion = Integer.parseInt(entrada.nextLine());

            if(opcion==2){
                banderilla=false;
            }

        }

        promedio/=contador;
        System.out.printf("\n\t Tu promedio es: %.2f",promedio);

        entrada.close();

    }

}
