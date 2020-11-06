package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.*;

public class DisplayHoraireCtrl {
    /*
    FIELD
     */
    private Utility utility;
    private Vue vue;
    private User user;
    private StageList stageList;

    /*
    METHOD
     */

    public void displayHoraireStage() {
        String nameStage;
        boolean displayHoraire = true;
        vue.consigneAjoutNomStage();
        nameStage = user.getInput();
        while (!nameStage.equalsIgnoreCase("q") && nameStage.isEmpty()) {
            vue.consigneAjoutNomStage();
            nameStage = user.getInput();
        }
        if (nameStage.equalsIgnoreCase("q")) {
            displayHoraire = false;
        }
        if (displayHoraire) {
            Stage stage = stageList.getStage(nameStage);
            Collection<Activity> activityCollection = stage.getActivityCollection();
            List<Activity> activityList = new ArrayList<>(activityCollection);
            activityList.sort(new MyComparatorActivity());
            vue.afficheHoraire(stage, activityList);
        }
    }



    /*
    SETTER
     */

    public void setUtility(Utility utility) {
        this.utility = utility;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStageList(StageList stageList) {
        this.stageList = stageList;
    }
}
