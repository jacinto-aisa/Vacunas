public class VacunaMultidosis extends Vacuna {
    private int semanas;

    public VacunaMultidosis(String nombreVacuna, int dias) {
        super(nombreVacuna);
        this.semanas = semanas;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setDias(int semanas) {
        this.semanas = semanas;
    }
}
