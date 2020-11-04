package be.technifutur.java2020.gestionstage.commun;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class StageList {
    private Map<String,Stage> setStage = new TreeMap<>();

    public void addStage(LocalDateTime dateDebut, LocalDateTime dateFin, String intituleStage) {
        // TODO verif date debut - date fin
        dateDebut.compareTo(dateFin);
        // TODO verif nom stage <-- map
        setStage.put(intituleStage,new Stage(dateDebut, dateFin, intituleStage));
    }

    public void removeStage() {

    }

    public void searchStage() {

    }

    public void getStage(String name) {
        //TODO affiche le stage correspond au nom
        Stage stage = setStage.get(name);
        System.out.println(stage);
    }
}
