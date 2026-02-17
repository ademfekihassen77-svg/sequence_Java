public class clientreservation {
    public static void main (String[] args) {

        PlageHoraire p1 = new PlageHoraire(new Horaire(13,30),new Horaire(14,30));
        Date d1 = new Date(15, 11, 2007);

        Reservation R1 = new Reservation(p1,d1,"hotel royale el mansour ibersortar") ;

        PlageHoraire p2 = new PlageHoraire(new Horaire(15,30),new Horaire(16,30));
        Date d2 = new Date(16, 07, 2025);

        Reservation R2 = new Reservation(p2,d2,"activié jetski ") ;
        System.out.println(R2);
        System.out.println(R2.comparToR(R1));



    }
}
