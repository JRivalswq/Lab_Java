import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = sc.nextInt();
        double b;
        for(int i=1; i<5;i++){
            b=pow(n,i);
            System.out.println("Первые 4 степени числа n"+b);
        }
    }
}