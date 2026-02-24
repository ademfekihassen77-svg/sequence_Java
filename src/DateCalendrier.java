import java.io.Serializable;
import java.util.Calendar;
public class DateCalendrier extends Date implements Comparable<Date>{

    private int chJourSemaine ;


    public DateCalendrier() {
        super(0,0,0);

        Calendar Today = Calendar.getInstance();
        chAnn = Today.get(Calendar.YEAR);
        chMois = Today.get(Calendar.MONTH) + 1;
        chJour = Today.get(Calendar.DAY_OF_MONTH);

        int jourSem = Today.get(Calendar.DAY_OF_WEEK);
        if ( jourSem == 1 ) {
            chJourSemaine = 7;
            // dimanche = 7
        }
        chJourSemaine = jourSem - 1;
        // les autres jours
    }

    public DateCalendrier (int parjour, int parmois ,int parannees){
        super(parjour,parmois,parannees);

        chAnn = parannees;
        chMois = parmois;
        chJour = parjour;

        Calendar dateC = Calendar.getInstance();
        dateC.set(chAnn,chMois - 1 ,chJour);

        int jourSem = dateC.get(Calendar.DAY_OF_WEEK);
        if ( jourSem == 1 )
            chJourSemaine = 7;
            // dimanche = 7
        else
            chJourSemaine = jourSem - 1;

    }

    public String toString() {
        return "date du calendrier est : "+ chJour + "/" + chMois + "/" + chAnn +" et c'est un "+ chJourSemaine;
    }

    public DateCalendrier dateDuLendemain () {
        Date date = super.jour_Apres();
        return new DateCalendrier(date.chJour, date.chMois, date.chAnn);
    }

    public DateCalendrier dateDeLaVeille () {
        Date date = super.date_de_la_veille();
        return new DateCalendrier(date.chJour, date.chMois, date.chAnn);
    }

}
