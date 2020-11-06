package be.technifutur.java2020.gestionstage.commun;

import java.time.LocalDateTime;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    private Vue vue;
    private User user;

    public LocalDateTime saisirDate() {
        LocalDateTime date = null;
        Pattern pattern = Pattern.compile("([0][1-9]|[1-2][0-9]|[3][0-1]).([0][1-9]|[1][0-2]).([0-9][0-9][0-9][0-9]).([0][0-9]|[1][0-9]|[2][0-3]).([0-5][0-9])|[qQ]");
        String inputDate;
        int year = 0, month = 0, day = 0, hour = 0, minute = 0;

        inputDate = getInput();
        while (!(inputDate.equalsIgnoreCase("q")) && (date == null)) {
            Matcher matcher = pattern.matcher(inputDate);
            if (matcher.matches()) {
                day = Integer.parseInt(matcher.group(1));
                month = Integer.parseInt(matcher.group(2));
                year = Integer.parseInt(matcher.group(3));
                hour = Integer.parseInt(matcher.group(4));
                minute = Integer.parseInt(matcher.group(5));
                try {
                    date = LocalDateTime.of(year, month, day, hour, minute);
                } catch (Exception e) {
                    vue.setError("La date n'est pas valide");
                    inputDate = getInput();
                }
            } else {
                inputDate = getInput();
            }
        }
        return date;
    }

    private String getInput() {
        String inputDate;
        vue.consigneAjoutDateStage();
        inputDate = user.getInput();
        return inputDate;
    }

    public OptionalInt saisirDuree() {
        OptionalInt optionalInt = OptionalInt.empty();
        Pattern pattern = Pattern.compile("[1-9]|[1-9][0-9][0-9]|[1-9][0-9]|[qQ]");
        String inputDuration;
        inputDuration = user.getInput();
        Matcher matcher = pattern.matcher(inputDuration);
        while (!inputDuration.equalsIgnoreCase("q") && !tryParseInt(inputDuration) && !matcher.matches()) {
            vue.consigneAjoutDuree();
            inputDuration = user.getInput();
        }
        if (!inputDuration.equalsIgnoreCase("q")){
            optionalInt = OptionalInt.of(Integer.parseInt(inputDuration));
        }
        return optionalInt;
    }

    public boolean tryParseInt(String value) {
        boolean parse = false;
        try {
            Integer.parseInt(value);
            parse = true;
        } catch (NumberFormatException e) {

        }
        return parse;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

}
