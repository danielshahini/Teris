package general;import general.Spielfeld.*;

public class Steuerung {
    public static void main(String[] args) {
        Spielfeld feld = new Spielfeld();
        int []startPos = {0,15};
        int [][]startForm =  {{0,0,0,0,0},{0,1,1,0,0},{0,1,1,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        Bloecke block = new Bloecke(startPos, startForm);
        feld.reset();
        feld.setzeBlock(startForm,startPos);
        feld.zeigeSpielfeld();
        
    }
}