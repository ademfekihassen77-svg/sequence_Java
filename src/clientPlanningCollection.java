import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ClientPlanningCollection {

    public static void main(String[] args) {
        PlanningCollection planning = new PlanningCollection();
        try {
            Scanner scanner = new Scanner(new File("data" + File.separator + "planning.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                // trim() ôte le retour à la ligne au début de l’intitulé
                String intitule = scanner.next().trim();
                int jour = scanner.nextInt();
                int mois = scanner.nextInt();
                int annee = scanner.nextInt();
                int heureD = scanner.nextInt();
                int quartHeureD = scanner.nextInt();
                int heureF = scanner.nextInt();
                int quartHeureF = scanner.nextInt();

                planning.ajout(new Reservation(

                        new DateCalendrier(jour, mois, annee),
                        new PlageHoraire(new Horaire(heureD, quartHeureD),
                                new Horaire(heureF, quartHeureF ,
                        intitule ));


            }
            // scanner.next(); // pour tester l’exception NoSuchElementException
            scanner.close();
            // scanner.nextLine(); // pour tester l’exception IllegalStateException
        }

        catch (FileNotFoundException e) {
            System.out.println("fichier non trouvé : " + e.getMessage());
        }
        // Les exceptions levées par la méthode nextInt()
        catch (InputMismatchException e) {
            System.out.println("entier attendu"); // à tester en modifiant le fichier
        }
        catch (NoSuchElementException e) {
            System.out.println("scanner épuisé");
        }
        catch (IllegalStateException e) {
            System.out.println("scanner fermé");
        }

        // affichage du planning
        System.out.println(planning.toString());
    }
}