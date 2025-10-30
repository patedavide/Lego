public class Dimensioni {
    private int larghezza;
    private int lunghezza;
    private int altezza;
    private double peso;

    public Dimensioni(int larghezza, int lunghezza, int altezza, double peso){
        this.larghezza = 1;
        this.lunghezza = 1;
        this.altezza = 1;
        this.peso= 1.5;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
