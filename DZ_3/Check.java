package DZ_3;

public class Check {

    public static void checkDateFormat(String date) throws IncorrectValueException {
        char[] checkData = date.toCharArray();

        if (!(checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.'))) {
            throw new IncorrectValueException("Формат даты введен не правильно - " + date);
        }
    }
    
    public static void checkPhoneNumberFormat(String phoneNumber) throws PhoneNumberValueException {
        try {
            Integer.parseInt(phoneNumber);
        } catch (NumberFormatException e){
            throw new PhoneNumberValueException("Номер телефона введен не правильно - " + phoneNumber);
        }
    }

    public static void checkGenderFormat(String gender) throws IncorrectValueException {
        if (!((gender.length() == 1) || (gender.equals("m") || gender.equals("f")))) {
            throw new IncorrectValueException("Пол введен не правильно - " + gender);
        }
    }
    
}
