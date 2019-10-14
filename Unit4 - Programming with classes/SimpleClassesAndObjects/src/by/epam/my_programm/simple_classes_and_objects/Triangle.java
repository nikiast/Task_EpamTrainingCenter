package by.epam.my_programm.simple_classes_and_objects;

public class Triangle {
    Side A;
    Side B;
    Side C;

    static class Point {
        private double x;
        private double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }

    static class Side {
        private Point a;
        private Point b;

        Side(Point a, Point b) {
            this.a = a;
            this.b = b;
        }

        public Point getA() {
            return a;
        }
        public Point getB() {
            return b;
        }

        double calculateSide() {
            return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        }
    }


    Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }

    static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }

    private double calculatePerimeter(){
        return A.calculateSide() + B.calculateSide() + C.calculateSide();
    }

    private double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
    }

    private Point pointMedianIntersection() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }


    public static void main(String[] args) {
        Point a = new Point(-6, 1);
        Point b = new Point(7, 11);
        Point c = new Point(8, 3);

        System.out.println("Координаты вершин : " + "A(" + a.getX()+ ", " + a.getY() + ");" +
                " B(" + b.getX() + ", " + b.getY() +"); C(" + c.getX() + ", " + c.getY() + ")");

        Triangle triangle = createTriangle(a, b, c);

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Периметр : " + perimeter);

        double area = triangle.calculateArea();
        System.out.println("Площадь : " + area);

        Point o = triangle.pointMedianIntersection();
        System.out.println("Медианы пересекаются в точке : " + o.getX()+ " " + o.getY());
    }
}