package be.technifutur.java2020.gestionstage.commun;

import java.util.Date;

public class Stage {
    private Date dateDebut = new Date();
    private Date dateFin = new Date();
    private String intituleStage;
    private int nbrParticipant;

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(int year, int month, int day) {
        setDateDebut(new Date(year, month, day));
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }


    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(int year, int month, int day) {
        setDateDebut(new Date(year, month, day));
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getIntituleStage() {
        return intituleStage;
    }

    public void setIntituleStage(String intituleStage) {
        this.intituleStage = intituleStage;
    }

    public int getNbrParticipant() {
        return nbrParticipant;
    }

    public void setNbrParticipant(int nbrParticipant) {
        this.nbrParticipant = nbrParticipant;
    }
}
