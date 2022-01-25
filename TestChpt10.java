import toolkit.*; 
//uncomment import below if you plan to 
//use the split method at bottom of program
// import java.util.ArrayList; 

public class TestChpt10 {
    
    public static void main(String[] args) {

        // 10.3 MyInteger Class Methods Test

        MyInteger integer = new MyInteger(1013);

        int objValue = integer.getValue(); 
        System.out.println("The number is: " + objValue); 
        boolean isEven = integer.isEven();
        boolean isOdd = integer.isOdd(); 
        boolean isPrime = integer.isPrime(); 
        System.out.println(objValue + " is even: " + isEven); 
        System.out.println(objValue + " is odd: " + isOdd); 
        System.out.println(objValue + " is prime: " + isPrime);
        integer.setValue(100); 
        System.out.println("\nThe new number using the setter method is: " + integer.getValue());
        objValue = integer.getValue();  
        isEven = MyInteger.isEven(objValue);
        isOdd = MyInteger.isOdd(objValue); 
        isPrime = MyInteger.isPrime(objValue); 
        System.out.println("Using the static methods with int parameter: ");
        System.out.println("\t" + objValue + " is even: " + isEven); 
        System.out.println("\t" + objValue + " is odd: " + isOdd); 
        System.out.println("\t" + objValue + " is prime: " + isPrime);
        integer.setValue(10215);
        objValue = integer.getValue(); 
        System.out.println("\nThe new number using the setter method is: " + objValue); 
        System.out.println("Using the static methods with an object parameter: "); 
        isEven = MyInteger.isEven(integer); 
        isOdd = MyInteger.isOdd(integer); 
        isPrime = MyInteger.isPrime(integer); 
        System.out.println("\t" + objValue + " is even: " + isEven); 
        System.out.println("\t" + objValue + " is odd: " + isOdd); 
        System.out.println("\t" + objValue + " is prime: " + isPrime);
        System.out.println("\nThe current value of the object is: " + objValue); 
        int checkInt = 20718; 
        System.out.println("Using the equals method with an int parameter, we will check if " + 
                            checkInt + " equals the value of the object"); 
        boolean isEqual = integer.equals(checkInt);
        System.out.println("\t" + objValue + " = " + checkInt + " is " + isEqual);  
        System.out.println("\nUsing the equals method with an object parameter, we will check if " +
                            "two objects are equal");
        MyInteger newInteger = new MyInteger(); 
        newInteger.setValue(10215);
        int objValueTwo = newInteger.getValue(); 
        System.out.println("The value of the new object is: " + objValueTwo);  
        isEqual = integer.equals(newInteger); 
        System.out.println("\t" + "Object 1: " + objValue + " = " + "Object 2: " + objValueTwo +
                            " is " + isEqual); 
        char[] numberChars = {'1', '5', '8', '9'}; 
        System.out.println("\nThe numbers represented by chars in the array are: "); 
        
        for (int i = 0; i < numberChars.length; i ++)
            System.out.println(numberChars[i]); 
        System.out.print("Using the parseInt method with an array parameter, the integer is: "); 
        System.out.println(MyInteger.parseInt(numberChars));
        Integer newNum = MyInteger.parseInt(numberChars); 
        System.out.println("And the type is: " + newNum.getClass().getName());  
        String numberString = "1547985"; 
        System.out.println("\nThe string representation of a number: " + numberString); 
        System.out.println("And is of the type: " + numberString.getClass().getName()); 
        System.out.println("After the conversion using parseInt method with string parameter"); 
        newNum = MyInteger.parseInt(numberString); 
        System.out.println(newNum + " is now of the type: " + newNum.getClass().getName()); 

        // 10.4 MyPoint Class Methods Tests

        //create instance of MyPoint with no arg constructor, sets point to (0, 0)
        MyPoint p1 = new MyPoint(); 

        //create instance of MyPoint with given points
        MyPoint p2 = new MyPoint(10.5, 12.5);

        MyPoint p3 = new MyPoint(5.5, 7.5); 
        
        System.out.println("The points of the first object are " + 
                            "(" + p1.getX() + ", " + p1.getY() + ")"); 
        System.out.println("The points of the second object are " + 
                            "(" + p2.getX() + ", " + p2.getY() + ")"); 
        
        System.out.print("\nThe distance between point 1 and specified coordinates " + 
                            " (5.0, 10.0) is: "); 
        System.out.printf("%.4f", p1.distance(5.0, 10.0)); 
        System.out.print("\nThe distance between point 2 and specified coordinates " + 
                         " (5.0, 10.0) is: "); 
        System.out.printf("%.4f", p2.distance(5.0, 10.0)); 
        System.out.println("\nThe distance between point 1 and a specified point of " + 
                            "the MyPoint type "); 
        System.out.print("with coordinates (" + p3.getX() + ", " + p3.getY() + ") is: "); 
        System.out.printf("%.4f", p1.distance(p3)); 
        System.out.println("\nThe distance between point 2 and a specified point of " + 
                            "the MyPoint type "); 
        System.out.print("with coordinates (" + p3.getX() + ", " + p3.getY() + ") is: "); 
        System.out.printf("%.4f", p2.distance(p3)); 
        p2.setX(12.3); 
        p2.setY(7.9); 
        System.out.println("\nThe new coordinates of point 2 are " + 
                            "(" + p2.getX() + ", " + p2.getY() + ")"); 
        System.out.printf("The distance between point 2 and point 3 using the static method " +
                            "with two object parameters is: %.4f", MyPoint.distance(p2, p3)); 

        // 10.13 MyRectangle2D Class Method Tests

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9); 
        
        System.out.printf("The area of the rectangle is: %.3f", r1.getArea()); 
        System.out.printf("\nThe perimeter of the rectangle is: %.3f \n", r1.getPerimiter()); 
        System.out.print("The point (3, 3) is inside of the rectangle: ");
        System.out.println(r1.contains(3, 3));
        System.out.print("The rectangle with a center at (4, 5), a width of 10.5 " +
                        "and height of 3.2 is contained in r1: ");  
        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))); 
        System.out.print("The rectangle with a center at (3, 5), a width of 2.3 " +
                        "and height of 5.4 overlaps r1: ");  
        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))); 
        
        // 10.25 Split Class Method Tests

        String testString = "!Hello!World!How!Are!You!"; 
        String delimiter = "!"; 
        Split splitString = new Split(testString, delimiter);
        splitString.displayStringArray(); 

    }

    /*
    * Below is code that will do the same thing as the 
    * separate Split.java class located in the toolkit 
    * package folder. Just uncomment the code
    * and implement appropriately in the main class
    */

    // public static void split(String s, String regex) {
    //     ArrayList<String> list = new ArrayList<>();

    //     for (int i = 0; i < s.split(regex).length; i++) {
    //         list.add(s.split(regex)[i]);
    //         if (i != s.split(regex).length - 1)
    //             list.add(regex);  
    //     }

    //     if (s.charAt(s.length() - 1) == regex.charAt(0))
    //         list.add(regex);

    //     String[] splitArray = new String[list.size()]; 
        
    //     for (int i = 0; i < list.size(); i++) {
    //         splitArray[i] = list.get(i); 
    //     }
        
    //     for (int i = 0; i < splitArray.length; i++) {
    //         System.out.print(splitArray[i] + " "); 
    //     }

        
         
    }


