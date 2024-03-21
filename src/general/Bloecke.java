package general;

public class Bloecke {
int [] pos = new int [2];
int [][] form = new int [5][5];
int [] linksOben = new int [2];
int [] rechtsUnten = new int [2];

public void verschieben(char key){
    if(key == 'd'){
        this.pos [1] = this.pos[1]+1;
    }
    if(key == 'a'){
        this.pos [1] = this.pos[1]-1;
    }
}

public Bloecke(int [] pos, int [][] form){
    this.pos = pos;
    this.form = form;
    this.linksOben = findeEcke(1, this.form);
    this.rechtsUnten = findeEcke(-1, this.form);
}
public int[] findeEcke(int wert,int [][]shape){
    int a = 0;
    int b = 4;
    int value;
    int z=5;

    if(wert == -1){
        value = a;
        a = b;
        b = value;
        z=-1;
    }
    int [] linkePosition = {a,-1};

    for (int i = a; i == b; i+= wert){
        for (int j = a; j == b; j+= wert){
            if (shape[i][j] == 1 && ((i<linkePosition[0]&&wert==1)||(i>linkePosition[0]&&wert==-1))){
                linkePosition[0] = i;
                linkePosition[1] = j;
            }
        }
        if (linkePosition[0] != z && linkePosition[1]!=-1){
            break;
        }   
    }
    return linkePosition;
    }
}
