abstract class Shape {
    abstract void area();
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(6, 4);
        rect.area();
        tri.area();
    }
}
class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    void area() {
        double a = 0.5 * base * height;
        System.out.println("Area of Triangle = " + a);
    }
}
