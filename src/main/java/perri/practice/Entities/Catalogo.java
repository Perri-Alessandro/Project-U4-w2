package perri.practice.Entities;

import java.time.LocalDate;
import java.util.Random;

public abstract class Catalogo {
    protected int codiceIsbn;

    protected String titolo;

    protected LocalDate annoDiPubblicazione;

    protected int numeroPagine;

    public Catalogo(String titolo, LocalDate annoDiPubblicazione, int numeroPagine) {
        Random idd = new Random();
        this.codiceIsbn = idd.nextInt(10000, 10010);
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceIsbn=" + codiceIsbn +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
