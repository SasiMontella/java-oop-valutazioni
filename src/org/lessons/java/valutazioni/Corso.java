package org.lessons.java.valutazioni;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class Corso {
    private ArrayList<Studente> studentiTot = new ArrayList<>();

    public Corso(){
        Random num = new Random();
        int numeroStudenti = num.nextInt(10, 21);
        studentiTot = new ArrayList<>();
        for (int i = 0; i < numeroStudenti-1 ; i++) {
            studentiTot.add(new Studente());
            studentiTot.get(i).setId(i + 1);
        }
    }

    public ArrayList<Studente> getStudentiTot() {
        return studentiTot;
    }

    public void setStudentiTot(ArrayList<Studente> studentiTot) {
        this.studentiTot = studentiTot;
    }

    public void aggiungiStudente(Studente studente){
        studentiTot.add(studente);
    }
    public void removeStudent(int i) throws IllegalArgumentException{
        if (i<1 || i> studentiTot.size()){
            throw new IllegalArgumentException("Scegli un numero tra 1 e  "+ studentiTot.size());
        }else {
            studentiTot.remove(i-1);
        }
    }
    public BigDecimal percStudentiPromossi(){
        int numeroPromossi= 0;
        for (Studente student: studentiTot) {
            if (student.promossi()){
                numeroPromossi ++;
            }
        }

        BigDecimal perc= new BigDecimal(numeroPromossi).divide(new BigDecimal(studentiTot.size()),2, RoundingMode.HALF_DOWN);
        perc= perc.multiply(BigDecimal.valueOf(100));
        return perc;
    }







    @Override
    public String toString(){
        String desc = "Elenco studenti  \n";
        for (Studente student: studentiTot){
            desc += student.toString() + "\n";
        }
        return desc;
    }
}
