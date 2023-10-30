package DZ_3;

import java.io.IOException;
import java.util.Scanner;

public class DataGet {

    public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел: Фамилия, Имя, Отчество, дата рождения (в формате dd.mm.yyyy), номер телефона, пол (f или m):");
        String inputData = scanner.nextLine();

        String[] array = inputData.split(" ");

        if (inputData.isEmpty()){
            throw new EmptyStringException("Данные не введены");
        }

        if (array.length == 6){
            Check.checkDateFormat(array[3]);
            Check.checkPhoneNumberFormat(array[4]);
            Check.checkGenderFormat(array[5]);
            DataWrite.createFile(array);
        } else if(array.length < 6) {
            throw new ArrayCountElementException("Введены не все данные");
        } else {
            throw new ArrayCountElementException("Введено больше данных, чем требовалось");
        }
    }
}
