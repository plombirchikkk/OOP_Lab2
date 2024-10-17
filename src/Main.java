import java.util.Scanner;

// Главный класс программы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Объект для ввода данных

        // 1. Ввод данных для вычисления арифметического выражения
        System.out.println("Введите два операнда и знак операции через пробел (например, '5 + 3'):");
        String inputExpression = scanner.nextLine();  // Чтение строки с выражением
        ArithmeticExpression arithmeticExpression = new ArithmeticExpression();  // Создание объекта для арифметического выражения
        arithmeticExpression.setExpression(inputExpression);  // Установка данных выражения
        System.out.println("Результат выражения: " + arithmeticExpression.calculate());  // Вычисление и вывод результата

        // 2. Ввод числа и подсчет количества цифр 0
        System.out.println("Введите число для подсчета нулей:");
        String number = scanner.nextLine();  // Чтение числа
        ZeroCounter zeroCounter = new ZeroCounter();  // Создание объекта для подсчета нулей
        zeroCounter.setNumber(number);  // Установка числа
        System.out.println("Количество нулей: " + zeroCounter.countZeros());  // Подсчет и вывод количества нулей

        // 3. Ввод значений для сложных арифметических выражений
        System.out.println("Введите значения a, b и c через пробел:");
        String[] values = scanner.nextLine().split(" ");  // Чтение и разбиение строки на переменные a, b, c
        ComplexExpression complexExpression = new ComplexExpression();  // Создание объекта для сложных выражений
        complexExpression.setValues(Double.parseDouble(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2]));  // Установка значений a, b, c
        complexExpression.calculateAll();  // Вычисление и вывод всех возможных выражений

        // 4. Ввод строк для проверки подстроки
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();  // Чтение первой строки
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();  // Чтение второй строки
        SubstringChecker substringChecker = new SubstringChecker();  // Создание объекта для проверки подстроки
        substringChecker.setStrings(str1, str2);  // Установка строк для проверки
        System.out.println("Является ли первая строка подстрокой второй: " + substringChecker.isSubstring());  // Проверка и вывод результата
    }
}