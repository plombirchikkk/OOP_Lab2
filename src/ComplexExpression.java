// Класс для вычисления сложных выражений
class ComplexExpression {
    public void calculate(String[] values) {
        if (values.length != 3) {
            throw new IllegalArgumentException("Требуются три значения");
        }
        double a = Double.parseDouble(values[0]);
        double b = Double.parseDouble(values[1]);
        double c = Double.parseDouble(values[2]);

        System.out.println("a * (b + c) = " + (a * (b + c)));
        System.out.println("a * (b - c) = " + (a * (b - c)));
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("(a - b) * c = " + ((a - b) * c));

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