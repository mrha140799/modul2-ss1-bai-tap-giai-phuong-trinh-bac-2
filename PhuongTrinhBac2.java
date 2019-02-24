package SS1BT6;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        float a , b ,c ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Phương trình bậc 2 : ax^2 + bx + c = 0");
        System.out.print("a = ");
        a = scn.nextFloat();
        System.out.print("b = ");
        b = scn.nextFloat();
        System.out.print("c = ");
        c = scn.nextFloat();

        if (denta(a ,b ,c) <0) {
            System.out.println("Phương trình vô nghiệm ");
        } else {
            System.out.println("x1 : " + ((-b + Math.sqrt(denta(a , b ,c )))/2*a));
            System.out.println("x2 : " + ((-b - Math.sqrt(denta(a , b ,c )))/2*a));

        }

    }
    static float denta (float a, float b , float c) {
            float deta = (float) (Math.pow(b , 2) - (4*a*c));
        return deta;
    }

}
