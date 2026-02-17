public class Planning {


    private Reservation [] chreservation  ;
    private final int CH_TAILLE_TAB;
    private int cheffectif = 0;

    public Planning(int parTtab) {
        CH_TAILLE_TAB = parTtab;
        chreservation = new Reservation [CH_TAILLE_TAB];
    }

    public String toString() {
        String rep = "";



        for (int i = 0; i < CH_TAILLE_TAB; i++) {
            if (chreservation[i] != null) {
                rep += "•" + (i + 1) + " : "+ chreservation[i].toString() + "\n";
            }
        }

        return rep;
    }
    public boolean ajout (Reservation parReservation) {
        for  (int i = 0; i < CH_TAILLE_TAB; i++) {
            if (chreservation[i] == null) {
                chreservation[i] = parReservation ;
                return true ;
            }
            if(chreservation [i].getDate().compareTo(parReservation.getDate()) == 0) {
                return false ;
            }


        }
        return false ;
    }
    public Reservation getDateReservation(Date parDate) {
        for  (int i = 0; i < CH_TAILLE_TAB; i++) {
            if(chreservation[i] == null)
                return null ;
            if(chreservation [i].getDate().compareTo(parDate) == 0) {
                return chreservation[i] ;
            }
        }
        return null;
    }
    public Reservation []  getReservation (Date parDate) {
        Reservation [] resultat = new Reservation [CH_TAILLE_TAB];
        int indRes = 0
        for  (int i = 0; i < CH_TAILLE_TAB; i++) {
            if (chreservation[i] == null && parDate.compareTo(chreservation[i].getDate()) == 0) {
                resultat[indRes] = chreservation[i];
                indRes++ ;
            }
        }
        return resultat ;
    }

    public int PlusAncienReservation(int parDebut, int parFin) {
        int plusAncien = parDebut ;
        for(int i = parDebut; i <= parFin ; i++) {
            return null
        }
    }



}