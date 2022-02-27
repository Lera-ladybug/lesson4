package org.example;
import java.util.Scanner;
public class Main1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину треугольника: ");
        double a = scanner.nextDouble();

        System.out.println("Введите высоту треугольника: ");
        double b = scanner.nextDouble();

        //Площадь треугольника вычисляется по формуле = (width*height)/2
        double area = (a* b)/2;
        System.out.println("Площадь треугольника равна: " + area);
    }
}