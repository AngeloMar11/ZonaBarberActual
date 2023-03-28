public class Citas {

    private String Fechas;

    private String Hora;

    private String Codigo_verif;

    public String getFechas() {
        return Fechas;
    }

    public void setFechas(String fechas) {
        Fechas = fechas;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getCodigo_verif() {
        return Codigo_verif;
    }

    public void setCodigo_verif(String codigo_verif) {
        Codigo_verif = codigo_verif;
    }

    public Citas(String fechas, String hora, String codigo_verif) {
        Fechas = fechas;
        Hora = hora;
        Codigo_verif = codigo_verif;
    }
}
