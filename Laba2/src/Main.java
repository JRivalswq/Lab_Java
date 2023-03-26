import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите номер задачи для выполнения. Чтобы выйти, введите 0.");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                System.out.println("Некорректный ввод.");
                return;
            }
            switch (n) {
                case 0:
                    System.out.println("Вы вышли из программы");
                    return;
                case 1:
                    first_task(sc);
                    break;
                case 2:
                    second_task(sc);
                    break;
                case 3:
                    third_task(sc);
                    break;
                case 4:
                    fourth_task(sc);
                    break;
                case 5:
                    fifth_task(sc);
                    break;
                case 6:
                    sixth_task("I like Java!!!");
                    break;
            }
        }
    }
    public static void first_task(Scanner sc) {
        Circle a = new Circle();
        Circle b = new Circle(1, 2, 3);
        b.calc();
        b.show();
    }
    public static void second_task(Scanner sc) {
        Warehouse w = new Warehouse(10, 3);
        Warehouse w2 = new Warehouse(30, 5);
        w.change_goods();
        w.calc();
        w.compare(w2);
    }

    public static void third_task(Scanner sc) {
        System.out.println("Введите желаемое количество книг: ");
        int g = sc.nextInt();
        int a1, b1;
        String s1, s2;
        Book ma[] = new Book[g];
        for (int i = 0; i < g; i++) {
            System.out.println("Введите информацию о " + (i + 1) + "-й книге: ");
            s1 = sc.nextLine();
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            a1 = sc.nextInt();
            b1 = sc.nextInt();
            ma[i] = new Book(s1, s2,a1, b1);
        }
        System.out.println("Введите название книги, про которую хотите узнать: ");
        s1 = sc.nextLine();
        s1 = sc.nextLine();
        ma[0].find(s1, ma);
    }

    public static void fourth_task(Scanner sc) {
        System.out.println("Введите желаемое количество дробей: ");
        int m = sc.nextInt();
        int d, f;
        Fraction mas[] = new Fraction[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Введите значение " + (i + 1) + "-й дроби: ");
            d = sc.nextInt();
            f = sc.nextInt();
            mas[i] = new Fraction(d, f);
        }
        mas[0].red();
        mas[0].even_add(mas);
        mas[0].show(mas);
    }

    public static void fifth_task(Scanner sc) {
        Double d, s, f;
        System.out.println("Введите вещественное числo: ");
        d = Double.valueOf(sc.nextDouble());
        sc.nextLine();
        System.out.println("Введите вещественное числo: ");
        f = Double.parseDouble(sc.nextLine());
        System.out.println("Преобразование double числа " + d + " к типу");
        System.out.println("byte - " + d.byteValue());
        System.out.println("short - " + d.shortValue());
        System.out.println("int - " + d.intValue());
        System.out.println("long - " + d.longValue());
        System.out.println("float - " + d.floatValue());
        System.out.println("Преобразование литерала типа double к строке: " +  Double.toString(3.14));
    }

    public static void sixth_task(String s) {
        System.out.println("Последний символ строки: " + s.charAt(s.length() - 1));
        if (s.endsWith("!!!")) System.out.println("Строка заканчивается подстрокой '!!!'");
        else System.out.println("Строка не заканчивается подстрокой '!!!'");
        if (s.startsWith("I like")) System.out.println("Строка начинается подстрокой 'I like'");
        else System.out.println("Строка не начинается подстрокой 'I like'");
        if (s.contains("Java")) System.out.println("Строка содержит подстроку 'Java'");
        else System.out.println("Строка не содержит подстроку 'Java'");
        System.out.println("Позиция подстроки 'Java': " + s.indexOf("Java"));
        System.out.println("Строка с изменёнными на 'o' символами 'a': " + s.replaceAll("a", "o"));
        System.out.println("Строка, преобразованная к верхнему регистру: " + s.toUpperCase());
        System.out.println("Строка, преобразованная к нижнему регистру: " + s.toLowerCase());
        System.out.println("Вырезанная строка: " + s.substring(7, 11));
    }
}