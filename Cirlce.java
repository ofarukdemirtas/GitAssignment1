import java.lang.Math;

public class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY() {return y;}

    public boolean isIdentical(Point2D point) {
        if(this.x == point.getX() && this.y == point.getY()){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Circle2D {
    private final Point2D center;
    private final double radius;

    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {return center;}

    public double getRadius() {return radius;}

    public boolean overlaps(Circle2D other) {
        double d = Math.sqrt(Math.pow(this.center.getX() - other.getCenter().getX(), 2) + Math.pow(this.center.getY() - other.getCenter().getY(), 2));

        if(d < this.radius + other.getRadius()){
            return true;
        }
        else{
            return false;
        }
    }
}
