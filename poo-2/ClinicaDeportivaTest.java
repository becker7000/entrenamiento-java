public class ClinicaDeportivaTest {

    public static void main(String[] args) {

        Persona medico1 = new Medico(
                "Eduardo",
                "5512345678",
                "Cardiología"
        );

        Persona deportista1 = new Deportista(
                "Laura",
                "7791827364",
                "Atletismo"
        );

        medico1.mostrar();
        deportista1.mostrar();

    }

}
