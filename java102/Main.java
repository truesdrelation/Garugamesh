package java102;

import java.util.ArrayList;


import java102.Shapes.Shape;


public class Main{
public static void main(String[] args) {
    Point point = new Point(4, 3);
    System.out.println("x: " + point.x + "y: " + point.y);

    Point xTranslation = point.translateX(3); // should be (7, 3)
    Point yTranslation = point.translateY(-7); // should be (4, -4)
    Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

System.out.println("x transl: " + xTranslation);
System.out.println("y transl: " + yTranslation);
System.out.println("xy transl: " + xyTranslation);

//Defines point A & B

Point a = new Point(340, 250);
Point b = new Point(72,129 );

System.out.println(Point.distance(a, b));

// Input & print for center of mass practice problem

Point[] agg = {
    new Point(0,0),
    new Point(68,8634543)
    
};
System.out.println("(PRACTICE)" + Point.centerOfMass(agg));

// Input & print for angle practice problem
Point A1 = new Point(0,0);
System.out.println("(PRACTICE)" + A1.angle(A1));

// Input & print for rotate 90 (theta rotation challenge pt 1)
Point A2 = new Point(1,1);
System.out.println("(CHALLENGE)" + A2.rotate90(A2));

// Input & print for rotate by theta degrees (theta rotation challenge pt 2)

Point point1 = new Point(13,13);
double theta = 90;
Point rotatedpoint = Point.rotate(point1, theta);
System.out.println("(CHALLENGE)" + rotatedpoint);

// Arraylist stuff

ArrayList<String> ark = new ArrayList<>();

ark.add("Hello");
ark.add("World");
System.out.println(ark);
ark.set(0, "Goodbye");
System.out.println(ark);



ArrayList<Boolean> conditions = new ArrayList<>();

conditions.add(true);
conditions.add(ark.get(0) == "Hello");
conditions.add(conditions.get(0) || conditions.get(1));
System.out.println(conditions);

ArrayList<Integer> intArr = new ArrayList<>();
for (int i = 0; i < 50; i++) {
	intArr.add(0);
}
System.out.println(intArr.size());
System.out.println(intArr.get(32));

// Grid stuff

Grid<Integer> grid = new Grid<>(5, 0);
grid.set(2, 2, 4);
System.out.println(grid);


// Input & print for diagonal practice problem
Grid<Integer> g = new Grid<>(8, 6);
g.set(3,3,5);
System.out.println("(PRACTICE)" + g.diagonal(g));

//print for maxsidelength practice problem
System.out.println("(PRACTICE)" + Grid.maxSideLength());

//working with circles
Point k = new Point(0,0);
Circle cic = new Circle(k,100);
System.out.println(cic);

System.out.println(cic.isInside(k));

// Experimenting with squares
Point con = new Point(0,0);
Square testSquare = new Square(con, 10);
System.out.println(testSquare.cornersToString());
System.out.println(testSquare.translate(-6, 1));

Point com = new Point(1, 1);
System.out.println(testSquare.isOn(com));

//Experimenting with Shapes class
Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
    new Square(new Point(100, 2.1), 5.4),
    new Circle(new Point(0, 0), 1),
    new Circle(new Point(4, 9.123), 98.32),
    new Square(new Point(-321, 0), 0.02)};
System.out.println(sumArea(shapes));

Shape[] scaledShapes = scaleAll(shapes,4);
System.out.println("scaled shapes:");
for (Shape shape : scaledShapes) {
System.out.println(shape);
}

// Input & print fot frompoints practice problem
Point First = new Point(-1,-5555);
Point Fecond = new Point(1,1);
Point Fird = new Point(-1,1);

System.out.println("(PRACTICE)"+Circle.fromPoints(First, Fecond, Fird));

//inheirtance stuff

A aone = new A(12.3, 430);
B btwo = new B(-12.31, "hello");
// It calls constructor of A as well because it inherits everything from A including how it constructs
aone.method1();
btwo.method1();
// In the one above this it calls the A method because that method is it's parent and B did not override that with it's own method
btwo.method2();

A bInDisguise = new B(1002.013, "world");
//
bInDisguise.method2();
//creating objects
LibraryItem book1 = new Book("a", "1","John",5);
LibraryItem book2 = new Book("b", "2","James",10);
 LibraryItem dvd1 = new DVD("aura","3",1000);
 LibraryItem[] itemz = {book1, book2, dvd1};
book1.checkOut();

//Print for available items practice problem
ArrayList<LibraryItem> avail = availableItems(itemz);
System.out.println("(PRACTICE)"+avail);


//Print for return all practice problem (should print the extra book1)
returnAll(itemz);
ArrayList<LibraryItem> ava = availableItems(itemz);
System.out.println("(PRACTICE)"+ava);





}

// ReturnAll practice problem
public static void returnAll(LibraryItem[] items) {
    for (LibraryItem item : items) {
        item.returnItem();
    }
}
//availableitems practice problem

public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
    ArrayList<LibraryItem> Allavailable = new ArrayList<>();
    for (LibraryItem item : items) {
        if (item.available()) { 
        Allavailable.add(item);
        }
    }
    return Allavailable;
}

















static double sumArea(Shape[] shapes) {
	double sum = 0;
	for (Shape shape : shapes) {
		sum += shape.area();
	}
	return sum;
}

static Shape[] scaleAll(Shape[] shapes, double k) {
	Shape[] scaled = new Shape[shapes.length];
	for (int i = 0; i < shapes.length; i++) {
		scaled[i] = shapes[i].scale(k);
	}
	return scaled;


    
}


}






