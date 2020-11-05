package be.technifutur.java2020.gestionstage.commun;

import java.util.Collection;
import java.util.Map;

public class StageCtrlDisplayStage {
    private Vue vue;
    private StageList stageList;

    public void setStageList(StageList stageList) {
        this.stageList = stageList;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void displayStage() {
        Map<String, Stage> map = stageList.getMap();
        Collection<Stage> stage = map.values();
        for (Stage value : stage) {
            vue.affichageStage(value);
        }
    }

}

