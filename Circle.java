/**
 * ============================================================================
 * File: Circle.java
 * Author: Trevor Tomesh
 * Date: February 23, 2026
 * Course: CIDS235-SP26
 * ============================================================================
 * 
 * Description:
 * Represents a circle with a specified radius.
 * This class tracks the number of Circle objects created and provides
 * methods to calculate area, perimeter, and manage the radius.
 * 
 * Javadoc comments written by GitHub Copilot
 * ============================================================================
 */

/**
 * Represents a circle with a specified radius.
 * This class tracks the number of Circle objects created and provides
 * methods to calculate area, perimeter, and manage the radius.
 */
public class Circle {
    /** The radius of the circle, default value is 1. */
    private double radius = 1;
    /** Static counter for the total number of Circle objects created. */
    private static int numberOfObjects = 0;

    /**
     * Constructs a Circle with the default radius of 1.
     * Increments the number of Circle objects created.
     */
    public Circle(){   
        incObjects();
    }

    /**
     * Constructs a Circle with a specified radius.
     * Increments the number of Circle objects created.
     * 
     * @param newRadius the radius of the circle
     */
    public Circle(double newRadius){
        radius = newRadius;
        incObjects();
    }

    /**
     * Increments the static count of Circle objects.
     * 
     * @return the updated number of Circle objects
     */
    private static int incObjects(){
        numberOfObjects++;
        return numberOfObjects;
    }

    /**
     * Calculates and returns the area of the circle.
     * Area = π * r²
     * 
     * @return the area of the circle
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    /**
     * Calculates and returns the perimeter (circumference) of the circle.
     * Perimeter = 2 * π * r
     * 
     * @return the perimeter of the circle
     */
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /**
     * Sets the radius of the circle to the absolute value of the given parameter.
     * 
     * @param newRadius the new radius value
     */
    public void setRadius(double newRadius){
            radius = Math.abs(newRadius);
    }

    /**
     * Returns the radius of the circle.
     * 
     * @return the radius of the circle
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Demonstrates accessing static variables, static methods, instance methods,
     * and instance variables from an instance method.
     * Prints the number of objects, area, and radius.
     */
    public void instancePrintStuff(){
        System.out.println(numberOfObjects); //access static var
        System.out.println(Circle.getNumberOfObjects());    // access static method
        System.out.println(getArea());  //access instance method
        System.out.println(radius); //access instance variable
    }

    /**
     * Demonstrates accessing static variables and static methods from a static method.
     * Note: instance methods and instance variables cannot be accessed in static context.
     * Prints the number of objects.
     */
    public static void staticPrintStuff(){
        System.out.println(numberOfObjects); //access static var
        System.out.println(Circle.getNumberOfObjects());    // access static method
        //System.out.println(getArea());  //access instance method
       //System.out.println(radius); //access instance variable
    }

    /**
     * Returns the total number of Circle objects created.
     * 
     * @return the count of Circle objects
     */
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
