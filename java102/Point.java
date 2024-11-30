package java102;


// A class is a type of thing which have specific types of traits
//kinda like a blueprint for an object, which is a thing in a class

public class Point {
    public static final String theta = null;
    //fields that will store data for objects
    public final double x;
        public final double y;
    
    // the constructor, which is a function that creates an object
    // the constructror is called to generate a new object instance of that class
    
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
            
        }
        
    // Getter for x
    public double getX() {
      return x;
  }

  // Getter for y
  public double getY() {
      return y;
  }






        public Point translateX(double t) {
            return new Point(x + t, y);
        }
        
        public Point translateY(double t) {
            return new Point(x, y + t);
        }
      @Override
      public String toString() {
          return "(" + x + ", " + y + ")";
      }
    
      public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y,2 ));
      }
      
      //CENTER OF MASS PARACTICE PROBLEM
      public static Point centerOfMass(Point[] points) {
        double sumX = 0;
        double sumY = 0;
        for (int i = 0; i < points.length; i++ ){
            sumX += points[i].x;
            sumY += points[i].y;
        }
        double avgx = sumX/points.length;
        double avgy = sumY/points.length;
        
        return new Point(avgx, avgy);
        
      }
    
      //ANGLE PRACTICE PROBLEM
      public double angle(Point point) {
        double angleRadians = Math.atan2(y, x);
    double angleDegrees = Math.toDegrees(angleRadians);
    if (angleDegrees < 0) {
        angleDegrees += 360;
    
    }
    return angleDegrees;
  }
  //ROTATE BY 90 CHALLENGE
  public Point rotate90(Point point) {
    return new Point(-point.y, point.x);
  }

  //ROTATE BY THETA DEGREES CHALLENGE
public static Point rotate(Point p, double theta) {
double radians = Math.toRadians(theta);
double newX = p.x * Math.cos(radians) - p.y * Math.sin(radians);
double newY = p.x * Math.sin(radians) + p.y * Math.cos(radians);
return new Point(newX, newY);

}


}

