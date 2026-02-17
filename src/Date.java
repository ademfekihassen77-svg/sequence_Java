import java.util.Scanner;

public class Date {
    private int chJour;
    private int chMois;
    private int chAnn;


    public Date(int parannees) {
        chJour = 1;
        chMois = 1;
        chAnn = parannees;
    }

    public Date(int parJour, int parMois, int parAnn) {
        chJour = parJour;
        chMois = parMois;
        chAnn = parAnn;
    }


    public String toString() {
        return chJour + "/" + chMois + "/" + chAnn;
    }

    public static boolean estBissAnn(int parAnn) {
        return (parAnn % 4 == 0 && parAnn % 100 != 0) || (parAnn % 400 == 0);
    }

    public static int dernierJourDuMois(int parMois, int parAnn) {
        switch (parMois) {
            case 2:
                if (estBissAnn(parAnn))
                    return 29;
                else
                    return 28;
            case 4:
            case 11:
            case 6:
            case 9:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean est_valide(int parJour, int parMois, int parAnn) {
        if (parMois <= 1583) {
            return false;
        }
        if (parMois < 1 || parMois > 12) {
            return false;
        }
        if (parJour < 1 || parJour > dernierJourDuMois(parMois, parAnn)) {
            return false;
        }
        return true;
    }

    public static Date lireDate() {
        Scanner scanner = new Scanner(System.in);
        int jour = scanner.nextInt();
        int mois = scanner.nextInt();
        int ann = scanner.nextInt();
        return new Date(jour, mois, ann);
    }

    public Date jour_Apres() {
        int nouveauJour = chJour;
        int nouveauMois = chMois;
        int nouvelleAnnee = chAnn;

        // Si ce n'est pas le dernier jour du mois
        if (chJour < dernierJourDuMois(chMois, chAnn)) {
            nouveauJour++;
        } else { // dernier jour du mois
            nouveauJour = 1;

            if (chMois < 12) {
                nouveauMois++;
            } else { // dernier jour de l'année
                nouveauMois = 1;
                nouvelleAnnee++;
            }
        }

        return new Date(nouveauJour, nouveauMois, nouvelleAnnee);
    }

    public int compareTo(Date autreDate) {
        if (this.chAnn < autreDate.chAnn) {
            return -1;
        }
        if (this.chAnn > autreDate.chAnn) {
            return 1;
        }

        if (this.chMois < autreDate.chMois) {
            return -1;
        }
        if (this.chMois > autreDate.chMois) {
            return 1;
        }

        if (this.chJour < autreDate.chJour) {
            return -1;
        }
        if (this.chJour > autreDate.chJour) {
            return 1;
        }

        return 0;
    }


}