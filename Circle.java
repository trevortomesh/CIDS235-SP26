public class Circle {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public Circle(){   
        incObjects();
    }

    public Circle(double newRadius){
        radius = newRadius;
        incObjects();
    }

    private static int incObjects(){
        numberOfObjects++;
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius){
            radius = Math.abs(newRadius);
    }

    public double getRadius(){
        return radius;
    }

    public void instancePrintStuff(){
        System.out.println(numberOfObjects); //access static var
        System.out.println(Circle.getNumberOfObjects());    // access static method
        System.out.println(getArea());  //access instance method
        System.out.println(radius); //access instance variable
    }

    public static void staticPrintStuff(){
        System.out.println(numberOfObjects); //access static var
        System.out.println(Circle.getNumberOfObjects());    // access static method
        //System.out.println(getArea());  //access instance method
       //System.out.println(radius); //access instance variable
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
