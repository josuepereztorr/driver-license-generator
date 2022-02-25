package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        String birthMonthDayGenderFormat = String.format("%03d",
                driversLicense.getBirthMonthDayGender());

        return driversLicense.getSoundexCode() + "-"
                + driversLicense.getFirstNameMiddleInitial() + "-"
                + driversLicense.getBirthYear() + "-"
                + birthMonthDayGenderFormat + "-"
                + "0";
    }
}
