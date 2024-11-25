
package lab.pkg5.pkg2.pkg1.lpoo;

public class Usuario {
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

    public void agregarLugarVisitado(LugarVisitado lugar) {
        itinerario.agregarLugarVisitado(lugar);
    }

    public void agregarGasto(Gasto gasto) {
        itinerario.agregarGasto(gasto);
    }
}
