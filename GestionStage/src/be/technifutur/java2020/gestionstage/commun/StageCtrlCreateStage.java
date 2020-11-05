package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.*;

public class StageCtrlCreateStage {
    private Vue vue;
    private Utility utility;
    private StageList stageList;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setStageList(StageList stageList) {
        this.stageList = stageList;
    }

    public void setUtility(Utility utility) {
        this.utility = utility;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void createStage() {
        String name;
        LocalDateTime dateDebut = null, dateFin = null;
        boolean insertStage = true;
        while (insertStage) {
            vue.consigneAjoutNomStage();
            name = user.getInput();
            while (name.equals("")) {
                vue.consigneAjoutNomStage();
                name = user.getInput();
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
            if (insertStage) {
                try {
                    stageList.addStage(dateDebut, dateFin, name);
                    Stage stage = stageList.getStage(name);
                    vue.affichageStage(stage);
                } catch (ExceptionGestionStage e) {
                    vue.setError("Date de fin non valide\n");
                }
                insertStage = false;
            }
        }
    }
}
