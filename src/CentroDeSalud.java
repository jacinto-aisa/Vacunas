import java.util.ArrayList;
import java.util.TreeMap;

public class CentroDeSalud {
    private TreeMap<String,Paciente> usuarios;


    public CentroDeSalud() {
        this.usuarios = new TreeMap<>();
    }

    public void add(Paciente paciente)
    {
        usuarios.put(paciente.getTelefono(),paciente );
    }

    public ArrayList<Paciente> damePacientesConDosisCompletas()
    {
        ArrayList<Paciente> pacientesDosisCompleta = new ArrayList<>();
        for (Paciente PacienteEvaluado : usuarios.values())
        {
            if (PacienteEvaluado.estaConDosisCompleta())
                pacientesDosisCompleta.add(PacienteEvaluado);
        }
        return pacientesDosisCompleta;
    }

}
