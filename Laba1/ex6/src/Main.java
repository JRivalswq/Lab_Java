public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c=0;
        System.out.println(a + ", " + b + ", ");
        for (int i=3;i<=11;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(+c+"");
        }
    }
}