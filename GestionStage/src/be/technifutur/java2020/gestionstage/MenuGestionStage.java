package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.ActivityCtrlCreateActivity;
import be.technifutur.java2020.gestionstage.commun.DisplayHoraireCtrl;
import be.technifutur.java2020.gestionstage.commun.User;

public class MenuGestionStage {

    /*
    FIELD
     */
    private String input = null;
    private DisplayHoraireCtrl displayHoraireCtrl;
    private ActivityCtrlCreateActivity activityCtrlCreateActivity;
    private User user;


    /*
    METHOD
     */

    public void menu() {
        showMenu();
        input = user.getInput();
        while (!(input.equalsIgnoreCase("q"))) {
            int choice = (Integer.parseInt(input));
            switch (choice) {
                case 1:
                    activityCtrlCreateActivity.createActivity();
                    break;
                case 2:
                    displayHoraireCtrl.displayHoraireStage();
                    break;
            }
            showMenu();
            input = user.getInput();
        }
    }

    private void showMenu() {
        System.out.println("" +
                "Veuillez choisir une option.\n" +
                "1. Ajouter une activitée à un stage.\n" + /* repack 2 et 3 et 4 dans un sous-menu */
                "2. Afficher les activitées d'un stage\n" +
                "q. Quitter l'application.");
    }

    /*
    SETTER AND GETTER
     */

    public void setDisplayHoraireCtrl(DisplayHoraireCtrl displayHoraireCtrl) {
        this.displayHoraireCtrl = displayHoraireCtrl;
    }

    public void setActivityCtrlCreateActivity(ActivityCtrlCreateActivity activityCtrlCreateActivity) {
        this.activityCtrlCreateActivity = activityCtrlCreateActivity;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
