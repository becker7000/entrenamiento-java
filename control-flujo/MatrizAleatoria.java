import java.util.Scanner;

public class MatrizAleatoria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int N;
        System.out.print("\n\t Escribe el valor de N: ");
        N = Integer.parseInt(entrada.nextLine());

        for(int i=0; i<N; i++){ // Externo: filas (se ejecuta 1 vez)
            System.out.print("\n\n");
            for(int j=0; j<N; j++) { // Interno: columnas (se ejecuta 3 veces)
                System.out.printf("\t %d",10+(int)(Math.random()*41));
            }
        }

        entrada.close();

    }

}

/*
    Math.random()  -> 0.000000 hasta 0.999999999
    Math.random()*41 -> 0.000000 hasta 40.9999999
    (int)Math.random()*41 -> 0 hasta 40
    (int)Math.random()*41+10 -> 10 hasta 50

 */
