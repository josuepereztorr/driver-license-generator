package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        DriversLicense dl = new DriversLicense();

        return dl.getSoundexCode() + "-"
                + dl.getFirstNameMiddleInitial() + (Integer.toString(dl.getBirthYear())).charAt(0) + "-"
                + (Integer.toString(dl.getBirthYear())).charAt(1) + dl.getBirthMonthDayGender() + "-"
                + "00";
    }
}
