package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;

public class Activity {
    private String nameActivity;
    private LocalDateTime dateDebut;
    private int duration;

    public Activity(String nameActivity, LocalDateTime dateDebut, int duration, String nameStage, LocalDateTime dateFinStage){
        //TODO faire les verif sur calcul heure de stage/activité
        setNameActivity(nameActivity);
        setDateDebut(dateDebut);
        setDuration(duration);
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
}