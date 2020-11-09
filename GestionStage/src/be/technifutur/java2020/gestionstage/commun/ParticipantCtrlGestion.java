package be.technifutur.java2020.gestionstage.commun;

public class ParticipantCtrlGestion {

    /*
    FIELD
     */
    private User user;
    private Utility utility;
    private Vue vue;
    private ParticipantList participantList;
    private StageList stageList;


    /*
    METHOD
     */

    public void gestionParticipant() {
        String nomParticipant, prenomParticipant, nameStage;
        nameStage = utility.saisirName("Veuillez insérer le nom du stage auquel le participant veut s'inscrire ou est inscrit. Insérer \"q\" pour quitter");
        if (!nameStage.isEmpty()) {
            nomParticipant = utility.saisirName("Veuillez saisir le nom du participant. Insérer \"q\" pour quitter");
            if (!nomParticipant.isEmpty()) {
                prenomParticipant = utility.saisirName("Veuillez saisir le prénom du participant. Insérer \"q\" pour quitter");
                if (!prenomParticipant.isEmpty()) {
                    String IDParticipant = nomParticipant.concat(prenomParticipant);
                    Stage stage = stageList.getStage(nameStage);
                    if (stage.getMapParticipant().containsKey(nomParticipant.concat(prenomParticipant))) {
                        modifParticipant(participantList.getParticipant(IDParticipant));
                    } else {
                        createParticipant(IDParticipant,nomParticipant, prenomParticipant, stage);
                    }
                }
            }
        }
    }

    //Modification d'information d'un participant
    private void modifParticipant(Participant participant) {
        vue.afficheMessage("Données du Participant : ");
        vue.afficheParticipant(participant);
    }

    //Creation d'un participant
    private void createParticipant(String IDParticipant, String nomParticipant, String prenomParticipant, Stage stage) {
        String mailParticipant, clubParticipant;
        clubParticipant = utility.saisirName("Veuillez saisir le nom du club du participant ou insérer \"q\" pour laisser vide.");
        mailParticipant = utility.saisirMail("Veuillez saisir l'adresse mail du participant ou insérer \"q\" pour laisser vide.");
        Participant participant = stage.createParticipant(IDParticipant,nomParticipant,prenomParticipant,clubParticipant,mailParticipant);
        participantList.addParticipant(IDParticipant,participant);
    }


    /*
    SETTER AND GETTER
     */

    public void setUser(User user) {
        this.user = user;
    }

    public void setUtility(Utility utility) {
        this.utility = utility;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void setParticipantList(ParticipantList participantList) {
        this.participantList = participantList;
    }

    public void setStageList(StageList stageList) {
        this.stageList = stageList;
    }
}
