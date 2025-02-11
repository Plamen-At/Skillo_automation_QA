package Lecture_02;

import java.util.Scanner;

//2. Print the perimeter of a triangle by given sides. Use formula to calculate it.

public class Exercise_02 {

    public static void triangleBuilder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 angles");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        // Check if triangle can be buld
        if ((angle1+angle2+angle3)==180){
            System.out.println("Triangle can be build");

            // Check the type of the triangle
            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("Type: Equilateral");
            } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Multifaceted");
            }

            // Check angle-based classification
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Type: Acute");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Type: Right-angled");
            } else {
                System.out.println("Type: Obtuse");
            }

        }
        else{
            System.out.println("Triangle can not be build");
        }
    }


}
