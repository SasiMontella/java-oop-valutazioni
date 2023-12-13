package org.lessons.java.valutazioni;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Studente {
    private int id;
    private int assenze;
    private BigDecimal media;

    public Studente() {
        Random random = new Random();
        assenze = random.nextInt(0, 101);
        media = BigDecimal.valueOf(random.nextDouble() * 5);
        id = random.nextInt();
    }

    public int getId() {
        return id;
    }

    public int getAssenze() {
        return assenze;
    }

    public BigDecimal getMedia() {
        return media;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean promossi() {
        int tot = 100;

        boolean promosso = false;
        if ((assenze / tot * 100 <= 50 && assenze / tot * 100 >= 25) && media.compareTo(new BigDecimal(2)) == 1) {
            return promosso = true;
        } else if (assenze / tot * 100 < 25 && (media.compareTo(new BigDecimal(2)) == 0 || media.compareTo(new BigDecimal(2)) == 1)) {
            return promosso = true;
        } else {
            return promosso;
        }
    }

    @Override
    public String toString() {
        return "Studente: " + id + " Assenze: " + assenze + " Media: " + media.setScale(1, RoundingMode.HALF_DOWN);
    }

}


