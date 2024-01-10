import java.util.Scanner;

public class VocalesSwitch {

    public static void main(String[] args) {

        // Vocales: a,e,i,o,u
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una vocal: ");
        letra = entrada.nextLine().charAt(0);

        switch (letra){ // int, char o Strings
            case 'a':
            case 'A':
                System.out.println("\n\t Primera vocal...");
                break;
            case 'e':
            case 'E':
                System.out.println("\n\t Segunda vocal...");
                break;
            case 'i':
            case 'I':
                System.out.println("\n\t Tercera vocal...");
                break;
            case 'o':
            case 'O':
                System.out.println("\n\t Cuarta vocal...");
                break;
            case 'u':
            case 'U':
                System.out.println("\n\t Quinta vocal...");
                break;
            default:
                System.out.println("\n\t El caracter no es ninguna vocal...");
        }

        entrada.close();

    }

}
