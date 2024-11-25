
package lab.pkg5.pkg2.pkg1.lpoo;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Maria");

        // Agregar lugares y gastos
        usuario1.agregarLugarVisitado(new LugarVisitado("Paris", "Ciudad del amor"));
        usuario1.agregarGasto(new Gasto("Hotel", 150.00));

        usuario2.agregarLugarVisitado(new LugarVisitado("Londres", "La ciudad de la lluvia"));
        usuario2.agregarGasto(new Gasto("Comida", 50.00));

        // Mostrar itinerarios
        System.out.println(usuario1.getNombre() + "'s Itinerario:");
        usuario1.getItinerario().mostrarItinerario();

        System.out.println("\n" + usuario2.getNombre() + "'s Itinerario:");
        usuario2.getItinerario().mostrarItinerario();
    }
}
