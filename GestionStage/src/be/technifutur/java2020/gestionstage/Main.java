package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.ArrayUser;
import be.technifutur.java2020.gestionstage.commun.Factory;
import be.technifutur.java2020.gestionstage.commun.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application gestion de stage");
        Factory factory = new Factory();
        Menu menu = factory.getMenu();
        menu.setUser(getUser());
        factory = null;
        menu.displayMenu();
    }

    private static User getUser() {
        String[] inputTab = new String[]{
                "1",
                "10.10.2020.08.00",
                "10.10.2020.08.30",
                "q"
        };
        return new ArrayUser(Arrays.asList(inputTab).iterator());
    }
}
