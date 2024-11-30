package java102;
//CREATION OF NEW RIGHT TRIANGLE CLASS  
import java102.Shapes.Shape;

public class RightTriangle implements Shape {
    private Point corner; 
    private double base; 
    private double height; 
  
    public RightTriangle(Point corner, double base, double height) {
        this.corner = corner;
        this.base = base;
        this.height = height;
    }

 
    public Point getCorner() {
        return corner;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public double area() {
        return 0.5 * base * height;
    }

   
    @Override
    public Shape scale(double factor) {
        return new RightTriangle(corner, base * factor, height * factor);
    }

    @Override
    public String toString() {
        return "RightTriangle[corner=" + corner + ", base=" + base + ", height=" + height + "]";
    }

    // Static method to determine if two RightTriangle objects are similar
    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        // Calculate the ratios of the corresponding sides
        double ratioBase = t1.getBase() / t2.getBase();
        double ratioHeight = t1.getHeight() / t2.getHeight();

        // Right triangles are similar if the ratios of their corresponding sides are equal
        return Math.abs(ratioBase - ratioHeight) < 1e-9; // Allow for floating-point precision issues
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
    }

    @Override
    public boolean isInside(Point p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isInside'");
    }

    @Override
    public boolean isOn(Point p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isOn'");
    }

    @Override
    public Shape translate(double x, double y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'translate'");
    }
}
