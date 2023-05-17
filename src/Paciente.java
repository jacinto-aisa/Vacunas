import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Paciente {
    private String nombre;
    private String apellidos;
    private String telefono;

    ArrayList<Dosis> dosisRecibidas;

    public Paciente(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        dosisRecibidas = new ArrayList<>();
    }

    void add(Dosis dosis)
    {
        dosisRecibidas.add(dosis);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean estaConDosisCompleta() {

        boolean completoMonodosis = dosisRecibidas.size() == 1 && dosisRecibidas.get(0).getVacunaPuesta() instanceof Vacuna;

        boolean completoMultidosis = false;
        if (dosisRecibidas.size() == 2) {
            Dosis primeraDosis = dosisRecibidas.get(0);
            Dosis segundaDosis = dosisRecibidas.get(1);
            Vacuna primeraVacuna = primeraDosis.getVacunaPuesta();
            Vacuna segundaVacuna = segundaDosis.getVacunaPuesta();
            Date fechaPrimeraVacuna = primeraDosis.getFecha();
            int semanas = ((VacunaMultidosis) primeraDosis.getVacunaPuesta()).getSemanas();
            int noOfDays = semanas * 7; //i.e two weeks
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaPrimeraVacuna);
            calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
            Date fechaTrasSumaSemanas = calendar.getTime();
            boolean fechaOK = fechaTrasSumaSemanas < new Date;
            completoMultidosis = primeraVacuna instanceof VacunaMultidosis
                    && segundaVacuna instanceof VacunaMultidosis
                    && fechaOK;
        }
        return completoMonodosis || completoMultidosis;
    }
}
