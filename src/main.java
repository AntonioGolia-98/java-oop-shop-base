public class main {
    public static void main(String[] args) {

        Prodotto tablet = new Prodotto("tablet", "tablet super", 200, 22);

        System.out.println(tablet.getNomeEsteso());
        System.out.println(tablet.getPrezzoBase());
        System.out.println(tablet.getPrezzoIva());
    }

}
