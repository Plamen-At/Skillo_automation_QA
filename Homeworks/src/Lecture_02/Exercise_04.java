package Lecture_02;
import java.util.Scanner;

//Print pine tree using asterisks in the console.

public class Exercise_04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Въвеждане на височината на борчето
            System.out.print("Въведете височината на борчето: ");
            int height = scanner.nextInt();

            // Рисуване на борчето
            for (int i = 1; i <= height; i++) {
                // Отпечатване на празните места (интервали)
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }

                // Отпечатване на звездички
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                // Преминаване на следващия ред
                System.out.println();
            }

            // Рисуване на стъблото на борчето
            for (int i = 1; i <= height / 3; i++) {
                // Отпечатване на празни места преди стъблото
                for (int j = 1; j < height; j++) {
                    System.out.print(" ");
                }
                // Отпечатване на звездичка за стъблото
                System.out.println("*");
            }

            scanner.close();
        }

}
