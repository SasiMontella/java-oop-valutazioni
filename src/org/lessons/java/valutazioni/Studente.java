package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Studente {
    private static int counter = 10;
    private int idStudente;
    private int assenzeperc;
    private double media;

    public Studente(int assenzeperc, double media) {
        this.idStudente = counter++;
        this.assenzeperc = assenzeperc;
        this.media = media;
    }

    public int getIdStudente() {
        return idStudente;
    }

    public void setIdStudente(int idStudente) {
        this.idStudente = idStudente;
    }

    public int getAssenzeperc() {
        return assenzeperc;
    }

    public void setAssenzeperc(int assenzeperc) {
        this.assenzeperc = assenzeperc;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean promosso(){
        if(assenzeperc > 50){
                return false;
        }
        if(assenzeperc > 25 && assenzeperc < 50 && media <= 2){
                return false;
        }
        if (assenzeperc < 25 && media < 2){
            return false;
        }
        else {
       return true;
        }
    }
    @Override
    public String toString(){
        return "ID: " + idStudente + " Percentuale assenze: " + assenzeperc + "%" + " Media voti: " + media;
    }
}
