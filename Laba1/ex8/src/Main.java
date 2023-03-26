import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        int a = ((int) (Math.random() * 161)-5);
        if(a<100&&a>25){
            System.out.println("Value hit range! - "+a);
        }
        else {
            System.out.println("value is not in range! - "+a);
        }


    }
}