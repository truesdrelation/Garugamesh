package java102;

import java102.Shapes.Shape;

public class Circle implements Shape {
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}


	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

    
    public static Circle fromPoints(Point p1, Point p2, Point p3) {
 if (areCollinear(p1, p2, p3)) {
    throw new IllegalArgumentException("The points are collinear and cannot form a unique circle.");
}
Point midAB = new Point((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
Point midBC = new Point((p2.getX() + p3.getX()) / 2, (p2.getY() + p3.getY()) / 2);

double slopeAB = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
double slopeBC = (p3.getY() - p2.getY()) / (p3.getX() - p2.getX());

double perpSlopeAB = (slopeAB == 0) ? Double.POSITIVE_INFINITY : -1 / slopeAB;
double perpSlopeBC = (slopeBC == 0) ? Double.POSITIVE_INFINITY : -1 / slopeBC;

double cx, cy;
if (Double.isInfinite(perpSlopeAB)) {
    cx = midAB.getX();
    cy = perpSlopeBC * (cx - midBC.getX()) + midBC.getY();
} else if (Double.isInfinite(perpSlopeBC)) {
    cx = midBC.getX();
    cy = perpSlopeAB * (cx - midAB.getX()) + midAB.getY();
} else {
    cx = (perpSlopeAB * midAB.getX() - midAB.getY() - perpSlopeBC * midBC.getX() + midBC.getY()) /
         (perpSlopeAB - perpSlopeBC);
    cy = perpSlopeAB * (cx - midAB.getX()) + midAB.getY();
}

Point center = new Point(cx, cy);

double radius = Math.sqrt(Math.pow(center.getX() - p1.getX(), 2) + Math.pow(center.getY() - p1.getY(), 2));


return new Circle(center, radius);
}


private static boolean areCollinear(Point p1, Point p2, Point p3) {

double area = p1.getX() * (p2.getY() - p3.getY()) +
              p2.getX() * (p3.getY() - p1.getY()) +
              p3.getX() * (p1.getY() - p2.getY());
return Math.abs(area) < 1e-10; 

    }




	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}



}