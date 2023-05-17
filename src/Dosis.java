import java.util.Date;

public class Dosis {
    private Vacuna VacunaPuesta;
    private Date fecha;

    public Dosis(Vacuna vacunaPuesta, Date fecha) {
        VacunaPuesta = vacunaPuesta;
        this.fecha = fecha;
    }

    public Vacuna getVacunaPuesta() {
        return VacunaPuesta;
    }

    public void setVacunaPuesta(Vacuna vacunaPuesta) {
        VacunaPuesta = vacunaPuesta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
