public class Medico extends Persona{

    // Atributos exclusivos de Médico:
    private String especialidad;

    // Constructor:
    public Medico(String nombre,String telefono,String especialidad){
        super(nombre,telefono); // superconstructor
        this.especialidad = especialidad;
    }

    // Getters and setters:

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    // Implementando un método abstracto:
    @Override // Indica que se va a sobreescribir el método mostrar
    public void mostrar(){
        System.out.printf(
                """
                    +-------[MÉDICO]------+
                    | Nombre: %s
                    | Teléfono: %s
                    | Especialidad: %s
                    +---------------------+
                """,nombre,telefono,especialidad
        );
    }

}
