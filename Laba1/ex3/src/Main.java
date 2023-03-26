import java.util.Scanner;
import  static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите разрядность n: ");
        int num = sc.nextInt();
        int sum = 0;
        if (num > 5 || 0 > num){
            System.out.println("Вы вышли за переделы диапазона!");
        }
        for (int i = (int)pow(10,num-1); i < (int)pow(10,num); i++) {
            sum += i;
        }
        System.out.println("Сумма: " + sum);
    }
}