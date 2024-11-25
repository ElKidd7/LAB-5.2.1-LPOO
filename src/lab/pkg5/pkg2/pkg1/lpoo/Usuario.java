
package lab.pkg5.pkg2.pkg1.lpoo;

public class Usuario implements Runnable {
    private String nombre;
    private Itinerario itinerario;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.itinerario = new Itinerario();
    }

    public String getNombre() {
        return nombre;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    @Override
    public void run() {
        // Aquí simulamos operaciones concurrentes con el itinerario
        // Cada usuario agrega un lugar y un gasto de forma concurrente

        itinerario.agregarLugarVisitado(new LugarVisitado("Paris", "Ciudad del amor"));
        itinerario.agregarGasto(new Gasto("Hotel", 150.00));

        itinerario.agregarLugarVisitado(new LugarVisitado("Londres", "La ciudad de la lluvia"));
        itinerario.agregarGasto(new Gasto("Comida", 50.00));
    }
}
