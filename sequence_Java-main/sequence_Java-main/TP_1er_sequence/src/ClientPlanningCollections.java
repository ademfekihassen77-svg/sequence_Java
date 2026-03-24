import java.util.*;
import java.io.*;

public class ClientPlanningCollections {

    public static void main(String[] args) {

        PlanningCollections planning = new PlanningCollections();

        try {
            Scanner scanner = new Scanner(new File("data" + File.separator + "planning.txt"));
            scanner.useDelimiter(",");

            while (scanner.hasNext()) {

                String intitule = scanner.next().trim();
                int jour = scanner.nextInt();
                int mois = scanner.nextInt();
                int annee = scanner.nextInt();
                int heureD = scanner.nextInt();
                int quartHeureD = scanner.nextInt();
                int heureF = scanner.nextInt();
                int quartHeureF = scanner.nextInt();


                planning.ajout(new Reservation(
                        new PlageHoraire(
                                new Horaire(heureD, quartHeureD),
                                new Horaire(heureF, quartHeureF)),
                        new DateCalendrier(jour, mois, annee),
                        intitule));

            }
            // scanner.next(); // pour tester l'exception NoSuchElementException
            scanner.close();
            // scanner.nextLine(); // pour tester l'exception IllegalStateException

        } catch (FileNotFoundException e) {
            System.out.println("fichier non trouvé : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("entier attendu");
        } catch (NoSuchElementException e) {
            System.out.println("scanner épuisé");
        } catch (IllegalStateException e) {
            System.out.println("scanner fermé");
        }

        // affichage du planning
        System.out.println(planning.toString());
        System.out.println(planning.getReservations(new DateCalendrier(2,5,2026)));
    }
}