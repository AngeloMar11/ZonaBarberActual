public class Seleccion_produc {

    private int Cantidad;

    public Seleccion_produc(int cantidad, String seleccion) {
        Cantidad = cantidad;
        Seleccion = seleccion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getSeleccion() {
        return Seleccion;
    }

    public void setSeleccion(String seleccion) {
        Seleccion = seleccion;
    }

    private String Seleccion;
}
