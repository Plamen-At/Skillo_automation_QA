import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        homework2Ex1();
        homework2Ex2();
        homework2Ex3();
        homework2Ex4();
        homework2Ex5();
        homework2Ex6();
        triangleBuilder();
        printDayOfWeek();
        checkWorkEligibility();
        calculateRevenue();
        vacationAdvice();
        checkLeapYear();
        convertTemperature();
    }

    private static void homework2Ex1() {
//
//        System.out.println("Enter Your first name:");
//        String firstName = (System.console().readLine());
//        System.out.println("Enter Your middle name:");
//        String middleName = (System.console().readLine());
//        System.out.println("Enter Your last name:");
//        String lastName = (System.console().readLine());
//        System.out.println("Your name is: " + firstName + " " + middleName + " " + lastName);
    }

    private static void homework2Ex2() {
//
//        System.out.println("Enter side A");
//        int sideA = Integer.parseInt((System.console().readLine()));
//        System.out.println("Enter side B");
//        int sideB = Integer.parseInt((System.console().readLine()));
//        System.out.println("Enter side C");
//        int sideC = Integer.parseInt((System.console().readLine()));
//
//        //TBD Add check for correct input
//
//        int trianglePerim = sideA + sideB + sideC;
//        System.out.println("Perimeter of the triangle is: " + trianglePerim);
    }

    private static void homework2Ex3() {
//
//        System.out.println("Enter side A");
//        double sideA = Double.parseDouble(System.console().readLine());
//        System.out.println("Enter side B");
//        double sideB = Double.parseDouble(System.console().readLine());
//        System.out.println("Enter side C");
//        double sideC = Double.parseDouble(System.console().readLine());
//
//        //TBD Add check for correct input

//        double trinangleHalfPerim = (sideA + sideB + sideC) / 2;
//        double triangleArea = Math.sqrt(trinangleHalfPerim * (trinangleHalfPerim - sideA) * (trinangleHalfPerim - sideB) * (trinangleHalfPerim - sideC));
//
//
//
//        System.out.println("Area of the triangle is: " + triangleArea);
//
    }

    private static void homework2Ex4() {
//
//        System.out.print("   *   ");
//        System.out.println();
//        System.out.print("  ***  ");
//        System.out.println();
//        System.out.print(" ***** ");
//        System.out.println();
//        System.out.print("*******");
//        System.out.println();
//        System.out.println("   *");
//
    }

    private static void homework2Ex5() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please input pine tree height: ");
//        int pineTreeHeight = scanner.nextInt();
//
//        // TBD Add check for correct input
//
//        for (int i = 1; i <= pineTreeHeight; i++) {
//            // Outprint SPACE
//            for (int j = 1; j <= pineTreeHeight - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Outprint *
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//
//            // Next line
//            System.out.println();
//        }
//
//        // Outprint trunk
//        for (int i = 1; i <= pineTreeHeight / 3; i++) {
//
//            for (int j = 1; j < pineTreeHeight; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println("*");
//        }
//
//        scanner.close();
    }

    private static void homework2Ex6() {
//        Scanner scanner = new Scanner(System.in);
//
//        //Input minutes
//        System.out.print("Please input the number of minutes: ");
//        long minutes = scanner.nextLong();
//
//        int minutesInDay = 24 * 60;
//        int minutesInYear = 365 * minutesInDay;
//
//        long years = minutes / minutesInYear;
//        long remainingMinutes = minutes % minutesInYear;
//        long days = remainingMinutes / minutesInDay;
//
//        //Result output
//        System.out.printf(minutes + " minutes are about " + years + " years and " + days + " days.");
//
//        scanner.close();
    }

    public static void triangleBuilder(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter 3 angles");
//        int angle1 = scanner.nextInt();
//        int angle2 = scanner.nextInt();
//        int angle3 = scanner.nextInt();
//
//        // Check if triangle can be buld
//        if ((angle1+angle2+angle3)==180){
//            System.out.println("Triangle can be build");
//
//            // Check the type of the triangle
//            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
//                System.out.println("Type: Equilateral");
//            } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
//                System.out.println("Type: Isosceles");
//            } else {
//                System.out.println("Type: Multifaceted");
//            }
//
//            // Check angle-based classification
//            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
//                System.out.println("Type: Acute");
//            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
//                System.out.println("Type: Right-angled");
//            } else {
//                System.out.println("Type: Obtuse");
//            }
//
//        }
//        else{
//            System.out.println("Triangle can not be build");
//        }
    }

    public static void printDayOfWeek() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a digit (1-7):");
