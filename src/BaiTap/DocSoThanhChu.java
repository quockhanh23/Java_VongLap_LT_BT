package BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập số");
        int number = sr.nextInt();
        String change;

        switch (number) {
            case 1 :
             change = "một";
             break;
            case 2 :
                change = "hai";

                break;
            case 3:
               change = "ba";
                break;
            case 4:
               change = "bốn";
                break;
            case 5:
               change = "năm";
                break;
            case 6:
               change = "sáu";
                break;
            case 7:
               change = "bẩy";
                break;
            case 8:
               change = "tám";
                break;
            case 9:
                change = "chín";
                break;
            case 10:
                change = "mười";
                break;
            default:
                change = " no ";
        }
        if (change == " no ")
            System.out.println("không đọc được");
        else System.out.println(change);
        }
    }



