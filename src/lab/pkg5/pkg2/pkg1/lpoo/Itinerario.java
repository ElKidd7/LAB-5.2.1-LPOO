
package lab.pkg5.pkg2.pkg1.lpoo;

import java.util.ArrayList;
import java.util.List;

public class Itinerario {
    private List<LugarVisitado> lugaresVisitados;
    private List<Gasto> gastos;

    public Itinerario() {
        lugaresVisitados = new ArrayList<>();
        gastos = new ArrayList<>();
    }

    public void agregarLugarVisitado(LugarVisitado lugar) {
        lugaresVisitados.add(lugar);
    }

    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public void mostrarItinerario() {
        System.out.println("Lugares visitados:");
        for (LugarVisitado lugar : lugaresVisitados) {
            System.out.println(lugar);
        }

        System.out.println("Gastos:");
        for (Gasto gasto : gastos) {
            System.out.println(gasto);
        }
    }
}
