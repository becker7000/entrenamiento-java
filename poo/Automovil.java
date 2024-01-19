public class Automovil {

    // Atributos: (Variables internas)
    String modelo;
    String marca;
    String version;

    // Constructor:
    Automovil(String modelo,String marca,String version){ // Parametros
        this.modelo = modelo;
        this.marca = marca;
        this.version = version;
    }

    // Método personalizado:
    void mostrarAuto(){
        System.out.printf(
                """
                    +-----AUTOMOVIL------+
                    | Modelo: %s
                    | Marca: %s
                    | Versión: %s
                    +--------------------+
                """,modelo,marca,version
        );
    }

}
