public class Circle {
    double radius = 1;
    static int numberOfObjects = 0;

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
}
