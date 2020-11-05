package be.technifutur.java2020.gestionstage.commun;

import java.util.Iterator;

public class ArrayUser implements User {

    private Iterator<String> iterator;

    public ArrayUser(Iterator<String> iterator) {
        this.iterator = iterator;
    }

    @Override
    public String getInput() {
        return iterator.next();
    }
}
