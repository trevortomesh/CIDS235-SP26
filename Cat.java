public class Cat {

    String name = "Garfield";
    String color = "orange and black";
    int age = 40;
    double weight = 15;
    char sex = 'M';

    Cat(){ //Default constructor -- defaults to Garfield
    }

    Cat(String catName, String catColor, int catAge, double catWeight, char catSex){
        name = catName;
        color = catColor;
        age = catAge;
        weight = catWeight;
        sex = catSex;
    }

    void printInfo(){
        System.out.println(name + ": " + "age: " + age + " color: " 
        + color + " sex: " + sex + " weight: " + weight);
    }
    
    String getInfo(){
        return name + ": " + "age: " + age + " color: " + color + 
        " sex: " + sex + " weight: " + weight;
    }

    void sayMeow(){
        System.out.println("Meow!");
    }

    // void printCircle(Circle c){
    //     System.out.println(c.radius);
    //     c.radius = 1000;
    // }

    
}
