package be.technifutur.java2020.gestionstage.commun;

import be.technifutur.java2020.gestionstage.Menu;

public class Factory {
    private StageList stageList;
    private Vue vue;
    private Ctrl ctrl;
    private Utility utility;
    private Model model;


    public Menu getMenu() {
        Menu menu = new Menu();
        menu.setCtrl(getCtrl());
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
            this.vue.setModel(getModel());
        }
        return vue;
    }

    public Ctrl getCtrl() {
        if (this.ctrl == null) {
            this.ctrl = new Ctrl();
            this.ctrl.setVue(getVue());
            this.ctrl.setUtility(getUtility());
            this.ctrl.setStageList(getStageList());
        }
        return ctrl;
    }

    public Utility getUtility() {
        if (utility == null) {
            this.utility = new Utility();
        }
        return utility;
    }

    public Model getModel() {
        if (this.model == null) {
            model = new Model();
        }
        return model;

    }
}