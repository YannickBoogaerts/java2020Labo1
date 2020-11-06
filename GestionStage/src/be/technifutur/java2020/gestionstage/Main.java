package be.technifutur.java2020.gestionstage;

import be.technifutur.java2020.gestionstage.commun.ArrayUser;
import be.technifutur.java2020.gestionstage.commun.Factory;
import be.technifutur.java2020.gestionstage.commun.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application gestion de stage");
        Factory factory = new Factory(getUser()); //mettre ou non le getUser si je veux automatique ou non
        Menu menu = factory.getMenu();
        factory = null;
        menu.displayMenu();
    }

    private static User getUser() {
        String[] inputTab = new String[]{
                "1",
                "Stage de Karaté -15",
                "02.12.2020.08.00",
                "10.10.2021.16.00",
                "1",
                "Ctage Multisport",
                "10.10.2020.08.00",
                "24.02.2021.16.00",
                "1",
                "Ztage",
                "10.10.2020.08.00",
                "10.10.2020.09.30",
                "2",
                "3",
                "Ztage",
                "Activité",
                "10.10.2020.08.00",
                "60",
                "3",
                "Ztage",
                "Activité",
                "10.10.2020.08.00",
                "60",
                "q"
        };
        return new ArrayUser(Arrays.asList(inputTab).iterator());
    }

}
