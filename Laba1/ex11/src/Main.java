import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        int x=12, mas[],max=0,id=0;
        mas = new int[x];
        for(int i = 0; i< mas.length;i++){
            mas[i]=((int)(Math.random()*31)-15);
        }
        for(int i=0;i< mas.length;i++){
            System.out.println("mas["+i+"]="+mas[i]+";");
        }

        for(int i=0;i< mas.length;i++){
            if(max<=mas[i]){
                max=mas[i];
                id=i;
            }
        }
        System.out.println("Max value="+max+"  "+"Index="+id);
    }
}