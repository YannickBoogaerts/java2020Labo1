package be.technifutur.java2020.gestionstage.commun;



import java.time.LocalDateTime;
import java.util.*;

public class StageList {
    private Map<String, Stage> mapStage = new TreeMap<>();

    public void setMapStage(Map<String, Stage> mapStage) {
        this.mapStage = mapStage;
    }

    public void addStage(LocalDateTime dateDebut, LocalDateTime dateFin, String intituleStage) throws ExceptionGestionStageDate {
        mapStage.put(intituleStage, new Stage(dateDebut, dateFin, intituleStage));
    }

    public void removeStage() {

    }

    public void searchStage() {

    }

    public Stage getStage(String name) {
        return mapStage.get(name);
    }

    public Map getMap(){
        return Collections.unmodifiableMap(mapStage);
    }

}
