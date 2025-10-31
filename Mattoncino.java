public class Mattoncino {
    private int codice;
    static private int incremento = 0;
    private Colore colore;
    private Dimensioni dimensione;
    private float peso;

    public void setColore(Colore colore){
        this.colore=colore;
    }

    public Colore getColore() {
        return colore;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setDimensione(Dimensioni dimensione) {
        this.dimensione = dimensione;
    }

    public Dimensioni getDimensione(){
        return dimensione;
    }

    public int getCodice(){
        return codice;
    }

    public Mattoncino(){
        codice = incremento++;
        colore = new Colore(0,0,0);
        peso = 1;
        dimensione = new Dimensioni(1,1,1);
    }

    public Mattoncino(Colore colore, Dimensioni dimensione, float peso){
        codice = incremento++;
        this.colore=colore;
        this.dimensione=dimensione;
        this.peso=peso;
    }

    public boolean equals(Mattoncino mattoncinoConfrontato) {
        return codice == mattoncinoConfrontato.codice && colore.equals(mattoncinoConfrontato.colore) && peso == mattoncinoConfrontato.peso && dimensione.equals(mattoncinoConfrontato.dimensione) ;
    }

    public String toString(){
        return "Mattoncino[codice: " + codice + ", colore: " + colore + ", dimensioni: " + dimensione + ", peso: " + peso + "g ]";
    }
}
