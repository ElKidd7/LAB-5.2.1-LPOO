
package lab.pkg5.pkg2.pkg1.lpoo;

public class Gasto {
    private String descripcion;
    private double cantidad;

    public Gasto(String descripcion, double cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return descripcion + ": $" + cantidad;
    }
}
