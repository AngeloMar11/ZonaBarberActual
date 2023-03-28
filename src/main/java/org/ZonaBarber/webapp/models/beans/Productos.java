public class Productos {

    private String Nombre;

    private int valor;

    private String Foto;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public Productos(String nombre, int valor, String foto) {
        Nombre = nombre;
        this.valor = valor;
        Foto = foto;
    }
}
