public class Circle {
    double r, x, y;
    Circle() {
        r = x = y = 1;
    }
    Circle(double rad) {
        r = rad;
    }
    Circle (double a, double b) {
        x = a;
        y = b;
    }
    Circle(double a, double b, double c) {
        r = a;
        x = b;
        y = c;
    }
    void show() {
        System.out.println("Радиус: " + r + " Координаты центра: " + x + " " + y);
    }
    void change(double a, double b) {
        x = +a;
        y = +b;
        System.out.println("Координаты изменены, текущие параметры: " + x + " " + y);
    }
    void change_rad(double a) {
        r = a;
        System.out.println("Радиус изменен, текущее значение: " + r);
    }
    void calc() {
        System.out.println("Площадь круга равна: " + (3.1415 * r * r) + "\nДлина окружности: " + (3.1415 * 2 * r));
    }
}
