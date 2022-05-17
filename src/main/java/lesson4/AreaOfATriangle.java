package lesson4;

import java.util.Scanner;

public class AreaOfATriangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("введите значение стороны А треугольника:");
        int a = in.nextInt();
        System.out.println("введите значение стороны B треугольника:");
        int b = in.nextInt();
        System.out.println("введите значение стороны C треугольника:");
        int c = in.nextInt();

        in.close();

        int p = (a + b + c) / 2;
        double A = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (A > 0) {
            System.out.println("Площадь треугольника равна:" + A);
        } else {
            System.out.println("Не удалось посчитать площадь треугольника - треугольника с такими сторонами не существует");
        }
    }

    public static boolean isTriangle (int a, int b, int c) {

        return ((a + b > c) && (b + c > a) && (c + a > b));
        }
    }

