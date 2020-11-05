package be.technifutur.java2020.gestionstage.commun;

import be.technifutur.java2020.gestionstage.exception.ExceptionGestionStageDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Stage {

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String intituleStage;
    //TODO list of activity
    /*private int nbrParticipantMax;
    private int nbrParticipantInscrit = 0;*/

    public Stage(LocalDateTime dateDebut, LocalDateTime dateFin, String intituleStage) throws ExceptionGestionStageDate {
        if (dateFin.isBefore(dateDebut)) {
            throw new ExceptionGestionStageDate("La date de fin n'est pas valide.");
        }
        setDateDebut(dateDebut);
        setDateFin(dateFin);
        setIntituleStage(intituleStage);
    }

    @Override
    public String toString() {
        return "Intitule du stage : " + intituleStage + ".\n" +
                "Date de début du stage : " + dateDebut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) +
                ".\nDate de fin du stage : " + dateFin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm"))+"\n";

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
