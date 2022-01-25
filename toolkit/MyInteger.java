/*
    Design a class named MyInteger. The class contains:
     An int data field named value that stores the int value represented by this
     object.
     A constructor that creates a MyInteger object for the specified int value.
     A getter method that returns the int value.
     The methods isEven(), isOdd(), and isPrime() that return true if the
     value in this object is even, odd, or prime, respectively.
     The static methods isEven(int), isOdd(int), and isPrime(int) that
     return true if the specified value is even, odd, or prime, respectively.
     The static methods isEven(MyInteger), isOdd(MyInteger), and
     isPrime(MyInteger) that return true if the specified value is even, odd,
     or prime, respectively.
     The methods equals(int) and equals(MyInteger) that return true if
     the value in this object is equal to the specified value.
     A static method parseInt(char[]) that converts an array of numeric
     characters to an int value.
     A static method parseInt(String) that converts a string into an int
     value.
*/

package toolkit;

public class MyInteger {
    private int value; 

    public MyInteger() {
        
    }

    public MyInteger(int value) {
        this.value = value; 
    }

    public int getValue() {
        return this.value; 
    }

    public void setValue(int value) {
        this.value = value; 
    }

    public boolean isEven() {
        if (this.value % 2 == 0)
            return true; 
        else
            return false; 
    }

    public boolean isOdd() {
        if (this.value % 2 !=0)
            return true; 
        else
            return false; 
    }

    public boolean isPrime() {
        if (this.value == 0)
            return false; 
        else if (this.value == 1 || value == 2)
            return true; 
        else {
            for (int i = 2; i < this.value; i++) {
                if (this.value % i == 0)
                    return false; 
            }
        }
        return true; 
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0)
            return true; 
        else 
            return false; 
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0)
            return true;
        else 
            return false; 
    }

    public static boolean isPrime(int value) {
        if (value == 0)
            return false; 
        else if (value == 1 || value == 2)
            return true; 
        else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0)
                    return false; 
            }
        }
        return true; 
    }

    public static boolean isEven(MyInteger m) {
        if (m.getValue() % 2 == 0)
            return true;
        else 
            return false; 
    }

    public static boolean isOdd(MyInteger m) {
        if (!MyInteger.isEven(m))
            return true; 
        else 
            return false; 
    }

    public static boolean isPrime(MyInteger m) {
        if (m.getValue() == 0)
            return false; 
        else if (m.getValue() == 1 || m.getValue() == 2)
            return true; 
        else {
            for (int i = 2; i < m.getValue(); i++) {
                if (m.getValue() % i == 0)
                    return false; 
            }
        }
        return true; 
    }
    
    public boolean equals(int value) {
        if (value == this.value)
            return true; 
        else 
            return false; 
    }

    public boolean equals(MyInteger m) {
        if (m.getValue() == this.value)
            return true; 
        else 
            return false; 
    }

    public static int parseInt(char[] numCharArray) {
        String intCharArray = String.valueOf(numCharArray);
        int convertedArray = Integer.parseInt(intCharArray);
        return convertedArray;  
    }

    public static int parseInt(String numbers) {
        return Integer.parseInt(numbers); 
    }

    
}
