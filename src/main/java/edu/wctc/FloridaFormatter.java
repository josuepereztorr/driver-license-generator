package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        DriversLicense dl = new DriversLicense();

        return dl.getSoundexCode() + "-"
                + dl.getFirstNameMiddleInitial() + "-"
                + dl.getBirthYear() + "-"
                + dl.getBirthMonthDayGender() + "-"
                + "0";
    }
}
