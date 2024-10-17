// Класс для вычисления сложных арифметических выражений
class ComplexExpression {
    private double a;  // Значение a
    private double b;  // Значение b
    private double c;  // Значение c

    // Метод для установки значений a, b и c
    public void setValues(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод для вычисления и вывода всех возможных сложных выражений
    public void calculateAll() {
        System.out.println("a * (b + c) = " + (a * (b + c)));
        System.out.println("a * (b - c) = " + (a * (b - c)));
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("(a - b) * c = " + ((a - b) * c));

        // Проверка на деление на ноль перед расчетом
        if (b + c != 0) {
            System.out.println("a / (b + c) = " + (a / (b + c)));
        } else {
            System.out.println("a / (b + c): Деление на ноль!");
        }

        if (b - c != 0) {
            System.out.println("a / (b - c) = " + (a / (b - c)));
        } else {
            System.out.println("a / (b - c): Деление на ноль!");
        }

        if (c != 0) {
            System.out.println("(a + b) / c = " + ((a + b) / c));
            System.out.println("(a - b) / c = " + ((a - b) / c));
        } else {
            System.out.println("(a + b) / c: Деление на ноль!");
            System.out.println("(a - b) / c: Деление на ноль!");
        }
    }
}
