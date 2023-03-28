import java.util.Date;

public class Horario {

    private Date Hora_ingr;

    public Horario(Date hora_ingr, Date hora_sal, Date dia) {
        Hora_ingr = hora_ingr;
        Hora_sal = hora_sal;
        Dia = dia;
    }

    public Date getHora_ingr() {
        return Hora_ingr;
    }

    public void setHora_ingr(Date hora_ingr) {
        Hora_ingr = hora_ingr;
    }

    public Date getHora_sal() {
        return Hora_sal;
    }

    public void setHora_sal(Date hora_sal) {
        Hora_sal = hora_sal;
    }

    public Date getDia() {
        return Dia;
    }

    public void setDia(Date dia) {
        Dia = dia;
    }

    private Date Hora_sal;
    private Date Dia;
}
