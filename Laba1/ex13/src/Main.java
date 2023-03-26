import static java.lang.Math.random;
public class Main {
    public static void main(String[] args) {
        int tabl[][]=new int[8][8];
        for (int i=0; i<8; i++){
            for(int j=0; j<8; j++) {
                if(i-j>=0)tabl[i][j] = (j + 2)*(i+2);
            }
        }
        for (int i=0; i<8; i++){
            for(int j=0; j<8; j++){
               System.out.print(tabl[i][j]+"   ");
           }System.out.println();
        }
        int jj=0, ii=0;
        for (int i = 0; i < 15; i++) {
            ii = (int) (random() * 8 );
            jj = (int) (random() * 8 );
            if ( tabl[ii][jj]!=0 ) {
                System.out.println((ii+2) + "*" + (jj+2) + "=");
                tabl[ii][jj]=0;
            }
            else i--;
        }
    }
}
