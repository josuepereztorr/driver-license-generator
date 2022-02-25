package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String birthMonthDayGenderFormat = String.format("%03d",
                driversLicense.getBirthMonthDayGender());

        return driversLicense.getSoundexCode() + "-"
                + driversLicense.getFirstNameMiddleInitial() + (Integer.toString(driversLicense.getBirthYear())).charAt(0) + "-"
                + (Integer.toString(driversLicense.getBirthYear())).charAt(1) + birthMonthDayGenderFormat + "-"
                + "00";
    }
}
