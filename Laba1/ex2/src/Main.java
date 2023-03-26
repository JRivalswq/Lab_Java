import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 1234;
        System.out.print("Enter password: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Right!");
        }
        else System.out.println("Wrong!");


    }
}