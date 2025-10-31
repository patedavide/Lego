public class Main {
    public static void main(String[] args){
        Colore rosso = new Colore(255,0,0);
        Colore verde = new Colore(0,255,0);
        Colore blu = new Colore(0,0,255);

        Dimensioni piccole = new Dimensioni(2,4,1);
        Dimensioni medie = new Dimensioni(4,8,2);
        Dimensioni grandi = new Dimensioni(8,16,4);

        Mattoncino m1= new Mattoncino(rosso, piccole, 4);
        Mattoncino m2 = new Mattoncino(verde, grandi, 8);
        Mattoncino m3 = new Mattoncino(blu, medie,6);

        System.out.println("Mattoncini creati:");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Confronto m1 e m2:" + m1.equals(m2));
        System.out.println("Confronto m1 e m3:" + m1.equals(m3));

        System.out.println("Cambio il colore del mattoncino m2 in blu");
        m2.setColore(blu);
        System.out.println("nuovo m2: " + m2);
    }
}

