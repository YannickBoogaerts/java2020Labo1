package be.technifutur.java2020.gestionstage.commun;

import be.technifutur.java2020.gestionstage.Menu;

public class Factory {

    public Factory(){

    }

    public Factory(User user){
        this.user = user;
    }


    private StageList stageList;
    private Vue vue;
    private Ctrl ctrl;
    private Utility utility;
    private User user;


    public Menu getMenu() {
        Menu menu = new Menu();
        menu.setCtrl(getCtrl());
        menu.setUser(getUser());
        return menu;
    }

    public Ctrl getCtrl() {
        if (this.ctrl == null) {
            this.ctrl = new Ctrl();
            this.ctrl.setVue(getVue());
            this.ctrl.setUtility(getUtility());
            this.ctrl.setStageList(getStageList());
            this.ctrl.setUser(getUser());
        }
        return ctrl;
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
        }
        this.utility.setVue(getVue());
        this.utility.setUser(getUser());
        return utility;
    }

    public User getUser() {
        if (this.user == null){
            this.user = new ConsoleUser();
        }
        return user;
    }

}
