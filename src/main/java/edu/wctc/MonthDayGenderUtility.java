package edu.wctc;

import org.apache.commons.validator.GenericValidator;

import java.time.LocalDate;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day,
                                    char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {

        String date = String.format("%s-%s-%s", year, month, day);
        char gender = Character.toUpperCase(genderCode);
        int result = ((month - 1) * 40) + day;

        if (!GenericValidator.isDate(date,"yyyy-MM-dd", false))
            throw new InvalidBirthdayException(year, month, day);

        if (gender == CODE_FEMALE) {
            return result + MOD_FEMALE;
        } else if (gender == CODE_MALE) {
            return result + MOD_MALE;
        } else {
            throw new UnknownGenderCodeException(gender);
        }

    }
}
