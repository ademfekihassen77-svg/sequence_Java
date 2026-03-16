import java.util.ArrayList;
import java.util.TreeSet;

public class PlanningCollection {
    private ArrayList <Reservation> chListeReservation;
    private TreeSet <Reservation> chEnsembleReservation;

    public PlanningCollection (){
        chListeReservation = new ArrayList<>();
        chEnsembleReservation = new TreeSet<>();
    }
    public void ajout  (Reservation parReservation){
        chListeReservation.add(parReservation);
        chEnsembleReservation.add(parReservation);
    }
    public String toString (){

        return chListeReservation.size() +"\n"+  chListeReservation.toString() +chEnsembleReservation.size()+"\n"+chEnsembleReservation.toString();

    }

}
