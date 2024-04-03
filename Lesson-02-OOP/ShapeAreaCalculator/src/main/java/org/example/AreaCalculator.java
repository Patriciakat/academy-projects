package org.example;

public class AreaCalculator {
    public static void main(String[] args) throws UnknownShapeException {

        runCalculator();
    }

    private static void runCalculator() throws UnknownShapeException {

        talkToUser();
        outputTheResult();
    }

    private static void talkToUser() throws UnknownShapeException {
        IOManager.usersShapeChoice();
        try {
            IOManager.dataInput();
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void outputTheResult() {

        Shape shape =
                switch (IOManager.getShapeChoice()) {

                    case 1 -> new Square(IOManager.getData1());
                    case 2 -> new Triangle(IOManager.getData1(), IOManager.getData2());
                    case 3 -> new Circle(IOManager.getData1());
                    default -> null;
                };
        if (shape != null) {
            shape.areaCalculator();
            System.out.println(shape);
        }
    }
}
