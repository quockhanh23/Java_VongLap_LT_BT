package ThucHanh_IntroductionToJava;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("your Kg ");
        weight = sr.nextDouble();
        System.out.println("your cm");
        height = sr.nextDouble();
        System.out.println("bmi ");
        bmi = weight/Math.pow(height, 2);

        if (bmi < 18) {
            System.out.println("Underweight " + bmi);
        } else if (bmi < 25.0) {
            System.out.println("Normal " + bmi);
        } else if (bmi < 30.0) {
            System.out.println("Overweight " + bmi);
        } else {
            System.out.println("to fat " + bmi);
        }

    }
}
