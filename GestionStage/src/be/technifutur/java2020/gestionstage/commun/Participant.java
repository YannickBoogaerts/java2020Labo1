package be.technifutur.java2020.gestionstage.commun;


import java.util.Map;

public class Participant {

    /*
    FIELD
    */
    // Identification = nom+prenom
    private String nomParticipant;
    private String prenomParticipant;
    private String nomClub; // nom du club du participant (non obligatoire)
    private String adresseMail; // adresse mail du participant (non obligatoire)
    private Map<String, Stage> listStageParticipant; // nom du stage en key / 1 ou +

    /*
    CONSTRUCTOR
     */

    public Participant(String nomParticipant, String prenomParticipant, String nomClub, String adresseMail) {
        this.nomParticipant = nomParticipant.toUpperCase();
        this.prenomParticipant = prenomParticipant.toUpperCase();
        this.nomClub = nomClub;
        this.adresseMail = adresseMail;
    }

    /*
    METHOD
     */



    /*
    SETTER AND GETTER
     */

    public String getNomParticipant() {
        return nomParticipant;
    }

    public void setNomParticipant(String nomParticipant) {
        this.nomParticipant = nomParticipant;
    }

    public String getPrenomParticipant() {
        return prenomParticipant;
    }

    public void setPrenomParticipant(String prenomParticipant) {
        this.prenomParticipant = prenomParticipant;
    }

    public String getIDParticipant() {
        return nomParticipant.concat(prenomParticipant);
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    //KEY nom stage
    public Map<String, Stage> getListStageParticipant() {
        return listStageParticipant;
    }

    public void setListStageParticipant(Map<String, Stage> listStageParticipant) {
        this.listStageParticipant = listStageParticipant;
    }

    /*public static void main(String[] args) {
        Participant toto = new Participant("toto", "jojo",null,null);
        System.out.println("ID du participant : " + toto.getNomPrenomParticipant());
        System.out.println("Nom du participant : " + toto.getNomParticipant());
        System.out.println("Prénom du participant : " + toto.getPrenomParticipant());
        if (toto.nomClub != null) {
            System.out.println("Nom du club du participant : " + toto.getNomClub());
        }
        if (toto.adresseMail != null) {
            System.out.println("Adresse mail du participant : " + toto.getAdresseMail());
        }

    }*/
}
