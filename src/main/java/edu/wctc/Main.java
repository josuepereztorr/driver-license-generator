package edu.wctc;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Last Name >> ");
        String lastName = scanner.nextLine();
        System.out.print("First Name >> ");
        String firstName = scanner.nextLine();
        System.out.print("Middle Initial >> ");
        String middleInitial = scanner.nextLine();
        System.out.print("Month of birth (1 - 12) >> ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Day of birth (1 - 31) >> ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.print("Year of birth (YYYY) >> ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Gender (M/F) >> ");
        char gender = (scanner.nextLine()).charAt(0);

        try {

            DriversLicense dl = new DriversLicense();

            // SSSS
            String soundexCode = new LastNameUtility().encodeLastName(lastName);
            dl.setSoundexCode(soundexCode);

            // FFF
            int firstNameMiddleInitial =
                    new FirstNameUtility().encodeFirstName(firstName, middleInitial);
            dl.setFirstNameMiddleInitial(firstNameMiddleInitial);

            // YY
            //LocalDate birthdate = LocalDate.of(year, month, day);
            dl.setBirthYear(year % 100);

            // DDD
            int monthDayGender =
                    new MonthDayGenderUtility().encodeMonthDayGender(year,
                            month, day, gender);
            dl.setBirthMonthDayGender(monthDayGender);

            // NN
            dl.setOverflow(00);

            System.out.print("Wisconsin: ");
            System.out.println(new WisconsinFormatter().formatLicenseNumber(dl));

            dl.setOverflow(0);
            System.out.print("Florida: ");
            System.out.println(new FloridaFormatter().formatLicenseNumber(dl));

        } catch (MissingNameException | InvalidBirthdayException | UnknownGenderCodeException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Cannot continue because of a invalid input, " +
                    "program will end");
            System.out.println();
        }
    }
}
