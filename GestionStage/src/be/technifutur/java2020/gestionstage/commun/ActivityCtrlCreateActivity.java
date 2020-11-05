package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.OptionalInt;

public class ActivityCtrlCreateActivity {
    private Utility utility;
    private Vue vue;
    private User user;
    private StageList stageList;

    public void createActivity() {
        String nameActivity, nameStage;
        int duration;
        LocalDateTime dateDebut = null;
        boolean createStage = true;

        vue.consigneAjoutNomStage();
        nameStage = user.getInput();
        while (nameStage.isEmpty()) {
            vue.consigneAjoutNomStage();
            nameStage = user.getInput();
        }
        createStage = nameStageIsValid(nameStage);

        if (createStage){
            vue.ajoutDateDebut();
            dateDebut = utility.saisirDate();
            if (dateDebut == null) {
                createStage = false;
            }
        }
        //TODO NOM DE L ACTIVITE PARDI !

        if (createStage){
            OptionalInt inputDuration;
            vue.consigneAjoutDuree();
            inputDuration = utility.saisirDuree();
            if (inputDuration.isEmpty()){
                createStage = false;
            }else {
                duration = inputDuration.getAsInt();
            }
        }
        if (createStage){
            //TODO CREER ET INSERER L ACTIVITE
        }



    }

    /*
    verifier que le stage existe
     */
    private boolean nameStageIsValid(String nameStage) {
        boolean isValid = false;
        Collection<String> collection = stageList.getStringCollection();
        if (collection.contains(nameStage)) {
            isValid = true;
        }
        return isValid;

    }

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
