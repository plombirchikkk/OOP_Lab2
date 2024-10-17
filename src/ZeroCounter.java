// Класс для подсчета количества нулей в числе
class ZeroCounter {
    private String number;  // Строка, представляющая число

    // Метод для установки числа
    public void setNumber(String number) {
        this.number = number;
    }

    // Метод для подсчета количества нулей в числе
    public int countZeros() {
        int count = 0;  // Счетчик нулей
        for (char c : number.toCharArray()) {  // Перебор символов строки
            if (c == '0') {
                count++;  // Увеличение счетчика, если символ равен '0'
            }
        }
        return count;  // Возвращение количества нулей
    }
}