//        int day = scanner.nextInt();
//
//        if (day < 1 || day > 7) {
//            System.out.println("Invalid input. Please enter a number between 1 and 7.");
//            return;
//        }
//
//        String dayOfWeek = "";
//        String suffix = "";
//
//        // Determine the suffix (st/nd/rd/th)
//        if (day == 1) {
//            suffix = "-st";
//        } else if (day == 2) {
//            suffix = "-nd";
//        } else if (day == 3) {
//            suffix = "-rd";
//        } else {
//            suffix = "th";
//        }
//
//        // Determine the day of the week
//        switch (day) {
//            case 1:
//                dayOfWeek = "Monday";
//                break;
//            case 2:
//                dayOfWeek = "Tuesday";
//                break;
//            case 3:
//                dayOfWeek = "Wednesday";
//                break;
//            case 4:
//                dayOfWeek = "Thursday";
//                break;
//            case 5:
//                dayOfWeek = "Friday";
//                break;
//            case 6:
//                dayOfWeek = "Saturday";
//                break;
//            case 7:
//                dayOfWeek = "Sunday";
//                break;
//        }
//
//        // Output the result
//        System.out.println("The " + day + suffix + " day of the week is " + dayOfWeek + ".");
    }

    public static void checkWorkEligibility() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your age:");
//
//        int age = scanner.nextInt();
//
//        if (age >= 16) {
//            System.out.println("You are eligible to work.");
//        } else if (age > 0) {
//            System.out.println("You are not eligible to work.");
//        } else {
//            System.out.println("Invalid age input. Age must be a positive number.");
//        }
    }

    public static void calculateRevenue() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter unit price: ");
//        float unitPrice = scanner.nextFloat();
//
//        System.out.print("Enter quantity: ");
//        int quantity = scanner.nextInt();
//
//        float discountRate = (float) 0.0F;
//
//        // Determine the discount rate
//        if (quantity >= 100 && quantity <= 120) {
//            discountRate = (float) 0.15F; // 15%
//        } else if (quantity > 120) {
//            discountRate = (float) 0.20F; // 20%
//        }
//
//        // Calculate total revenue and discount
//        float totalCost = unitPrice * quantity;
//        float discount = totalCost * discountRate;
//        float finalRevenue = totalCost - discount;
//
//        // Output the results
//        System.out.printf("The revenue from sale: %.2f$\n", finalRevenue);
//        System.out.printf("Discount: %.2f$ (%.1f%%)\n", discount, discountRate * 100);
    }

    public static void vacationAdvice() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter type of vacation (1) for Beach or (2) for Mountain): ");
//        Integer vacationType = scanner.nextInt();
//
//      //STRING BASED INPUT
//      //System.out.print("Enter type of vacation (Beach/Mountain): ");
//      //String vacationType = scanner.nextLine().trim();
//
//        System.out.print("Enter budget per day per person: ");
//        float budgetPerDay = (float) scanner.nextFloat();
//
//        // Determine the advice based on vacation type and budget
//        //STRING BASED STATEMENT
//        //if (vacationType.equalsIgnoreCase("Beach"))
//        if (vacationType == 1) {
//            if (budgetPerDay < 50) {
//                System.out.println("Advice: Bulgaria is a good destination for your beach vacation.");
//            } else {
//                System.out.println("Advice: You can go Outside Bulgaria for your beach vacation.");
//            }
//        } else if (vacationType == 2) {
//            if (budgetPerDay < 30) {
//                System.out.println("Advice: Bulgaria is a good destination for your mountain vacation.");
//            } else {
//                System.out.println("Advice: You can go Outside Bulgaria for your mountain vacation.");
//            }
//        } else {
//            System.out.println("There is no information about this type of vacation.");
    }

    public static void checkLeapYear() {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input a year
//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();
//
//        // Check if the year is a leap year
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("Leap year");
//        } else {
//            System.out.println("Not a leap year");
//        }
    }

    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);

        // Temperature input
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Ask for the direction of conversion
        System.out.print("Enter the conversion type (1) for C to F or (2) for F to C):");
        scanner.nextInt();
        int conversionType = scanner.nextInt();

        // Temperature conversion
        if (conversionType == 1) {
            double fahrenheit = temperature * 9 / 5 + 32;
            System.out.printf("The temperature in Fahrenheit is: %.2f°F\n", fahrenheit);
        } else if (conversionType == 2) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is: %.2f°C\n", celsius);
        } else {
            System.out.println("Invalid conversion type. Please choose 'C to F' or 'F to C'.");
        }
    }
}