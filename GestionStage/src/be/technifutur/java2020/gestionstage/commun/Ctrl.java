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
        Stage stage = new Stage();
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([0][1-9]|[1-2][0-9]|[3][0-1]).([0][1-9]|[1][0-2]).(20[0-9][0-9]).([0][0-9]|[1][0-9]|[2][0-3]).([0-5][0-9])|[qQ]");
        String inputDate, name;
        int yearD, monthD, dayD, hourD, minuteD;
        int yearF, monthF, dayF, hourF, minuteF;
        boolean insertStage = true, dateIsValid = false;
        while (insertStage) {
            vue.consigneAjoutNomStage();
            name = scanner.nextLine();
            while (name.equals("")) {
                vue.consigneAjoutNomStage();
                name = scanner.nextLine();
            }
            stage.setIntituleStage(name);
            if (insertStage) {
                vue.ajoutDateDebut();
                vue.consigneAjoutDateStage();
                inputDate = scanner.nextLine();
                while (!(inputDate.equalsIgnoreCase("q")) && !dateIsValid) {
                    Matcher matcher = pattern.matcher(inputDate);
                    if (matcher.matches()) {
                        dayD = Integer.parseInt(matcher.group(1));
                        monthD = Integer.parseInt(matcher.group(2));
                        yearD = Integer.parseInt(matcher.group(3));
                        hourD = Integer.parseInt(matcher.group(4));
                        minuteD = Integer.parseInt(matcher.group(5));
                        dateIsValid = true;
                        stage.setDateDebut(yearD, monthD, dayD, hourD, minuteD);
                    } else {
                        vue.consigneAjoutDateStage();
                        inputDate = scanner.nextLine();
                    }
                }
            }
            if (insertStage) {
                dateIsValid = false;
                vue.ajoutDateFin();
                vue.consigneAjoutDateStage();
                inputDate = scanner.nextLine();
                while (!(inputDate.equalsIgnoreCase("q")) && !dateIsValid) {
                    Matcher matcher = pattern.matcher(inputDate);
                    if (matcher.matches()) {
                        dayF = Integer.parseInt(matcher.group(1));
                        monthF = Integer.parseInt(matcher.group(2));
                        yearF = Integer.parseInt(matcher.group(3));
                        hourF = Integer.parseInt(matcher.group(4));
                        minuteF = Integer.parseInt(matcher.group(5));
                        stage.setDateFin(yearF, monthF, dayF, hourF, minuteF);
                        dateIsValid = true;
                    } else {
                        vue.consigneAjoutDateStage();
                        inputDate = scanner.nextLine();
                    }
                }
            }
            insertStage = false;
        }
    }
}
