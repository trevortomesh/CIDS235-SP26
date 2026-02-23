/**
 * ============================================================================
 * File: Cat.java
 * Author: Trevor Tomesh
 * Date: February 23, 2026
 * Course: CIDS235-SP26
 * ============================================================================
 * 
 * Description:
 * Represents a cat with properties such as name, color, age, weight, and sex.
 * Provides methods to display and retrieve information about the cat.
 * 
 * Javadoc comments written by GitHub Copilot
 * ============================================================================
 */

/**
 * Represents a cat with various attributes and behaviors.
 * Default cat is Garfield, an orange and black male cat, age 40, weight 15.
 */
public class Cat {
    /** The name of the cat. */
    String name = "Garfield";
    /** The color of the cat. */
    String color = "orange and black";
    /** The age of the cat in years. */
    int age = 40;
    /** The weight of the cat in pounds. */
    double weight = 15;
    /** The sex of the cat ('M' for male, 'F' for female). */
    char sex = 'M';

    /**
     * Constructs a Cat with default properties (Garfield).
     * Default: name="Garfield", color="orange and black", age=40, weight=15, sex='M'
     */
    Cat(){ //Default constructor -- defaults to Garfield
    }

    /**
     * Constructs a Cat with specified properties.
     * 
     * @param catName the name of the cat
     * @param catColor the color of the cat
     * @param catAge the age of the cat in years
     * @param catWeight the weight of the cat in pounds
     * @param catSex the sex of the cat ('M' for male, 'F' for female)
     */
    Cat(String catName, String catColor, int catAge, double catWeight, char catSex){
        name = catName;
        color = catColor;
        age = catAge;
        weight = catWeight;
        sex = catSex;
    }

    /**
     * Prints the cat's information to the console.
     * Format: name: age: X color: Y sex: Z weight: W
     */
    void printInfo(){
        System.out.println(name + ": " + "age: " + age + " color: " 
        + color + " sex: " + sex + " weight: " + weight);
    }
    
    /**
     * Returns the cat's information as a string.
     * Format: name: age: X color: Y sex: Z weight: W
     * 
     * @return a string containing the cat's information
     */
    String getInfo(){
        return name + ": " + "age: " + age + " color: " + color + 
        " sex: " + sex + " weight: " + weight;
    }

    /**
     * Prints a meow sound to the console.
     */
    void sayMeow(){
        System.out.println("Meow!");
    }

    // void printCircle(Circle c){
    //     System.out.println(c.radius);
    //     c.radius = 1000;
    // }

    
}
