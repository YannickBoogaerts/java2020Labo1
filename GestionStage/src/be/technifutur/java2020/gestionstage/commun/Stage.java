package be.technifutur.java2020.gestionstage.commun;

import be.technifutur.java2020.gestionstage.exception.ExceptionGestionStage;
import be.technifutur.java2020.gestionstage.exception.ExceptionGestionStageDate;
import be.technifutur.java2020.gestionstage.exception.ExceptionGestionStageDoublonActivity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Stage {

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String intituleStage;
    private Map<String, Activity> mapActivity;
    /*private int nbrParticipantMax;
    private int nbrParticipantInscrit = 0;*/

    public Stage(LocalDateTime dateDebut, LocalDateTime dateFin, String intituleStage) throws ExceptionGestionStageDate {
        if (dateFin.isBefore(dateDebut)) {
            throw new ExceptionGestionStageDate("La date de fin n'est pas valide.");
        }
        setDateDebut(dateDebut);
        setDateFin(dateFin);
        setIntituleStage(intituleStage);
        mapActivity = new HashMap<>();
    }

    public void addActivity(LocalDateTime dateDebut, int duration, String nameActivity) throws ExceptionGestionStage {
        if (mapActivity.containsKey(nameActivity)) {
            throw new ExceptionGestionStageDoublonActivity("Cette activité existe déjà pour ce stage.");
        }
        if (dateFin.isBefore(dateDebut.plusMinutes(duration))) {
            throw new ExceptionGestionStageDate("La durée de l'activité dépasse la fin du stage.");
        }
        mapActivity.put(nameActivity, new Activity(dateDebut, duration, nameActivity));
    }


    public Map<String, Activity> getMapActivity() {
        return mapActivity;
    }

    public Collection<Activity> getActivityCollection() {
        return mapActivity.values();
    }

    /*
    GETTER / SETTER
     */

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }


    public String getIntituleStage() {
        return intituleStage;
    }

    public void setIntituleStage(String intituleStage) {
        this.intituleStage = intituleStage;
    }





   /* public int getNbrParticipantMax() {
        return nbrParticipantMax;
    }

    public void setNbrParticipantMax(int nbrParticipantMax) {
        this.nbrParticipantMax = nbrParticipantMax;
    }

    public int getNbrParticipantInscrit() {
        return nbrParticipantInscrit;
    }

    public void addNbrParticipantInscrit() {
        if (this.nbrParticipantInscrit <= this.nbrParticipantMax){
            this.nbrParticipantInscrit++;
        }else {
            // pas possible
        }
    }*/
}
