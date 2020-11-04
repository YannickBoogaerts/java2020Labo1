package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    private Vue vue = new Vue();
    private Scanner scanner = new Scanner(System.in);

    public LocalDateTime saisirDate() {
        LocalDateTime date = null;
        Pattern pattern = Pattern.compile("([0][1-9]|[1-2][0-9]|[3][0-1]).([0][1-9]|[1][0-2]).(20[0-9][0-9]).([0][0-9]|[1][0-9]|[2][0-3]).([0-5][0-9])|[qQ]");
        String inputDate;
        Boolean dateMatching = false;
        int year = 0, month = 0, day = 0, hour = 0, minute = 0;

        vue.consigneAjoutDateStage();
        inputDate = scanner.nextLine();
        while (!(inputDate.equalsIgnoreCase("q")) && !dateMatching) {
            Matcher matcher = pattern.matcher(inputDate);
            if (matcher.matches()) {
                day = Integer.parseInt(matcher.group(1));
                month = Integer.parseInt(matcher.group(2));
                year = Integer.parseInt(matcher.group(3));
                hour = Integer.parseInt(matcher.group(4));
                minute = Integer.parseInt(matcher.group(5));
                dateMatching = true;
            } else {
                vue.consigneAjoutDateStage();
                inputDate = scanner.nextLine();
            }
        }
        if (inputDate.equalsIgnoreCase("q")) {
            date = null;
        } else if(dateIsValide(year, month, day)) {
            date = LocalDateTime.of(year, month, day, hour, minute);
        }
        return date;
    }

    private boolean dateIsValide(int year, int month, int day) {
        boolean isValide = true;
        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            isValide = false;
        }

        return true;
    }
}
