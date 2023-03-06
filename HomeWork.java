public class HomeWork {

    public static void main(String[] args) {
        /*
         * input
         * Добрый день      Как делаВсе   хорошо   (строка без точек с неверно расставленными пробелами)
         * 
         * программа расставлет верно пробелы и добавляет точки
         * 
         * output
         * Добрый день. Как дела. Все хорошо.
         */

         String input = "Добрый    день  Как  делаВсе хорошо    ";

        String output = fixer(input);
        System.out.println(output);
    }

    public static String fixer(String stringToFix) {

        stringToFix = stringToFix.trim()
                .replaceAll("\\s+", " ")
                .replaceAll("([а-я])([А-Я])", "$1 $2")
                .replaceAll("\\s([А-ЯЁ])", ". $1")
                .replaceAll("([а-я])$", "$1.");

        return stringToFix;
    }

}