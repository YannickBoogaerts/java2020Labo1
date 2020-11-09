package be.technifutur.java2020.gestionstage.commun;

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
        nameStage = utility.saisirName("Veuillez choisir un nom de stage ou insérer \"q\" pour quitter");
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
