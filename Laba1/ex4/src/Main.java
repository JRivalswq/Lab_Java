import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random() * 11);
        while (true) {
            int b = sc.nextInt();
            if (a > b) {
                System.out.println("Искомое больше!");
            } else if (a < b) {
                System.out.println("Искомое меньше!");
            } else if (a == b) {
                System.out.println("Правильно!");
            }
        }
    }
}