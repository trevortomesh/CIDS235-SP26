public class Main {
    public static void main(String[] args){
        System.out.println("test");

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(8);
        System.out.println("circle1 radius: " + circle1.radius);
        System.out.println("circle2 radius: " + circle2.radius);
        System.out.println("circle1 area: " + circle1.getArea());
        System.out.println("circle2 area: " + circle2.getArea());
    }
}


