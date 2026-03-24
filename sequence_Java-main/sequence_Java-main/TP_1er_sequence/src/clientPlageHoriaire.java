import java.util.Scanner;

public class clientPlageHoriaire {
    public static void main(String [] args){
        Horaire HD = new Horaire(1,10);
        Horaire HF = new Horaire(2,30);
        PlageHoraire p1 = new PlageHoraire(HD,HF);
        PlageHoraire p2 = new PlageHoraire(new Horaire(13,30),new Horaire(14,10));
        PlageHoraire p3 = new PlageHoraire(new Horaire(21,30),new Horaire(22,10));
        PlageHoraire p4 = new PlageHoraire(new Horaire(10,30),new Horaire(11,10));
        System.out.println(p1.comparTo(p2));




    }
}
