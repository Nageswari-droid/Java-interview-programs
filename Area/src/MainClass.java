abstract class Area {
    abstract double calculateArea(float parameterOne, float parameterTwo);
}

class Cylinder extends Area {
    @Override
    public double calculateArea(float radius, float height) {
        double area = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
        return area;
    }
}

class Parallelogram extends Area {
    @Override
    public double calculateArea(float base, float height) {
        double area = base * height;
        return area;
    }
}

class Rhombus extends Area {
    @Override
    public double calculateArea(float diagonalOne, float diagonalTwo) {
        double area = (diagonalOne * diagonalTwo) / 2;
        return area;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Parallelogram parallelogram = new Parallelogram();
        Rhombus rhombus = new Rhombus();

        System.out.println("Area of Cylinder : " + cylinder.calculateArea(3, 8));
        System.out.println("Area of Parallelogram : " + parallelogram.calculateArea(4, 18));
        System.out.println("Area of Rhombus : " + rhombus.calculateArea(15, 18));
    }
}
