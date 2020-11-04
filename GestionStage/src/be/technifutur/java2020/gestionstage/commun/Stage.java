package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;

public class Stage {

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String intituleStage;
    /*private int nbrParticipantMax;
    private int nbrParticipantInscrit = 0;*/


    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(int year, int month, int dayOfMonth, int hour, int minute) {
        setDateDebut(LocalDateTime.of(year, month, dayOfMonth, hour, minute));
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(int year, int month, int dayOfMonth, int hour, int minute) {
        setDateDebut(LocalDateTime.of(year, month, dayOfMonth, hour, minute));
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
