package general; 

public class Spielfeld {
    char [][] spielfeld = new char [20][30]; 
    String gameState = "running";
    
    public void zeigeSpielfeld(){
        int []startPos = {0,15};
        int [][]startForm =  {{0,0,0,0,0},{0,1,1,0,0},{0,1,1,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        Bloecke block = new Bloecke(startPos, startForm);
        for (int i = 0; i < spielfeld.length; i++){
            for(int j = 0; j < spielfeld[0].length;j++ ){
                System.out.print(spielfeld[i][j]);
            }
            System.out.println();
        }
    }
    public void reset(){
        for (int i = 0; i < spielfeld.length; i++){
            for (int j = 0; j < spielfeld[0].length; j++){
                if ((i==0 || i==19)&&(j != 0 && j != 29)){
                    spielfeld[i][j]= '-';
                }else if (j == 0 || j == 29){
                    spielfeld[i][j] = '|';
                }
                else{
                    spielfeld[i][j] = ' ';
                } 
            }
        }
    }
    public void setzeBlock(int [][] startForm, int [] startPos){
        for (int i = startPos[0]; i < startPos[0]+5; i++){
            for(int j = startPos[1]; j < startPos[1]+5;j++){
            
               if (startForm[i-startPos[0]][j-startPos[1]] == 1){
                    this.spielfeld[i][j] = '#'; 
               }
                   
            }
            
        }
    }
}
