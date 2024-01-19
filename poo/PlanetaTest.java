public class PlanetaTest {

    public static void main(String[] args) {

        // Creando varios objetos de la clase Planeta (usando el constructor)
        Planeta planeta1 = new Planeta("Mercurio","Arena",1);
        Planeta planeta2 = new Planeta("Venus","Anaranjado",2);
        Planeta planeta3 = new Planeta("Tierra","Azul",3);

        // Usando un atributo directamente:
        // planeta1.nombre = "Jupiter";

        // Usando getters y setters:
        System.out.println("\n\t Nombre del planeta 2: "+planeta2.getNombre());
        planeta3.setPosicion(10); // Modificamos la posición de un planeta

        // Usando el método personalizado mostrarPlaneta()
        planeta1.mostrarPlaneta();
        planeta2.mostrarPlaneta();
        planeta3.mostrarPlaneta();

    }

}
