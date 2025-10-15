// JVM will look for this specific class syntax so it's a must
// Java is a statically typed language

// COMPILE WITH FILE NAME
// RUN WITH CLASS NAME

class Demo {  // Not necessary to be the same name as the file
     // JVM will look for main function. Main fn should not return anything (void)
     // It should be public. Anyone can access it
    public static void main (String args[]) { // Passing in String args
        // By default, point values are double. To specify float, write f
        float f = 3.5f; 
        int num = 3;
        System.out.println(num + f); // + behaves as a Polymorphic operator. Works a different depending on what data you're providing
        System.out.println("Hello World");
        show();
    }

    public static void show() 
    {
        System.out.println("Fahad");
    }
}

// Operators => Arithmetic, Relational, Logical
// Conditional Statements => if, else if, else, ternary operators, switch cases
// Loops => for, while, do while
