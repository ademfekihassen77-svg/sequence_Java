import java.util.Arrays;

public class clientDateCalendrier {
    public static void main (String [] args) {
        DateCalendrier anniv = new DateCalendrier(24, 2,2026);
        //System.out.println(anniv.dateDeLaVeille().toString());
        DateCalendrier tab [] = { new DateCalendrier(),new DateCalendrier(23,2,2026),new DateCalendrier(20,2,2026)};
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

    }
}
