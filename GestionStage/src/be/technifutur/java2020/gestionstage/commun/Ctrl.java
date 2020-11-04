package be.technifutur.java2020.gestionstage.commun;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ctrl {
    private Vue vue;
    private Model model;

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void createStage() {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([0][1-9]|[1-2][0-9]|[3][0-1]).([0][1-9]|[1][0-2]).(20[0-9][0-9]).([0][0-9]|[1][0-9]|[2][0-3]).([0-5][0-9])|[qQ]");
        String inputDate, name;
        int year, month, day, hour, minute;
        boolean insertStage = true,dateIsValid = false;
        while (insertStage) {
            vue.consigneAjoutNomStage();
            name = scanner.nextLine();
            while (name.equals("")) {
                vue.consigneAjoutNomStage();
                name = scanner.nextLine();
            }
            vue.ajoutDateDebut();
            vue.consigneAjoutDateStage();
            inputDate = scanner.nextLine();
            while (!(inputDate.equalsIgnoreCase("q")) && !dateIsValid) {
                Matcher matcher = pattern.matcher(inputDate);
                if (matcher.matches()) {
                    day = Integer.parseInt(matcher.group(1));
                    month = Integer.parseInt(matcher.group(2));
                    year = Integer.parseInt(matcher.group(3));
                    hour = Integer.parseInt(matcher.group(4));
                    minute = Integer.parseInt(matcher.group(5));
                    dateIsValid = true;
                } else {
                    vue.consigneAjoutDateStage();
                    inputDate = scanner.nextLine();
                }
            }
            vue.ajoutDateFin();

        }
    }
}
