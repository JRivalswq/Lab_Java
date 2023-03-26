public class Fraction {
    int m, n;
    Fraction () {
        m = n = 1;
    }
    Fraction (int a, int b) {
        m = a;
        n = b;
    }
    void sum(boolean t,Fraction... a) {
        int l = a.length, n = this.n, m = this.m;
        if (t == false) System.out.println("Сумма дробей равна: ");
        for (int i = 0; i < l; i++) {
            if (n != a[i].n) {
                n = a[i].n * n;
                m = m * a[i].n + a[i].m * n;
            }
            else {
                m = a[i].m + m;
            }
        }
        if (t == false) {
            System.out.println("В несокращённом виде: " + m + " / " + n);
            this.red();
            System.out.println("В сокращённом виде: " + m + " / " + n);
        }
        else {
            this.n = n;
            this.m = m;
            this.red();
        }
    }
    void sub(Fraction a) {
        int n = 0, m = 0;
        System.out.println("Разность дробей равна: ");
        if (this.n != a.n) {
                n = a.n * this.n;
                m = this.m * a.n - a.m * this.n;
        }
        else m = this.m - a.m;
        if (n == 0) System.out.println("0");
            else System.out.println(m + " / " + n);
    }
    void mult(Fraction... a) {
        int n = 0, m = 0;
        System.out.println("Произведение дробей равно: ");
        for (Fraction x : a) {
            n = x.n * this.n;
            m = this.m * x.m;
        }
        System.out.println(m + " / " + n);
    }
    void div(Fraction a) {
        int n = 0, m = 0;
        System.out.println("Деление дробей равно: ");
        m = this.m * a.n;
        n = this.n * a.m;
        System.out.println(m + " / " + n);
    }
    void red() {
        int i = 2;
        while (n > i + 1) {
        if (n % i == 0 && m % i == 0) {
            n /= i;
            m /= i;
        }
        else i++;
        }
    }
    void show(Fraction... a) {
        System.out.println("Содержимое массива дробей: ");
        int l = a.length;
        for (int i = 0; i < l; i ++) {
                System.out.println(a[i].m + " / " + a[i].n);
        }
    }
    void even_add (Fraction... a) {
        int l = a.length;
        for (int i = 0; i < l; i++) {
            if ((i + 1) % 2 == 0 && (i + 1) != l) a[i].sum(true, a[i + 1]);
        }
    }
}
