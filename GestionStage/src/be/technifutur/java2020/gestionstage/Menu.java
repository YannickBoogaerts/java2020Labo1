package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.Ctrl;
import be.technifutur.java2020.gestionstage.commun.User;

public class Menu {
    String input = null;
    private Ctrl ctrl;
    private User user;


    public void displayMenu() {
        showMenu();
        input = user.getInput();
        while (!(input.equalsIgnoreCase("q"))) {
            int choice = (Integer.parseInt(input));
            switch (choice) {
                case 1:
                    ctrl.createStage();
                    break;
                case 2:
                    ctrl.displayStage();
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
                "q. Quitter l'application.");
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCtrl(Ctrl ctrl) {
        this.ctrl = ctrl;
    }
}
