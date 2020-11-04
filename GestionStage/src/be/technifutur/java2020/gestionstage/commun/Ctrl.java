package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ctrl {
    private Vue vue;
    private Model model;
    private Utility utility = new Utility();

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void createStage() {
        Scanner scanner = new Scanner(System.in);
        String inputDate, name;
        LocalDateTime dateDebut, dateFin;
        int year, month, day, hour, minute;
        boolean insertStage = true;
        while (insertStage) {
            vue.consigneAjoutNomStage();
            name = scanner.nextLine();
            while (name.equals("")) {
                vue.consigneAjoutNomStage();
                name = scanner.nextLine();
            }

            vue.ajoutDateDebut();
            dateDebut = utility.saisirDate();


            vue.ajoutDateFin();
            dateFin = utility.saisirDate();

            insertStage = false;
        }
    }
}
