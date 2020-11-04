package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application gestion de stage");
        Factory factory = new Factory();
        Menu menu = factory.getMenu();
        factory = null;
        menu.displayMenu();
    }
}
