package org.example;

import java.util.Scanner;

public class IOManager {

    private static int shapeChoice;
    private static double data1;
    private static double data2;

    public static int getShapeChoice() {
        return shapeChoice;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }

    static final Scanner scanner = new Scanner(System.in);

    static void usersShapeChoice() throws UnknownShapeException {

        System.out.println("""
                Which shape do you want to calculate the area of?
                1. Square
                2. Triangle
                3. Circle
                Choose a number:
                """);
        shapeChoice = scanner.nextInt();
    }

    static void dataInput() throws UnknownShapeException {

        switch (shapeChoice) {
            case 1:
                System.out.println("Enter a side of a square:");
                data1 = scanner.nextDouble();
                break;
            case 2:
                System.out.println("Enter side1 of a triangle:");
                data1 = scanner.nextDouble();
                System.out.println("Enter side2 of a triangle:");
                data2 = scanner.nextDouble();
                break;
            case 3:
                System.out.println("Enter a radius of a circle:");
                data1 = scanner.nextDouble();
                break;
            default:
                scanner.close();
                throw new UnknownShapeException("'" + shapeChoice + "'" + " shape does not exist");
        }
        scanner.close();

    }
    public static void calculatedArea(String shapeRep) {
        System.out.println(shapeRep);
        System.out.println("----------------------------------------");
    }
}
