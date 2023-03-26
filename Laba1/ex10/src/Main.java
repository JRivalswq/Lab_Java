public class Main {
    public static void main(String[] args){
        int time_s = (int)(Math.random()*28801);
        int time_h=time_s/3600;
        System.out.println(time_s + "cекунд");
        if(time_s < 3600) System.out.println("Осталось менее часа");
        else if(time_h==0) System.out.println("Осталось: " +  time_h + " ч.");
        else if(time_h>1800) System.out.println("Осталось чуть менее " +(time_h+1)+ " ч.");
        else System.out.println("Осталось чуть более: " + (time_h) + " ч.");
}
}