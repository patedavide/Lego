public class Colore {
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public void setR(int r) {
        if(r >=0 && r <= 255){
            this.r=r;
        }else{
            this.r=-1;
        }
    }

    public void setG(int g) {
        if(g >=0 && g <= 255){
            this.g=g;
        }else{
            this.g=-1;
        }
    }

    public void setB(int b) {
        if(b >=0 && b <= 255){
            this.b=b;
        }else{
            this.b=-1;
        }
    }

    public Colore(int r, int g, int b) {
        this.setR(r);
        this.setG(g);
        this.setB(b);
    }

    public boolean equals(Colore coloreConfrontato) {
        return r == coloreConfrontato.r && g == coloreConfrontato.g && b == coloreConfrontato.b;
    }

    public String toString(){
        return "Colore[ r: " + r + ", g: " + g + ", b: " +b + "]";
    }

}
