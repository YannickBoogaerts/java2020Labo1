package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Stage {

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String intituleStage;
    /*private int nbrParticipantMax;
    private int nbrParticipantInscrit = 0;*/

    public Stage(LocalDateTime dateDebut, LocalDateTime dateFin, String intituleStage) {

        setDateDebut(dateDebut);
        setDateFin(dateFin);
        setIntituleStage(intituleStage);
    }

    @Override
    public String toString() {
        return "Date de début du stage : " + dateDebut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) +
                ".\nDate de fin du stage : " + dateFin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) +
                ".\nIntitule du stage : " + intituleStage + "\n";
    }    //TODO mettre dans la vue

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
