package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;

public class Activity {
    private String nameActivity;
    private LocalDateTime dateDebut;
    private int duration;

    public Activity(LocalDateTime dateDebut, int duration, String nameStage) {
        setNameActivity(nameActivity);
        setDateDebut(dateDebut);
        setDuration(duration);
    }

    //TODO Si je fais une LinkedHashSet je dois changer hashcode et l'autre truc. A verifier


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (duration != activity.duration) return false;
        if (nameActivity != null ? !nameActivity.equals(activity.nameActivity) : activity.nameActivity != null)
            return false;
        return dateDebut != null ? dateDebut.equals(activity.dateDebut) : activity.dateDebut == null;
    }

    @Override
    public int hashCode() {
        int result = nameActivity != null ? nameActivity.hashCode() : 0;
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + duration;
        return result;
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