package be.technifutur.java2020.gestionstage.commun;

public class Vue {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void consigneAjoutNomStage(){
        System.out.println("Veuillez choisir un nom de stage");
    }

    public void ajoutDateDebut(){
        System.out.println("Entrée la date et l'heure de début");
    }

    public void ajoutDateFin(){
        System.out.println("Entrée la date et l'heure de fin");
    }

    public void consigneAjoutDateStage(){
        System.out.println("Veuillez ajouter la date et l'heure sous le format suivant : \"jj\".\"mm\".\"aaaa\".\"hh\".\"mm\" ou \"q\" pour quitter");
    }
    public void setError(String message) {
        System.out.println(message);
    }
}
