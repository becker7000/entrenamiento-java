import java.util.Random;

public class WhileAleatorio {

    public static void main(String[] args) {

        int i=1;

        // Creando un objeto de la clase Random, nos permite crear datos aleatorios (int,double,etc...)
        Random random = new Random();
        int limite = random.nextInt(5,20);

        while(i<=limite){
            System.out.print("\n\t Mensaje especial "+i);
            i++;
        }

    }

}
