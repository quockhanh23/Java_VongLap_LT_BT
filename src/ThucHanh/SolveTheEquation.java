package ThucHanh;

import java.util.Scanner;

public class SolveTheEquation {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
                                                 // nhập và kiểu gì thì dùng next kiểu đó
        Scanner sc = new Scanner(System.in);     // đối tượng hỗ trợ nhập vào
        System.out.println("a : ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        if (a!=0) {
            double answer = (c - b)/a;
            System.out.println("Phương trình có nghiệm là " + answer);
        } else if (b == c) {
            System.out.println("Phương trình có vô số nghiệm");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
