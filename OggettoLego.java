public class OggettoLego {
    private int codice;
    private String oggetto;
    private Mattoncino[] mattoncini;
    private int numeroMattoncini;

    public  OggettoLego(int codice, String oggetto){
        this.codice=codice;
        this.oggetto=oggetto;
        this.mattoncini=new Mattoncino[0];
        this.numeroMattoncini = 0;
    }

    public void aggiungiMattoncino(Mattoncino nuovoMattoncino){
        Mattoncino[] nuovoMattoncini = new Mattoncino[numeroMattoncini +1];
        for (int i=0; i< numeroMattoncini;i++ ){
            nuovoMattoncini[i]= mattoncini[i];
        }
        nuovoMattoncini[numeroMattoncini] = nuovoMattoncino;
        mattoncini = nuovoMattoncini;
        numeroMattoncini++;
    }

    public float getPesoTotale(){
        float pesoTotale = 0;
        for (int i=0; i<numeroMattoncini; i++){
            pesoTotale += mattoncini[i].getPeso();
        }
        return pesoTotale;
    }

    public Mattoncino[] getMattonciniPerColore(Colore colore){
        int contatoreColoreUguale = 0;
        for (int i=0; i<numeroMattoncini; i++) {
            if(mattoncini[i].getColore().equals(colore)){
                contatoreColoreUguale++;
            }
        }
        Mattoncino [] coloreUguali= new Mattoncino[contatoreColoreUguale];
        int indice = 0;
        for (int i=0; i<numeroMattoncini; i++){
            if(mattoncini[i].getColore().equals(colore)){
                coloreUguali[indice] = mattoncini[i];
                indice++;
            }
        }
        return coloreUguali;
    }

    public int getNumeroMattoncini(int codiceMattoncino){
        int counter = 0;
        for (int i=0; i<numeroMattoncini; i++){
            if(mattoncini[i].getCodice() == codiceMattoncino){
                counter++;
            }
        }
        return counter;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getOggetto(){
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public Mattoncino[] getMattoncini(){
        return mattoncini;
    }

    public String toSring(){
        return "OggettoLego[codice: " + codice + ", oggetto: " + oggetto + ", numero mattoncini: " + numeroMattoncini + ", peso totale; " + getPesoTotale() + "]";
    }
}
