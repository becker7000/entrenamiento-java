public class Deportista extends Persona{

    // Atributos exclusivos de Deportista
    private String deporte;

    // Constructor:
    public Deportista(String nombre,String telefono,String deporte){
        super(nombre,telefono);
        this.deporte = deporte;
    }

    @Override
    public void mostrar(){
        System.out.printf(
                """
                    +----[DEPORTISTA]----+
                    | Nombre: %s
                    | Teléfono: %s
                    | Deporte: %s
                    +--------------------+
                """,nombre,telefono,deporte
        );
    }

}
