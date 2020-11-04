package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.Ctrl;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String input = null;
    private Ctrl ctrl;

    public void setCtrl(Ctrl ctrl) {
        this.ctrl = ctrl;
    }

    public void displayMenu() {
        showMenu();
        input = scanner.nextLine();
        while (!(input.equalsIgnoreCase("q"))) {
            int choice = (Integer.parseInt(input));
            switch (choice){
                case 1 :
                    ctrl.createStage();
                    break;
            }
            showMenu();
            input = scanner.nextLine();
        }
    }

    private void showMenu() {
        System.out.println("" +
                "Veuillez choisir une option.\n" +
                "1. Créer un stage.\n" +
                "2. Liste des stages.\n" +
                "q. Quitter l'application.");
    }
}
