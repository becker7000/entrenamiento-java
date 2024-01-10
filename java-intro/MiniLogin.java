import java.util.Scanner;

public class MiniLogin {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String password = "java1234";
        String pass_user;

        System.out.print("Escribe tu contraseña: ");
        pass_user = entrada.nextLine();

        System.out.println("¿La contraseña está vacía? R: "+pass_user.isEmpty());
        System.out.println("¿La contraseña son espacios? R: "+pass_user.isBlank());
        System.out.println("¿La contraseña es correcta? R: "+pass_user.equals(password));


    }

}
