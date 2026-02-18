public class Circle {
    private double radius = 1;
    private static int numberOfObjects = 0;

    Circle(){   
        numberOfObjects++;
    }

    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    double getRadius(){
        return radius;
    }

    void instancePrintStuff(){
        System.out.println(numberOfObjects); //access static var
        System.out.println(Circle.getNumberOfObjects());    // access static method
        System.out.println(getArea());  //access instance method
        System.out.println(radius); //access instance variable
    }

    static void staticPrintStuff(){
        System.out.println(numberOfObjects); //access static var
        System.out.println(Circle.getNumberOfObjects());    // access static method
        //System.out.println(getArea());  //access instance method
       //System.out.println(radius); //access instance variable
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
