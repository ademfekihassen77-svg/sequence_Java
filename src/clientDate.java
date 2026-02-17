
public class clientDate {
    public static void main (String [] args){
        Date anniv = new Date(15,11,1200);
        System.out.println(Date.est_valide(15,11,2007));

        Date petit_date = Date.lireDate();

        System.out.println(petit_date);

        String s1 = "abc";
        String s2 = "abd";
        String s3 = "abc";

        int r1 = s1.compareTo(s2);
        int r2 = s2.compareTo(s1);
        int r3 = s1.compareTo(s3);

        System.out.println("Comparaison de \"" + s1 + "\" et \"" + s2 + "\" : " + r1);
        System.out.println("Comparaison de \"" + s2 + "\" et \"" + s1 + "\" : " + r2);
        System.out.println("Comparaison de \"" + s1 + "\" et \"" + s3 + "\" : " + r3);

        if (r1 < 0)
            System.out.println(s1 + " est avant " + s2);
        else if (r1 > 0)
            System.out.println(s1 + " est après " + s2);
        else
            System.out.println(s1 + " est égal à " + s2);


        Date d1 = new Date(28, 2, 2024); // année bissextile
        System.out.println("Date actuelle : " + d1);

        Date lendemain = d1.jour_Apres();
        System.out.println("Jour après : " + lendemain);

        Date d2 = new Date(31, 12, 2023);
        System.out.println("Date actuelle : " + d2);
        System.out.println("Jour après : " + d2.jour_Apres());
    }

}
