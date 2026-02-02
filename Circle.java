public class Circle {
    double radius = 1;

    Circle(){   
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}
