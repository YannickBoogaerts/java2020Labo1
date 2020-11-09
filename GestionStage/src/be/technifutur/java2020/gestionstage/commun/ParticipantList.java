package be.technifutur.java2020.gestionstage.commun;

import java.util.HashMap;
import java.util.Map;

public class ParticipantList {
    /*
    FIELD
     */
    private Map<String,Participant> mapParticipant = new HashMap<>(); // key = NOM+PRENOM

    /*
    METHOD
     */

    public void addParticipant(String IDParticipant, Participant participant){
        mapParticipant.put(IDParticipant,participant);
    }

    /*
    GETTER AND SETTER
     */

    public Map<String, Participant> getMapParticipant() {
        return mapParticipant;
    }

    public void setMapParticipant(Map<String, Participant> mapParticipant) {
        this.mapParticipant = mapParticipant;
    }
}
