package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;

public class Activity {
    private String name;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private LocalDateTime duration;

    public Activity(String name, LocalDateTime dateDebut, LocalDateTime dateFin, LocalDateTime duration){
        setName(name);
        setDateDebut(dateDebut);
        setDateFin(dateFin);
        setDuration(duration);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public LocalDateTime getDuration() {
        return duration;
    }

    public void setDuration(LocalDateTime duration) {
        this.duration = duration;
    }
}
