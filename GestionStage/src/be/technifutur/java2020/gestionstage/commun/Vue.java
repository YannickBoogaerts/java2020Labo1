package be.technifutur.java2020.gestionstage.commun;

public class Vue {

    public void consigneAjoutNomStage() {
        System.out.println("Veuillez choisir un nom de stage");
    }

    public void consigneAjoutNomActivity() {
        System.out.println("Veuillez choisir un nom d'activitée");
    }

    public void consigneAjoutDuree() {
        System.out.println("" +
                "Veuillez saisir une durée en minute ou \"q\" pour quitter." +
                "Une durée d'activité doit être supérieur à 0 minutes"
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

    public void affichageStage(Stage stage) {
        System.out.println("\n" + stage);
    }
}
