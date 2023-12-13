package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random number = new Random();
        ArrayList<Studente> student = new ArrayList<>();
        int numeroStudenti = number.nextInt(10, 21);

        for (int i = 0; i < numeroStudenti ; i++) {

            int assenze = number.nextInt(0, 101);
            double media = number.nextInt(0, 5);
            Studente stud = new Studente(assenze, media);
            student.add(stud);
            System.out.println(stud);

        }
        Corso informatica = new Corso();
        informatica.percStudentiPormossi(student);

    }
}
