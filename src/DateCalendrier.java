import java.util.Calendar;
public class DateCalendrier extends Date {

    private int chJourSemaine ;


    public DateCalendrier() {
        super(0,0,0);

        Calendar Today = Calendar.getInstance();
        chAnn = Today.get(Calendar.YEAR);
        chMois = Today.get(Calendar.MONTH) + 1;
        chJour = Today.get(Calendar.DAY_OF_MONTH);
        int DAY_OF_WEEK = Today.get(Calendar.DAY_OF_WEEK);

        if ( DAY_OF_WEEK == 2 ) {
            chJourSemaine = 1;
            // lundi = 1
        }
        if ( DAY_OF_WEEK == 3 ) {
            chJourSemaine = 2;
            // mardi = 2

        }
        if ( DAY_OF_WEEK == 4 ) {
            chJourSemaine = 3;
            // mercredi = 3
        }
        if ( DAY_OF_WEEK == 5 ) {
            chJourSemaine = 4;
            // jeudi = 4
        }
        if ( DAY_OF_WEEK == 6 ) {
            chJourSemaine = 5;
            // vendredi = 5
        }
        if ( DAY_OF_WEEK == 7 ) {
            chJourSemaine = 6;
            // samedi = 6
        }
        if ( DAY_OF_WEEK == 1 ) {
            chJourSemaine = 7;
            // dimanche = 7
        }








    }
}
