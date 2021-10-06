package ThucHanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        width = sc.nextDouble();
        System.out.println("Nhập chiều dài");
        height = sc.nextDouble();
        double area = width * height;
        System.out.println("area : " + area);

    }

}

