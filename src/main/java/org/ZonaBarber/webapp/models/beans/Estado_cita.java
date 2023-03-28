public class Estado_cita {

    private int Cancelado;

    private int Programado;

    private int Enservicio;

    public Estado_cita(int cancelado, int programado, int enservicio, int calificacion, String notificacion) {
        Cancelado = cancelado;
        Programado = programado;
        Enservicio = enservicio;
        Calificacion = calificacion;
        Notificacion = notificacion;
    }

    public int getCancelado() {
        return Cancelado;
    }

    public void setCancelado(int cancelado) {
        Cancelado = cancelado;
    }

    public int getProgramado() {
        return Programado;
    }

    public void setProgramado(int programado) {
        Programado = programado;
    }

    public int getEnservicio() {
        return Enservicio;
    }

    public void setEnservicio(int enservicio) {
        Enservicio = enservicio;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public String getNotificacion() {
        return Notificacion;
    }

    public void setNotificacion(String notificacion) {
        Notificacion = notificacion;
    }

    private int Calificacion;

    private String Notificacion;
}
