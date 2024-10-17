// Класс для проверки, является ли одна строка подстрокой другой
class SubstringChecker {
    private String str1;  // Первая строка
    private String str2;  // Вторая строка

    // Метод для установки строк
    public void setStrings(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    // Метод для проверки, является ли первая строка подстрокой второй
    public boolean isSubstring() {
        int len1 = str1.length();  // Длина первой строки
        int len2 = str2.length();  // Длина второй строки

        // Перебор второй строки и сравнение с первой
        for (int i = 0; i <= len2 - len1; i++) {
            int j;
            // Сравнение символов первой строки с подстрокой второй строки
            for (j = 0; j < len1; j++) {
                if (str2.charAt(i + j) != str1.charAt(j)) {
                    break;  // Если символы не совпадают, выход из цикла
                }
            }
            if (j == len1) {
                return true;  // Если все символы совпали, возвращаем true
            }
        }

        return false;  // Если подстрока не найдена, возвращаем false
    }
}
