package be.technifutur.java2020.gestionstage.commun;

import be.technifutur.java2020.gestionstage.Menu;

public class Factory {

    /*
    CONSTRUCTEUR
     */
    public Factory() {

    }

    public Factory(User user) {
        this.user = user;
    }

    /*
    FIELD
     */

    private StageList stageList;
    private Vue vue;
    private StageCtrlCreateStage stageCtrlCreateStage;
    private StageCtrlDisplayStage stageCtrlDisplayStage;
    private ActivityCtrlCreateActivity activityCtrlCreateActivity;
    private DisplayHoraireCtrl displayHoraireCtrl;
    private Utility utility;
    private User user;

    /*
    METHOD
     */


    public Menu getMenu() {
        Menu menu = new Menu();
        menu.setStageCtrlCreateStage(getStageCtrlCreateStage());
        menu.setStageCtrlDisplayStage(getStageCtrlDisplayStage());
        menu.setActivityCtrlCreateActivity(getActivityCtrlCreateActivity());
        menu.setDisplayHoraireCtrl(getDisplayHoraireCtrl());
        menu.setUser(getUser());
        return menu;
    }


    public StageList getStageList() {
        if (this.stageList == null) {
            this.stageList = new StageList();
        }
        return stageList;
    }

    public Vue getVue() {
        if (this.vue == null) {
            this.vue = new Vue();
        }
        return vue;
    }


    public Utility getUtility() {
        if (utility == null) {
            this.utility = new Utility();
            this.utility.setVue(getVue());
            this.utility.setUser(getUser());
        }
        return utility;
    }

    public User getUser() {
        if (this.user == null) {
            this.user = new ConsoleUser();
        }
        return user;
    }

    public StageCtrlCreateStage getStageCtrlCreateStage() {
        if (this.stageCtrlCreateStage == null) {
            this.stageCtrlCreateStage = new StageCtrlCreateStage();
            this.stageCtrlCreateStage.setVue(getVue());
            this.stageCtrlCreateStage.setUtility(getUtility());
            this.stageCtrlCreateStage.setStageList(getStageList());
            this.stageCtrlCreateStage.setUser(getUser());
        }
        return stageCtrlCreateStage;
    }

    public StageCtrlDisplayStage getStageCtrlDisplayStage() {
        if (this.stageCtrlDisplayStage == null) {
            this.stageCtrlDisplayStage = new StageCtrlDisplayStage();
            this.stageCtrlDisplayStage.setStageList(getStageList());
            this.stageCtrlDisplayStage.setVue(getVue());
        }
        return stageCtrlDisplayStage;
    }

    public ActivityCtrlCreateActivity getActivityCtrlCreateActivity() {
        if (this.activityCtrlCreateActivity == null) {
            activityCtrlCreateActivity = new ActivityCtrlCreateActivity();
            activityCtrlCreateActivity.setUtility(getUtility());
            activityCtrlCreateActivity.setVue(getVue());
            activityCtrlCreateActivity.setUser(getUser());
            activityCtrlCreateActivity.setStageList(getStageList());
        }
        return activityCtrlCreateActivity;
    }

    public DisplayHoraireCtrl getDisplayHoraireCtrl() {
        if (this.displayHoraireCtrl==null){
            this.displayHoraireCtrl = new DisplayHoraireCtrl();
            displayHoraireCtrl.setStageList(getStageList());
            displayHoraireCtrl.setUser(getUser());
            displayHoraireCtrl.setUtility(getUtility());
            displayHoraireCtrl.setVue(getVue());
        }

        return displayHoraireCtrl;
    }
}
