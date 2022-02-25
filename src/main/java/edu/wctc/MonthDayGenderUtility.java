package edu.wctc;

import org.apache.commons.validator.GenericValidator;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day,
                                    char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {

        String date = String.format("%s-%s-%s", year, month, day);
        int result = ((month - 1) * 40) + day;

        if (genderCode == CODE_FEMALE)
            return result + MOD_FEMALE;
        else if (genderCode == CODE_MALE)
            return result + MOD_MALE;
        else if (!GenericValidator.isDate(date,"yyyy-MM-dd", true))
            throw new InvalidBirthdayException(year, month, day);
        else
            throw new UnknownGenderCodeException(genderCode);

    }
}
