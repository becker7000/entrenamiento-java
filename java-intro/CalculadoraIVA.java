import java.util.Scanner;

public class CalculadoraIVA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double monto_sin_iva;
        double monto_con_iva;

        System.out.print("\n\t Escribe un monto sin iva: $");

        // Forma #1 de guardar un número:
        // monto_sin_iva = entrada.nextDouble();
        // entrada.nextLine();

        // nextLine captura una cadena (String)
        // Double es un tipo de dato Wrapper (No primitivos)
        monto_sin_iva = Double.parseDouble(entrada.nextLine());

        // 200 -> 32+200 = 232
        monto_con_iva = monto_sin_iva*1.16;

        // %f es un código de formato para presentar
        System.out.printf("\n\t El monto con IVA es: $%.2f",monto_con_iva);
        System.out.println();

    }

}

// Consola:
// Escribe un monto sin IVA: $100 78
// Escribe la cantidad de productos: 10