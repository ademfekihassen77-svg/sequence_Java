public class clientPlanning {
    public static void main(String [] args) {
        Planning planning = new Planning(5);

        Date d1 = new Date(12, 2, 2026);
        Date d2 = new Date(13, 2, 2026);

        Horaire h1 = new Horaire(10, 0);
        Horaire h2 = new Horaire(12, 0);
        Horaire h3 = new Horaire(14, 0);
        Horaire h4 = new Horaire(16, 0);

        PlageHoraire ph1 = new PlageHoraire(h1, h2);
        PlageHoraire ph2 = new PlageHoraire(h3, h4);

        Reservation r1 = new Reservation(ph1, d1, "activiter jetskki");
        Reservation r2 = new Reservation(ph2, d1,"activite buggy dans le desert");
        Reservation r3 = new Reservation(ph1,d2,"massage");

        planning.ajout(r1);
        planning.ajout(r2);
        planning.ajout(r3);



        System.out.println(planning.toString());

        System.out.println(planning.getDateReservation(new Date(13,2,2025)));

    }


}
