import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PlanningCollections {
    private ArrayList <Reservation> chListReservation;
    private TreeSet <Reservation> chSetReservation;

    public PlanningCollections(){
        chListReservation = new ArrayList<>();
        chSetReservation = new TreeSet<>();
    }

    public void ajout(Reservation parReservation)/* throws Exception*/{
        chSetReservation.add(parReservation);
        chListReservation.add(parReservation);
    }

    public String toString(){
        return chListReservation.size() + " " + chListReservation + "\n" + chSetReservation.size() + " " + chSetReservation;
    }

    public TreeSet <Reservation> getReservations(DateCalendrier parDate){
        TreeSet <Reservation> tmp = new TreeSet<>();
        /*Iterator <Reservation> iterateur = chSetReservation.iterator();
        while (iterateur.hasNext()){
            Reservation res = iterateur.next();
            if (parDate.compareTo(res.getDate()) == 0){
                tmp.add(res);
            }
        }*/

        for(Reservation res : chSetReservation) {
            if (parDate.compareTo(res.getDate()) == 0) {
                tmp.add(res);
            }
        }
        return tmp;
    }


}