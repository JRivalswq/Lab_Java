import java.util.Scanner;
public class Warehouse {
    int goods, value;
    Warehouse() {
        goods = value = 0;
    }
    Warehouse(int a , int b) {
        goods = a;
        value = b;
    }
    void change_goods() {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
        goods = sc.nextInt();
        }
    }

    void change_value() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            value = sc.nextInt();
        }
    }
    void calc() {
        System.out.println("Стоимость товара: " + ((double) goods * value));
    }

    void compare(Warehouse second) {
        double cost1, cost2;
        cost1 = ((double) this.goods * this.value);
        cost2 = ((double) second.goods * second.value);
        System.out.println("Стоимость первого товара: " + cost1 + "\nСтоимость второго товара: " + cost2);
        if (cost1 > cost2) System.out.println("Стоимость первого товара выше, чем у второго");
        else if (cost1 < cost2) System.out.println("Стоимость первого товара выше, чем у второго");
        else System.out.println("Их стоимость равна");
    }

    void num(int... g) {
        int sum = 0;
        for (int i : g)
            sum += i;
        System.out.println("Общая стоимость товаров: " + sum);
        goods = sum;
    }
}
