import  static java.lang.Math.pow;
public class Main {
    public static void main(String[] args) {
        int left = 0, right = 0;
        int count = 0;
        for (int i = 1001; i < 1000000; i++) {
            for (int j = 0; j < 6; j++) {
                if(j<3) left+=(i/(int)pow(10,j))%10;
                else right+=(i/(int)pow(10,j))%10;
            }
            if(left == right) count++;
            left = 0; right = 0;
        }
        System.out.println("Итого: " + count);
    }
}