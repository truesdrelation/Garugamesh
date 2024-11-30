package java102;

import java102.Shapes.Shape;

public class Square implements Shape {
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
		return sideLength*sideLength;
	}
	
	public double perimeter() {
		return sideLength*4;
	}
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	public boolean isOn(Point p) {
		Point topleft = new Point(corner.x,corner.y+sideLength);
        Point topright = new Point(corner.x+sideLength, topleft.y);
        Point bottomright = new Point(corner.x+sideLength, corner.y);
        if (p.y == corner.y) {
            if (p.x >= corner.x && p.x <= bottomright.x ) {
                return true;
            } 
        }
        if (p.y == topleft.y) {
            if (p.x >= corner.x && p.x <= bottomright.x ) {
                return true;
            } 
        }
        if (p.x == topleft.x) {
            if (p.y >= corner.y && p.y <= topleft.y) {
                return true;
            }
        }
       if (p.x == topright.x) {
        if (p.y >= corner.y && p.y <= topleft.y) {
            return true;
        }
       }
               return false;
	}
	
	/**  
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	
    
    public Square translate(double x, double y) {
        Point newCorner = new Point(corner.getX() + x, corner.getY() + y);

        // Return a new Square object with the updated corner and the same side length
        return new Square(newCorner, sideLength);
	}

	/** 
	* @return The sqaure that results from scaling the side length and maintaining the bottom left corner
	*/
	public Square scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
		Point topleft = new Point(corner.x,corner.y+sideLength);
        Point topright = new Point(corner.x+sideLength, topleft.y);
        Point bottomright = new Point(corner.x+sideLength, corner.y);
        Point[] points = {corner, topleft, topright, bottomright};
        return points;
	}
    public String cornersToString() {
        Point[] points = corners();
        return "Corners: " + points[0] + ", " + points[1] + ", " + points[2] + ", " + points[3];
    }
    

	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
}
