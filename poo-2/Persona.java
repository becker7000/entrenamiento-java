public abstract class Persona {

    // Se permite que las clases hijas hereden los atributos:
    protected String nombre;
    protected String telefono;

    // Constructor
    public Persona(String nombre,String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters and setters:

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }

    // Método abstracto:
    // Será obligatorio de implementar por las clases hijas
    public abstract void mostrar();

}
