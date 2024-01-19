public class Planeta {

    // Atributos: (variables internas)
    private String nombre;
    private String color;
    private int posicion;

    // Constructor: permite crear objetos de la clase Planeta
    // Nota: El constructor debe llamarse igual que la clase
    public Planeta(String nombre, String color, int posicion){ // Parametros
        // Asignamos los valores de los parametros a las variables internas
        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }

    // Definiendo setters y getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }

    public int getPosicion(){
        return posicion;
    }

    // Método personalizado:
    public void mostrarPlaneta(){
        System.out.printf(
                """
                    +---------PLANETA----------+
                    | Nombre: %s
                    | Color: %s
                    | Posición: %d
                    +--------------------------+
                """,nombre,color,posicion
        );
    }



}
