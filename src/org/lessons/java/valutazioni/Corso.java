package org.lessons.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Corso {
    private ArrayList<Studente> studentiTot = new ArrayList<>();

    public void getElencoStudenti(ArrayList<Studente>studentiTot){
        for (Studente studente: studentiTot) {
            System.out.println(studente);
        }
    }
    public void  rimuoviStudente(ArrayList<Studente> studentiTot, int id){
        studentiTot.remove(id);
    }
    public void  aggiungStudente(ArrayList<Studente> studentiTot, Studente nuovoStudente){
        studentiTot.add(nuovoStudente);
    }
    public void percStudentiPormossi(ArrayList<Studente>studentiTot){
        ArrayList<Studente>promossi = new ArrayList<>();
        for (Studente studente:studentiTot){
            if (studente.promosso()){
                promossi.add(studente);
            }
        }
        double xPromossi = (promossi.size()*100/studentiTot.size());
        DecimalFormat df = new DecimalFormat("#.##");
        String xPromossiForm = df.format(xPromossi);
        System.out.println("Percentuale studenti promossi: " + xPromossiForm + "%");

    }
}
