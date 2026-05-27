import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        Random random = new Random();
        this.codice = random.nextInt(99999) + 1;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double getPrezzoBase() {
        return this.prezzo;
    }

    public double getPrezzoIva() {
        return this.prezzo + (this.prezzo * this.iva / 100);
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

}
