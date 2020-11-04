package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Ctrl {
    private Vue vue;
    private Model model;
    private Utility utility = new Utility();
    private List<Stage> setStage;

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void createStage() {
        Scanner scanner = new Scanner(System.in);
        String name;
        LocalDateTime dateDebut = null, dateFin = null;
        boolean insertStage = true;
        while (insertStage) {
            vue.consigneAjoutNomStage();
            name = scanner.nextLine();
            while (name.equals("")) {
                vue.consigneAjoutNomStage();
                name = scanner.nextLine();
            }
            if (insertStage) {
                vue.ajoutDateDebut();
                dateDebut = utility.saisirDate();
                if (dateDebut == null) {
                    insertStage = false;
                }
            }
            if (insertStage) {
                vue.ajoutDateFin();
                dateFin = utility.saisirDate();
                if (dateFin == null) {
                    insertStage = false;
                }
            }
            if (insertStage){
                addStage(dateDebut,dateFin,name);
                insertStage = false;
            }

        }
    }

    public void setSetStage(List<Stage> setStage) {
        this.setStage = setStage;
    }
}
