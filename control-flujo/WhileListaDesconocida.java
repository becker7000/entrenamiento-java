import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WhileListaDesconocida {

    public static void main(String[] args) {

        // Supongamos que esta lista proviene de otro programa
        List<String> nombres = Arrays.asList(
                "Antonio",
                "Laura",
                "Marco",
                "Karla",
                "Nadia",
                "Eduardo"
        );

        // Variable de control inteligente
        Iterator<String> iterator = nombres.iterator();

        while (iterator.hasNext()){ // se pregunta: tiene un siguiente?
            System.out.println("\n\t "+iterator.next());
        }

    }

}
