import java.util.Scanner;

public class Main {

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