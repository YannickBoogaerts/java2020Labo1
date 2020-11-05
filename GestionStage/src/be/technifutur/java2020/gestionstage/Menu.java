package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.ActivityCtrlCreateActivity;
import be.technifutur.java2020.gestionstage.commun.StageCtrlCreateStage;
import be.technifutur.java2020.gestionstage.commun.StageCtrlDisplayStage;
import be.technifutur.java2020.gestionstage.commun.User;

public class Menu {
    String input = null;
    private StageCtrlCreateStage stageCtrlCreateStage;
    private StageCtrlDisplayStage stageCtrlDisplayStage;
    private ActivityCtrlCreateActivity activityCtrlCreateActivity;
    private User user;

    public void displayMenu() {
        showMenu();
        input = user.getInput();
        while (!(input.equalsIgnoreCase("q"))) {
            int choice = (Integer.parseInt(input));
            switch (choice) {
                case 1:
                    stageCtrlCreateStage.createStage();
                    break;
                case 2:
                    stageCtrlDisplayStage.displayStage();
                    break;
                case 3:
                    activityCtrlCreateActivity.createActivity();
                    break;

            }
            showMenu();
            input = user.getInput();
        }
    }

    private void showMenu() {
        System.out.println("" +
                "Veuillez choisir une option.\n" +
                "1. Créer un stage.\n" +
                "2. Liste des stages.\n" +
                "3. Créer une activitée\n" +
                "q. Quitter l'application.");
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStageCtrlCreateStage(StageCtrlCreateStage stageCtrlCreateStage) {
        this.stageCtrlCreateStage = stageCtrlCreateStage;
    }

    public void setStageCtrlDisplayStage(StageCtrlDisplayStage stageCtrlDisplayStage) {
        this.stageCtrlDisplayStage = stageCtrlDisplayStage;
    }

    public void setActivityCtrlCreateActivity(ActivityCtrlCreateActivity activityCtrlCreateActivity) {
        this.activityCtrlCreateActivity = activityCtrlCreateActivity;
    }

}
