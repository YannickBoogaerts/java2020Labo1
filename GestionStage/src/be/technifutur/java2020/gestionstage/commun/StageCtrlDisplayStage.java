package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;

public class StageCtrlDisplayStage {
    private Vue vue;
    private StageList stageList;

    public void displayStage() {
        Map<String, Stage> map = stageList.getMap();
        String name;
        LocalDateTime dateDebut, dateFin;
        Collection<Stage> stage = map.values();
        for (Stage value : stage) {
            name = (value.getIntituleStage());
            dateDebut = (value.getDateDebut());
            dateFin = (value.getDateFin());
            vue.afficheStage(name,dateDebut,dateFin);

        }
    }

    public void setStageList(StageList stageList) {
        this.stageList = stageList;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

}

