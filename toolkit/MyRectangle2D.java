package toolkit;

public class MyRectangle2D {

    private double x; 
    private double y; 
    private double width;
    private double height; 

    public MyRectangle2D() {
        this.x = 0; 
        this.y = 0; 
        this.width = 1; 
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x; 
        this.y = y; 
        this.width = width; 
        this.height = height; 
    }

    public double getWidth() {
        return width; 
    }

    public double getHeight() {
        return height; 
    }

    public double getArea() {
        return width * height; 
    }

    public double getPerimiter() {
        return (2 * width) + (2 * height); 
    }

    public boolean contains(double x, double y) {
        double leftWidth = this.x - (width / 2); 
        double rightWidth = this.x + (width / 2); 
        double topHeight = this.y + (height / 2); 
        double bottomHeight = this.y - (height / 2); 

        if ((x > leftWidth && x < rightWidth) && (y > bottomHeight && y < topHeight))
            return true; 
        else 
            return false; 
    }

    public boolean contains(MyRectangle2D r) {
        double bigTopHeight = y + (height / 2); 
        double bigBottomHeight = y - (height / 2); 
        double bigLeftSide = x - (width / 2); 
        double bigRightSide = x + (width / 2); 
        double smallTopHeight = r.y + (r.getHeight() / 2); 
        double smallBottomHeight = r.y - (r.getHeight() / 2); 
        double smallLeftSide = r.x - (r.getWidth() / 2); 
        double smallRightSide = r.x + (r.getWidth() / 2); 
        
        if (bigTopHeight > smallTopHeight)
            if (bigBottomHeight < smallBottomHeight)
                if (bigRightSide > smallRightSide)
                    if (bigLeftSide < smallLeftSide)
                        return true; 
        return false; 
    }

    public boolean overlaps(MyRectangle2D r) {
        double r1TopHeight = y + (height / 2); 
        double r1BottomHeight = y - (height / 2); 
        double r1LeftSide = x - (width / 2); 
        double r1RightSide = x + (width / 2); 
        double r2TopHeight = r.y + (r.getHeight() / 2); 
        double r2BottomHeight = r.y - (r.getHeight() / 2); 
        double r2LeftSide = r.x - (r.getWidth() / 2); 
        double r2RightSide = r.x + (r.getWidth() / 2); 
        double distance = Math.sqrt(Math.pow(r.x - x, 2) + Math.pow(r.y - y, 2)); 

        if (distance < height / 2 + r.getHeight() / 2 || distance < width / 2 + r.getWidth() / 2) {
            if ((r2BottomHeight > r1BottomHeight && r2BottomHeight < r1TopHeight) ||
                 (r2TopHeight > r1BottomHeight && r2TopHeight < r1TopHeight))
                return true; 
            else if ((r2LeftSide > r1LeftSide && r2LeftSide < r1RightSide) ||
                    (r2RightSide > r1LeftSide && r2RightSide < r1RightSide))
                return true; 
        }
        return false; 
    }

}
