public class Dimensioni {
    private float larghezza;
    private float lunghezza;
    private float altezza;

    public float getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(float larghezza) {
        if(larghezza > 0){
            this.larghezza=larghezza;
        } else{
            this.larghezza=-1;
        }
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        if(lunghezza > 0){
            this.lunghezza=lunghezza;
        } else{
            this.lunghezza=-1;
        }
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        if(altezza > 0){
            this.altezza=altezza;
        } else{
            this.altezza=-1;
        }
    }

    public Dimensioni(float larghezza, float lunghezza, float altezza){
        this.setLarghezza(larghezza);
        this.setLunghezza(lunghezza);
        this.setAltezza(altezza);
    }

    public boolean equals(Dimensioni dimensioniConfrontate) {
        return larghezza == dimensioniConfrontate.larghezza && lunghezza == dimensioniConfrontate.lunghezza && altezza == dimensioniConfrontate.altezza;
    }

    public String toString(){
        return "Dimensioni[ larghezza: " + larghezza + ", lunghezza: " + lunghezza + ", altezza: " + altezza + "]";
    }
}
