
package lab.pkg5.pkg2.pkg1.lpoo;

public class LugarVisitado {
    private String nombre;
    private String descripcion;

    public LugarVisitado(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre + ": " + descripcion;
    }
}
