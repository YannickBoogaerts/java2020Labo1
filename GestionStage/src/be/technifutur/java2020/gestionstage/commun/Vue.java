package be.technifutur.java2020.gestionstage.commun;

import javax.swing.text.Style;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

public class Vue {

    public void consigneAjoutNomStage() {
        System.out.println("Veuillez choisir un nom de stage ou insérer \"q\" pour quitter");
    }

    public void consigneAjoutNomActivity() {
        System.out.println("Veuillez choisir un nom d'activitée ou insérer \"q\" pour quitter");
    }

    public void consigneAjoutDuree() {
        System.out.println("" +
                "Veuillez saisir une durée en minute ou \"q\" pour quitter." +
                "Une durée d'activitée doit être supérieure à 0 minute"
        );
    }

    public void ajoutDateDebut() {
        System.out.println("Entrée la date et l'heure de début");
    }

    public void ajoutDateFin() {
        System.out.println("Entrée la date et l'heure de fin");
    }

    public void consigneAjoutDateStage() {
        System.out.println("Veuillez ajouter la date et l'heure sous le format suivant : \"jj\".\"mm\".\"aaaa\".\"hh\".\"mm\" ou \"q\" pour quitter.");
    }

    public void setError(String message) {
        System.out.println(message);
    }

    public void afficheStage(Stage stage) {
        afficheStage(stage.getIntituleStage(), stage.getDateDebut(), stage.getDateFin());
    }

    public void afficheStage(String name, LocalDateTime dateDebut, LocalDateTime dateFin) {
        System.out.println("" +
                "Nom du stage : " + name + "\n" +
                "Début du stage : " + dateDebut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\n" +
                "Fin du stage : " + dateFin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\n"
        );
    }

    public void afficheHoraire(Stage stage, List<Activity> activityList) {
        LocalDate dateDebutStage = stage.getDateDebut().toLocalDate();
        System.out.println("Horaire du stage : " + stage.getIntituleStage());
        System.out.println("" +
                dateDebutStage.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE).toUpperCase() + " " +
                dateDebutStage.getDayOfMonth() + " " +
                dateDebutStage.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE).toUpperCase() + " " +
                dateDebutStage.getYear()
        );
        for (Activity activity : activityList) {
            if (dateDebutStage.isBefore(activity.getDateDebut().toLocalDate())) {
                dateDebutStage = activity.getDateDebut().toLocalDate();
                System.out.println("" +
                        dateDebutStage.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE).toUpperCase() + " " +
                        dateDebutStage.getDayOfMonth() + " " +
                        dateDebutStage.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE).toUpperCase() + " " +
                        dateDebutStage.getYear()
                );
            }
            System.out.print("      " +
                    activity.getDateDebut().format(DateTimeFormatter.ofPattern("H'h'mm")) + " - " +
                    activity.getDateDebut().plusMinutes(activity.getDuration()).format(DateTimeFormatter.ofPattern("H'h'mm")) + " " +
                    activity.getNameActivity() + " " +
                    "(" + activity.getDuration() + " minutes)" + "\n"
            );
        }
    }
}
