public class Mattoncino {
    private int codice;
    private Colore colore;
    private Dimensioni dimensione;

    public Mattoncino(int codice, Colore colore, Dimensioni dimensione){
        this.codice=codice;
        this.colore=colore;
        this.dimensione=dimensione;
    }

    public int getCodice() {
        return codice;
    }

    public Colore getColore() {
        return colore;
    }
    public double getPeso(){
        return dimensione.getPeso();
    }
}
