package be.technifutur.java2020.gestionstage.commun;

import java.util.Scanner;

public class Ctrl {
    private Vue vue;
    private Model model;

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void createStage() {
        Scanner scanner = new Scanner(System.in);
        String inputDate = null,name = null;
        int year, month, day,hour,minute;
        vue.consigneAjoutNomStage();
        name = scanner.nextLine();
        while (name  == null){
            vue.consigneAjoutNomStage();
            name = scanner.nextLine();
        }
        vue.consigneAjoutDateStage();
        while(!inputDate.equalsIgnoreCase("q")){
            if(inputDate.matches("([0][1-9]|[1-2][0-9]|[3][0-1])\\.([0][1-9]|[1][0-2])\\.(20[0-9][0-9])\\.([0][0-9]|[1][0-9]|[2][0-3])\\.([0-5][0-9])")){

            }
        }


    }
}
