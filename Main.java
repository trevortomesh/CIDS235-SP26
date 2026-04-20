/**
 * ============================================================================
 * File: Main.java
 * Author: Trevor Tomesh
 * Date: February 23, 2026
 * Course: CIDS235-SP26
 * ============================================================================
 * 
 * Description:
 * The main entry point for the program. Demonstrates the use of the Circle
 * and Cat classes by creating instances and displaying their properties.
 * 
 * Javadoc comments written by GitHub Copilot
 * ============================================================================
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Main class containing the entry point for the program.
 * Demonstrates object creation and method calls on Circle and Cat classes.
 */
public class Main {

    /**
     * The main method - entry point of the program.
     * Creates Circle objects and demonstrates the static numberOfObjects tracking.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){

        Stack cornicopia = new Stack();
        Cat myCat = new Cat();
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();

        cornicopia.push(myCat);
        cornicopia.push(myCircle);
        cornicopia.push(myRectangle);
        cornicopia.push(cornicopia);

        System.out.println(cornicopia);

        


        //  int age = 45;
        //  byte newAge = (byte)age;
        // newAge = 12;

        // System.out.println(age);

        // Object o = new Circle();
        // Circle c = (Circle)o;
        // System.out.println(o);
        // System.out.println(c);

        // ArrayList<String> pokemon = new ArrayList<>();
        // pokemon.add("Pikachu");
        // pokemon.add("Vulpix");
        // pokemon.add("Mewtwo");
        // System.out.println(pokemon);
        // System.out.println(pokemon.contains("Raichu"));
        // System.out.println(pokemon.contains("Mewtwo"));

        


    //    int[] x = {1,2,3};
    //    int[] y = {1,2,3};
    //    System.out.println(x);
    //    System.out.println(y);
    //    System.out.println(x.equals(y));

    //     System.out.println(x == y);

    //     Circle circle1 = new Circle(1);
    //     //displayObject(circle1);
    //     Object c1 = circle1;
    //     GeometricObject g1 = circle1;
    //     GeometricObject g2 = new GeometricObject();
    //     displayObject(g2);

        // Object object1 = new Circle(1);
        // Object object4 = new Circle(1);
        // Object object2 = new Rectangle(1,1);
        // Object object3 = new Cat();
        // Object object5 = object3;


        // System.out.println(object5.equals(object1));
        // System.out.println(object1.equals(object4));


        // displayObject(object1);
        // displayObject(object2);
        // displayObject(object3);
       // Faculty faculty = new Faculty();

        // Circle myCircle = new Circle();
        // Rectangle myRectangle = new Rectangle();

        //displayObject(myRectangle);
        //displayObject(myCircle);

        // m(new GraduateStudent());
        // m(new Student());
        // m(new Person());
        // m(new Object());

        // GeometricObject o = new Circle();
        // System.out.println(((Circle)o).getArea());
        
        // Object c = new Circle();
        // Rectangle c2 = (Rectangle) c;


        // Object s = new Student();
        // Student s2 = (Student) s;





        // System.out.println(myCircle.isFilled());
        // System.out.println(myRectangle.isFilled());
         //System.out.println(myCircle);
         //System.out.println(myRectangle.toString());
        // System.out.println(myRectangle.toString());

       //int x = 5;
       //Integer x2 = new Integer("6");
        // Integer x1 = 5;
        // System.out.println(x1);
        // Integer[] array = {3,5,35,12,22,19,76,8,6};
        // ArrayList<Integer> listOfInts = new ArrayList<>(Arrays.asList(array));
        // ArrayList<String> cityList = new ArrayList<>();
        // java.util.Collections.sort(listOfInts);
        // System.out.println(listOfInts);

        // cityList.add("Cameron");
        // cityList.add("Clarksville");
        // cityList.add("Grantsburg");
        // cityList.add("Hudson");
        // cityList.add("Hyderabad");
        // cityList.add("Scandia");
        // cityList.add("Hudson");
        // cityList.add("Hudson");
        // System.out.println(cityList);        



        // Astragali dice = new Astragali();

        // int count1 = 0;
        // int count3 = 0;
        // int count4 = 0;
        // int count6 = 0;
        // for(int i = 0; i < 100; i++){
        //     int roll = dice.roll();
        //  //System.out.println();
        //  if(roll == 1){
        //     count1++;
        //  }
        //  else if(roll == 3){
        //     count3++;
        //  }
        //  else if(roll == 4){
        //     count4++;
        //  }
        //  else{count6++;}
        // }

        // System.out.println("count1: " + count1);
        // System.out.println("count3: " + count3);
        // System.out.println("count4: " + count4);
        // System.out.println("count6: " + count6);



        // StackOfIntegers stack = new StackOfIntegers();
        // for(int i = 0; i < 10; i++){
        //     stack.push(i);
        // }

        // while(!stack.isEmpty()){
        //     System.out.print(stack.pop() + " ");
        // }

        // System.out.println(stack.pop());

        // Student newStudent = new Student();
        // Name newName = new Name();
        // newStudent.setName("John", "Cena");

        // Course course1 = new Course("Programming Paradigms");

        // course1.addStudent(newStudent.getName());
        // course1.addStudent("Bob theBuilder");

        // System.out.println("Number of Students in course1: "
        //     + course1.getNumberOfStudents()
        // );

        // String[] students = course1.getStudents();

        // for(int i = 0; i < course1.getNumberOfStudents(); i++){
        //     System.out.print(students[i] + ", ");
        // }
        // System.out.println();
        



        //SwingUtilities.invokeLater(Main::createAndShowGui);
        // Thistest test = new Thistest();
        // test.test();

        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < 10000; i++){
        //     sb.append(i);
        // }

        // String s = sb.toString();

        // int score = 100;
        // int max = 100;
        // String msg = "Score: " + score + " / " + max;
        // System.out.println(msg);

        // String myString = "hi";
        // myString += " Bob!";

        // System.out.println(myString);

        // String s = "";

        // for(int i = 0; i < 10000; i++){
        //     s = s + i;
        // }
        // System.out.println(s);

        // int a = 5;
        // int b = 5;

        // System.out.println(a == b);

        //  String x = "yo!";
        //  String y = "yo!";
        //  String z = new String("yo!");

        // System.out.println(x == y);
        // System.out.println(x == z);
        // System.out.println(x.equals(y));
        // System.out.println(x.equals(z));



        // String a = new String("hi!");
        // String b = new String("hi!");

        // System.out.println(a == b);
        // System.out.println(a.equals(b));


        // String x = "a";
        // String y = x;
        // x = x + "b";

        // System.out.println(x);
        // System.out.println(y);

        // String a = "hello";
        // String b = "hello";

        // System.out.println(a == b);

        // String s = "Hello";
        // s = "How are you?";

        // System.out.println(s);

        // Immutable myImmutable = new Immutable(10);

        // System.out.println(myImmutable.getVar());
        //myImmutable.myVar = 7;

      //  Circle[] circleArray = createCircleArray(10);
       // printCircleArray(circleArray);

        

        // int[] myArray = new int[10];
        // System.out.println(myArray[5]);
        // int[] test = {1,2,3,4,5};
        // System.out.println(test);

        // Circle myCircle = new Circle(1);

        // int n = 5;
        // printAreas(myCircle, n);

        // System.out.println("Radius is " + myCircle.getRadius());
        // System.out.println("n is " + n);

        //Circle circle1 = new Circle(5);
        //Circle.incObjects();
        // System.out.println(Circle.getNumberOfObjects());
        // Circle circle2 = new Circle(2);
        // System.out.println(Circle.getNumberOfObjects());
        // System.out.println(circle1.getRadius());
        // printCircle(circle2);
        // System.out.println(circle2.getRadius());
        // double myRadiusGuy = circle1.getRadius();
        // myRadiusGuy = 123123;
       
        // System.out.println(circle1.getRadius());
        // //circle1.radius = 1000; //radius is private, so this line will cause an error
        // //circle1.setRadius(-300);
        // System.out.println("circle1 area is " + circle1.getArea());
        // //Circle.numberOfObjects = 1000000; 
        // System.out.println(circle1.getRadius());

        // int nobjects = circle1.getNumberOfObjects();
        // System.out.println("there are : " + Circle.getNumberOfObjects() + " circles!");
        // circle2.instancePrintStuff();
        // Date date = new Date();
        // System.out.println("The time since Jan 1 1970 is " +
        //     date.getTime() + " milliseconds");

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter an integer seed: ");
        // int seed = (int) date.getTime();
        // Random generator1 = new Random(seed);
        // Random generator2 = new Random(7);
        // System.out.print("From generator1: ");
        // for(int i =0; i < 10; i++){
        //     System.out.print(generator1.nextInt(1000)+" ");
        // }

        // System.out.print("From generator2: ");
        // for(int i =0; i < 10; i++){
        //     System.out.print(generator2.nextInt(1000)+" ");
        // }

        //System.out.println("test");

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

        // int i = 1;
        // int j = i;
        // i = 5;
        // System.out.println("j is now: " + j);
        // System.out.println(i);
        // Circle c = new Circle();
        // Circle c2 = new Circle(12);
        // c2 = c;
        // c.setRadius(5);
        // System.out.println(c + " radius: " + c.radius);
        // System.out.println(c2 + " radius: " + c2.radius);


    }

    public static void m(Object x){
        System.out.println(x.toString());
    }

    private static void createAndShowGui() {
        JFrame frame = new JFrame("Loan Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        java.awt.Font labelFont = new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14);
        java.awt.Font fieldFont = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 14);
        java.awt.Font headerFont = new java.awt.Font("SansSerif", java.awt.Font.BOLD, 18);

        java.text.NumberFormat currencyFormat = java.text.NumberFormat.getCurrencyInstance();

        JTextField interestField = new JTextField(10);
        JTextField yearsField = new JTextField(10);
        JTextField amountField = new JTextField(10);
        JTextField monthlyField = new JTextField(10);
        JTextField totalField = new JTextField(10);

        monthlyField.setEditable(false);
        monthlyField.setFocusable(false);
        totalField.setEditable(false);
        totalField.setFocusable(false);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 8, 8));
        inputPanel.setBorder(new EmptyBorder(12, 12, 12, 12));
        inputPanel.setBackground(new java.awt.Color(245, 248, 255));

        JLabel headerLabel = new JLabel("Loan Payment Calculator", JLabel.CENTER);
        headerLabel.setFont(headerFont);
        headerLabel.setBorder(new EmptyBorder(12, 12, 4, 12));

        JLabel interestLabel = new JLabel("Annual Interest Rate (%)");
        JLabel yearsLabel = new JLabel("Number of Years");
        JLabel amountLabel = new JLabel("Loan Amount");
        JLabel monthlyLabel = new JLabel("Monthly Payment");
        JLabel totalLabel = new JLabel("Total Payment");

        interestLabel.setFont(labelFont);
        yearsLabel.setFont(labelFont);
        amountLabel.setFont(labelFont);
        monthlyLabel.setFont(labelFont);
        totalLabel.setFont(labelFont);

        interestField.setFont(fieldFont);
        yearsField.setFont(fieldFont);
        amountField.setFont(fieldFont);
        monthlyField.setFont(fieldFont);
        totalField.setFont(fieldFont);

        java.awt.Color fieldBackground = new java.awt.Color(255, 255, 255);
        java.awt.Color outputBackground = new java.awt.Color(230, 240, 255);
        interestField.setBackground(fieldBackground);
        yearsField.setBackground(fieldBackground);
        amountField.setBackground(fieldBackground);
        monthlyField.setBackground(outputBackground);
        totalField.setBackground(outputBackground);

        interestField.setHorizontalAlignment(JTextField.RIGHT);
        yearsField.setHorizontalAlignment(JTextField.RIGHT);
        amountField.setHorizontalAlignment(JTextField.RIGHT);
        monthlyField.setHorizontalAlignment(JTextField.RIGHT);
        totalField.setHorizontalAlignment(JTextField.RIGHT);

        interestField.setToolTipText("Example: 6.5");
        yearsField.setToolTipText("Whole number of years");
        amountField.setToolTipText("Example: 250000");

        inputPanel.add(interestLabel);
        inputPanel.add(interestField);
        inputPanel.add(yearsLabel);
        inputPanel.add(yearsField);
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);
        inputPanel.add(monthlyLabel);
        inputPanel.add(monthlyField);
        inputPanel.add(totalLabel);
        inputPanel.add(totalField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(event -> {
            try {
                double annualInterestRate = Double.parseDouble(interestField.getText().trim());
                int numberOfYears = Integer.parseInt(yearsField.getText().trim());
                double loanAmount = Double.parseDouble(amountField.getText().trim());

                if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
                    JOptionPane.showMessageDialog(frame,
                        "Please enter values greater than zero.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
                monthlyField.setText(currencyFormat.format(loan.getMonthlyPayment()));
                totalField.setText(currencyFormat.format(loan.getTotalPayment()));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(frame,
                    "Please enter valid numeric values.",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(event -> {
            interestField.setText("");
            yearsField.setText("");
            amountField.setText("");
            monthlyField.setText("");
            totalField.setText("");
            interestField.requestFocusInWindow();
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(new java.awt.Color(245, 248, 255));
        calculateButton.setFont(labelFont);
        clearButton.setFont(labelFont);
        calculateButton.setBackground(new java.awt.Color(255, 214, 153));
        clearButton.setBackground(new java.awt.Color(220, 220, 220));
        buttonPanel.add(clearButton);
        buttonPanel.add(calculateButton);

        frame.getContentPane().setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(new java.awt.Color(245, 248, 255));
        frame.getContentPane().add(headerLabel, BorderLayout.NORTH);
        frame.getContentPane().add(inputPanel, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        frame.getRootPane().setDefaultButton(calculateButton);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static Circle[] createCircleArray(int len){
            Circle[] circleArray = new Circle[len];
            for(int i = 0; i < circleArray.length; i++){
                circleArray[i] = new Circle(Math.random()*100);
        }
        return circleArray;
    }

    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " + 
            c.getRadius() + " is " + c.getArea());
        //c.setRadius(100);
        //System.out.println(c);
        
    }

    public static void printAreas(Circle c, int times){
        System.out.println("Radius \t\tArea");
        while(times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }

    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");

        for(int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30s%-15f\n", circleArray[i].getRadius(),
            circleArray[i].getArea());
        }

        System.out.println("-------------------------");
        System.out.println("The total area of the circles is " + sum(circleArray));
        
    }

    public static double sum(Circle[] circleArray){
        double sum = 0;

        for(int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }
        return sum;
    }

    public static void displayObject(Object object){
        if(object instanceof GeometricObject){
            System.out.println("Your geometric object was created on: " + ((GeometricObject)object).getDateCreated());
        }

        if(object instanceof Circle){
            System.out.println("The circle area is " + ((Circle)object).getArea());
            System.out.println("The circle's diameter is: " + ((Circle)object).getRadius()*2);
        }else if(object instanceof Rectangle){
            System.out.println("The rectangle's area is " + ((Rectangle)object).getArea());
        }else{System.out.println(object.toString());}
        // System.out.println("Created on " + object.getDateCreated() + 
        //                     ". Color is " + object.getColor());
        //System.out.println(object.getArea());
    }

    // public boolean equals(Object obj){
    //     return this == obj;
    // }


}
