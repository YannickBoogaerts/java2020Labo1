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
                "12.10.2020.16.00",
                "2",
                "3",
                "1",
                "Ztage",
                "Angular",
                "10.10.2020.08.00",
                "60",
                "1",
                "Ztage",
                "Java base 1",
                "10.10.2020.08.00",
                "60",
                "1",
                "Ztage",
                "Communication",
                "11.10.2020.09.00",
                "85",
                "1",
                "Ztage",
                "Android 1",
                "11.10.2020.12.00",
                "125",
                "1",
                "Ztage",
                "Android 2",
                "12.10.2020.14.00",
                "115",
                "q",
                "3",
                "1",
                "Ztage",
                "Java base 2",
                "12.10.2020.11.45",
                "180",
                "2",
                "Ztage",
                "3",
                "Ctage Multisport",
                "Jonathan",
                "Arabia",
                "q",
                "q"
        };
        return new ArrayUser(Arrays.asList(inputTab).iterator());
    }

}
