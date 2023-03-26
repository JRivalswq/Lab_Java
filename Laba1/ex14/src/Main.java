import  static java.lang.Math.pow;
import static java.lang.Math.random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][], N = 0, M = 0, max = 0, min = 0, dop = 0, in_max = 0, in_min = 0;
        System.out.println("Введите кол-во строк и столбцов:");
        if (sc.hasNextInt()) {
            M = sc.nextInt();
            N = sc.nextInt();
            System.out.println("Исходный массив:");
            A = new int[M][N];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = (int) (random() * (101));
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-------------------------------------------");
            for (int i = 0; i < M; i++) {
                max = A[i][0];
                in_max = 0;
                min = A[i][0];
                in_min = 0;
                for (int j = 1; j < N; j++) {
                    if (max < A[i][j]) {
                        max = A[i][j];
                        in_max = j;
                    }
                    if (min > A[i][j]) {
                        min = A[i][j];
                        in_min = j;
                    }
                }
                dop = A[i][0];
                A[i][0] = max;
                A[i][in_max] = dop;
                dop = A[i][N - 1];
                A[i][N - 1] = min;
                A[i][in_min] = dop;
            }
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}