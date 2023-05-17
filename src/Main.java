import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vacuna miVacunaMonodosisCovid = new Vacuna("Covid19");
        Vacuna miVacunaMonodosisGripe = new Vacuna ("Gripe");
        VacunaMultidosis miVacunaMultiCovid = new VacunaMultidosis("Codiv19",20);
        VacunaMultidosis miVacunaMultiCovid2 = new VacunaMultidosis("Gripe",30);

        Dosis DosisRecibia01 = new Dosis(miVacunaMonodosisCovid,new Date());
        Dosis DosisRecibia02 = new Dosis(miVacunaMonodosisGripe,new Date());
        Dosis DosisRecibia03 = new Dosis(miVacunaMultiCovid,new Date());
        Dosis DosisRecibia04 = new Dosis(miVacunaMultiCovid2,new Date());
        Dosis DosisRecibia05 = new Dosis(miVacunaMonodosisGripe,new Date());

        Paciente Lazaro = new Paciente("Lazaro","Perez","666565656");
        Paciente Maria = new Paciente("Maria","Lopez", "76767667");
        Paciente Ambrosio = new Paciente("Ambrosio","Romerales","666565656");

        Lazaro.add(DosisRecibia01);
        Maria.add(DosisRecibia02);
        Maria.add(DosisRecibia03);
        Ambrosio.add(DosisRecibia04);
        Ambrosio.add(DosisRecibia05);

        CentroDeSalud miCentroDeSalud = new CentroDeSalud();
        miCentroDeSalud.add(Lazaro);
        miCentroDeSalud.add(Maria);
        miCentroDeSalud.add(Ambrosio);



        }
    }
}