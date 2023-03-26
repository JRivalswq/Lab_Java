import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i1 = 0, i2 = 0;
        Scanner scn = new Scanner(System.in);

        if (scn.hasNextInt()) {
            i1 = scn.nextInt();
        }
        if (i1 > 3) {
            System.out.println("Не больше 3!");
        }


            int[] mas = new int[i1];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random() * (i1));
                System.out.print(mas[i] + " ");
                if (mas[i] % 2 == 0 & mas[i] != 0) i2++;
            }
            System.out.println("");
            if (i2 > 0) {
                int[] mas2 = new int[i2];
                for (int i = 0, b = 0; i < mas.length; i++) {
                    if (mas[i] % 2 == 0 & mas[i] != 0) {
                        mas2[b] = mas[i];
                        System.out.print(mas2[b] + " ");
                    }
                }
            }
        }
    }