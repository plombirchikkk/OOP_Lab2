
// Класс для простых арифметических выражений
class ArithmeticExpression {
    private String operand1;  // Первый операнд
    private String operand2;  // Второй операнд
    private String operator;  // Оператор (+, -, *, /)

    // Метод для установки выражения (разделение строки на операнды и оператор)
    public void setExpression(String input) {
        String[] parts = input.split(" ");
        this.operand1 = parts[0];
        this.operator = parts[1];
        this.operand2 = parts[2];
    }

    // Метод для вычисления результата выражения
    public double calculate() {
        double num1 = Double.parseDouble(operand1);  // Преобразование первого операнда в число
        double num2 = Double.parseDouble(operand2);  // Преобразование второго операнда в число
        switch (operator) {
            case "+":
                return num1 + num2;  // Сложение
            case "-":
                return num1 - num2;  // Вычитание
            case "*":
                return num1 * num2;  // Умножение
            case "/":
                if (num2 != 0) {
                    return num1 / num2;  // Деление, если второй операнд не равен нулю
                } else {
                    System.out.println("Деление на ноль!");  // Предупреждение при делении на ноль
                    return 0;
                }
            default:
                System.out.println("Неизвестный оператор!");  // Предупреждение при неверном операторе
                return 0;
        }
    }
}
