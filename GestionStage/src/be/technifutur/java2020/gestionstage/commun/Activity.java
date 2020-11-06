package be.technifutur.java2020.gestionstage.commun;

import be.technifutur.java2020.gestionstage.exception.ExceptionGestionStageDate;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;


public class Activity {
    private String nameActivity;
    private LocalDateTime dateDebut;
    private int duration;
    private StageList stageList;

    public Activity(String nameActivity, LocalDateTime dateDebut, int duration, String nameStage) throws ExceptionGestionStageDate {
        if (dateFinStage(nameStage).isBefore(dateDebut.plusMinutes(duration))){
            throw new ExceptionGestionStageDate("Durée du stage dépasse la fin du stage");
        }
        setNameActivity(nameActivity);
        setDateDebut(dateDebut);
        setDuration(duration);

    }

    //TODO Si je fais une LinkedHashSet je dois changer hashcode et l'autre truc. A verifier


    private LocalDateTime dateFinStage(String nameStage) {
        Stage stage = stageList.getStage(nameStage);
        return stage.getDateFin();
    }

    public String getNameActivity() {
        return nameActivity;
    }

    public void setNameActivity(String nameActivity) {
        this.nameActivity = nameActivity;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setStageList(StageList stageList) {
        this.stageList = stageList;
    }
}