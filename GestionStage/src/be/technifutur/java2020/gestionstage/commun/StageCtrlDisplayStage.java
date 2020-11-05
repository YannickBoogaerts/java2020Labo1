package be.technifutur.java2020.gestionstage.commun;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class StageCtrlDisplayStage {

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

    public void displayStage() {
        Map<String, Stage> map = stageList.getMap();
        Collection<Stage> stage = map.values();
        Iterator<Stage> iterator = stage.iterator();
        while (iterator.hasNext()) {
            vue.affichageStage(iterator.next());
        }
    }
}

