public class DZ2 {
    // ДЗ

    // Решение 1 задачи - Float
    // Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
    // Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
    // Если преобразование не удалось, программа выдаёт сообщение об ошибке и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.

    // На входе:
    // '3.14'
    // 'Ivan'

    // На выходе:
    // 3.14

    static float isFloat(String input) {
    // Введите свое решение ниже
        float a;     
        try
        {
            a = Float.valueOf(input);
        }
        catch (Exception e)
        {
            System.out.println("Your input is not a float number. Please, try again.");
            a = Float.NaN;
        }
        return a;
    }

    // Решение 2 задачи - Деление элементов массива на число
    // Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
    // Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
    // Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.

    // На входе:
    // '1 2 3 4 5 6 7 8 9'
    // '1'

    // На выходе:
    // intArray[8] / d = 9 / 1 = 9.0
    // 9.0

    static double expr(int[] intArray, int d) {
    // Введите свое решение ниже 
        double a;
        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            a = Double.NaN;
        } else if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            a = Double.NaN;
        } else {
        a = intArray[8] / d;
        System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + a);
        // System.out.printf("intArray[8] / d = %d / %d = %.1f \n", intArray[8], d, a);
        }
        return a;
    }

    // Решение 3 задачи - Деление
    // Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
    // При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
    // Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
    // После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
    // Если аргументы не переданы через командную строку, используйте значения по умолчанию.

    // На входе:
    // '12'
    // '5'

    // На выходе:
    // 17
    // 2.4


     public static double expr(int a, int b) {
    // Введите свое решение ниже
        double d = 0;

        if (b != 0) {
            d = a * 1.0 / b;
        }
        printSum(a, b);
        return d;
    }
    public static void printSum(int a, int b) {
    // Введите свое решение ниже
        System.out.println(a + b);
    }

    // Решение 4 задачи - Cимвол `a`
    // Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
    // если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
    // "Пустая строка введена.".
    // В противном случае программа должна возвращать сообщение
    // "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.

    // На входе:
    // '0'

    // На выходе:
    // Result: Your input was - 0

    public static String expr4(char a) throws Exception {
    // Введите свое решение ниже
        String result;
        if (a == ' ') {
            throw new Exception ("Empty string has been input.");
        } else {
            result = "Your input was - " + String.valueOf(a);
        }        
        return result;
    }
}
