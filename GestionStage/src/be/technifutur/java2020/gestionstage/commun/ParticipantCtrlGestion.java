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

        nomParticipant = utility.saisirName("Veuillez saisir le nom du participant. Insérer \"q\" pour quitter");
        if (!nomParticipant.isEmpty()) {
            prenomParticipant = utility.saisirName("Veuillez saisir le prénom du participant. Insérer \"q\" pour quitter");
            if (!prenomParticipant.isEmpty()) {
                String IDParticipant = nomParticipant.concat(prenomParticipant);
                if (participantList.getMapParticipant().containsKey(IDParticipant)) {
                    modifParticipant(participantList.getParticipant(IDParticipant));
                } else {
                    createParticipant(IDParticipant, nomParticipant, prenomParticipant);
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
    private void createParticipant(String IDParticipant, String nomParticipant, String prenomParticipant) {
        String mailParticipant, clubParticipant, nameStage;
        vue.afficheMessage("L'utilisateur n'existe pas.");
        nameStage = utility.saisirName("Veuillez insérer le nom du stage auquel le participant veut s'inscrire. Insérer \"q\" pour quitter");
        while (!stageList.getMap().containsKey(nameStage) && !nameStage.equalsIgnoreCase("q")) {
            nameStage = utility.saisirName("Veuillez insérer le nom du stage auquel le participant veut s'inscrire. Insérer \"q\" pour quitter");
        }
        if (!nameStage.isEmpty()) {
            Stage stage = stageList.getStage(nameStage);
            clubParticipant = utility.saisirName("Veuillez saisir le nom du club du participant ou insérer \"q\" pour laisser vide.");
            mailParticipant = utility.saisirMail("Veuillez saisir l'adresse mail du participant ou insérer \"q\" pour laisser vide.");
            Participant participant = stage.createParticipant(IDParticipant, nomParticipant, prenomParticipant, clubParticipant, mailParticipant);
            participantList.addParticipant(IDParticipant, participant);
        }
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
