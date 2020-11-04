package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.Ctrl;
import be.technifutur.java2020.gestionstage.commun.Model;
import be.technifutur.java2020.gestionstage.commun.Vue;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String input = null;

    public void displayMenu() {
        Vue vue = new Vue();
        Ctrl ctrl = new Ctrl();
        Model model = new Model();
        vue.setModel(model);
        ctrl.setModel(model);
        ctrl.setVue(vue);

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
                "q. Quitter l'application.");
    }
}
