import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String costruzione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String costruzione, double prezzo, double iva) {
        Random random = new Random();
        this.codice = random.nextInt(99999) + 1;
        this.nome = nome;
        this.costruzione = costruzione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double getPrezzoBase() {
        return this.prezzo;
    }

    public double getPrezzoIva() {
        return this.prezzo + (this.prezzo * this.iva / 100);
    }

}
