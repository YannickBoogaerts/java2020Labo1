package be.technifutur.java2020.gestionstage.commun;

public class Vue {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void consigneAjoutNomStage(){
        System.out.println("Veuillez choisir un nom de stage");
    }

    public void consigneAjoutDateStage(){
        System.out.println("Veuillez ajouter la date et l'heure sous le format suivant : \"jj\".\"mm\".\"aaaa\".\"hh\".\"mm\"");
    }


}
