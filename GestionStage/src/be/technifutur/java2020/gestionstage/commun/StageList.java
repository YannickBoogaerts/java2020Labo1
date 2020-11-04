package be.technifutur.java2020.gestionstage.commun;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StageList {
    private List<Stage> setStage = new ArrayList<>();

    public void addStage(LocalDateTime dateDebut, LocalDateTime dateFin, String intituleStage) {
        setStage.add(new Stage(dateDebut, dateFin, intituleStage));
    }

    public void removeStage() {

    }

    public void searchStage() {

    }
}
