package be.technifutur.java2020.gestionstage.commun;

import java.util.Scanner;

public class ConsoleUser implements User{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput() {
        return scanner.nextLine();
    }
}
