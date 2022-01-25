package toolkit;

public class MyPoint {
    private double x; 
    private double y; 

    public MyPoint() {
        this(0, 0); 
    }

    public MyPoint(double x, double y) {
        this.x = x; 
        this.y = y; 
    }

    public void setX(double x) {
        this.x = x; 
    }

    public void setY(double y) {
        this.y = y; 
    }

    public double getX() {
        return this.x; 
    }

    public double getY() {
        return this.y; 
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)); 
    }

    public double distance(MyPoint p) {
        return distance(p.getX(), p.getY()); 
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double x1 = p1.getX();
        double x2 = p2.getX(); 
        double y1 = p1.getY();
        double y2 = p2.getY();
        double diffInX = x2 - x1; 
        double diffInY = y2 - y1; 
        return Math.sqrt(Math.pow(diffInX, 2) + Math.pow(diffInY, 2));  
    }
}
