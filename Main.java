public class Main {
    public static void main(String[] args){
        System.out.println("test");

        // Circle circle1 = new Circle();
        // Circle circle2 = new Circle(8);
        // System.out.println("circle1 radius: " + circle1.radius);
        // System.out.println("circle2 radius: " + circle2.radius);
        // System.out.println("circle1 area: " + circle1.getArea());
        // System.out.println("circle2 area: " + circle2.getArea());

        // String cat1Name = "Genki";
        // String cat2Name = "Glitch";
        // String cat3Name = "Haku";
        // String cat4Name = "Soosoo";

        // int cat1Age = 2;
        // int cat2Age = 15;
        // int cat3Age = 5;
        // int cat4Age = 1;

        // String cat1Color = "orange";
        // String cat2Color = "tuxedo";
        // String cat3Color = "tuxedo";
        // String cat4Color = "black";

        // char cat1Sex = 'M';
        // char cat2Sex = 'M';
        // char cat3Sex = 'M';
        // char cat4Sex = 'F';

        // double cat1Weight = 16;
        // double cat2Weight = 16;
        // double cat3Weight = 10;
        // double cat4Weight = 8;

    //     Cat cat1 = new Cat("Glitch", "Tuxedo", 15, 16, 'M');
    //     System.out.println(cat1);
    //     Cat cat2 = new Cat("Cheddar", "orange", 4, 13.2, 'F');
       
    //     int x = 5;
    //     int myArray[] = {1,2,3,4,5};
    //     System.out.println("myArray is: " + myArray);
    //     Circle circle1 = new Circle();
    //     System.out.println("x is: " + x);
    //     System.out.println("circle1 is: " + circle1);

    //     circle1.setRadius(25);
    //     System.out.println(circle1.radius);
    //     System.out.println(circle1.getArea());

    //     Circle circle2 = new Circle(12);
    //     System.out.println(circle2.radius);
    //     System.out.println("----------------------");
    //     System.out.println("circle1.radius = " + circle1.radius);
    //     System.out.println("circle2.radius = " + circle2.radius);
    //     System.out.println("----------------------");


    //     cat1.printInfo();
    //     cat2.printInfo();

    //    System.out.println(cat1.getInfo());
    //    System.out.print(cat1.name + " says: ");
    //    cat1.sayMeow();

        int i = 1;
        int j = i;
        i = 5;
        System.out.println("j is now: " + j);
        System.out.println(i);
        Circle c = new Circle();
        Circle c2 = new Circle(12);
        c2 = c;
        c.setRadius(5);
        System.out.println(c + " radius: " + c.radius);
        System.out.println(c2 + " radius: " + c2.radius);


    }
}


