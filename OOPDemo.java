// OOP
// Class is the blueprint for a object
// You give a class and the JVM will give you the object 
// Every object knows something (Attributes/Variables) and every object does something (Methods)

// Do right click => Source Actions for useful stuff like Generate Getters and Setters

class Keyboard // Parent of AdvKeyboard
{
    // Instance varaibles are stored with the object
    int keys;
    String colors;
    final int cats = 2; // const = final 

    public void pressed() {
        System.out.println("Signal Sent" + cats);
    }

    // Compile Time Polymorphism - specify at compile time which method is called based on parameters
    // Method Overloading
    public void pressed(String str) { // If you pass a param, this is called. If not, the above pressed is called.
        System.out.println(str + "Method Overloading");
    }

    public void throwIt() {
        System.out.println("Got hit");
    }

}

// Inheritance and Polymorphism

// No multiple inheritance in Java

// Polymorphism means same thing but different behaviour
// - Method Overriding
// - Method Overloading 

class AdvKeyboard extends Keyboard  // Child of Keyboard
{
    public void hitNum() {
        System.out.println("HITNUM");
    }
    
    // Method Overriding - RunTime Polymorphism
    public void throwIt () {
        System.out.println('Got hit harder');
    }
}

// Encapsulation
// Binding your variables to methods is called Encapsulation 
// Outside of the class, no one should be able to access the variables from outside the class 

class Mouse {
    private int buttons; // Cannot access buttons outside of the class directly

    // Custom Constructor with the same name as class
    public Mouse() { // Usually for setting class
        buttons = 2;
    }
    
    // Setter Method
    public void setButtons(int buttons) 
    {
        // buttons = buttons // Confuses with arg buttons, the local variable
        // To access the instance variable and assign to it instead of the local variable, we can use the 'this' keyword
        this.buttons = buttons;
    }

    // Getter Method
    public int getButtons() {
        return buttons;
    }

    // Getter Method getButtons 

    public void scrollUp() {
        System.out.println("Scrolling Up");
    }

    
    public void scrollDown() {
        System.out.println("Scrolling Down");
    }


}

// Custom Constructor 

class OOPDemo { 
    public static void main (String args[]) { // Passing in String args
        int num; // Primitive Variable
        num = 8;
        
        // Creating a type of keyboard
        Keyboard obj; // Reference Variable
        obj = new Keyboard(); // Constructor creating an instance of the Keyboard Class
        obj.pressed();
        obj.throwIt();

        AdvKeyboard obj2;
        obj2 = new AdvKeyboard();
        obj2.pressed(); // Calling inherited methods
        obj2.hitNum(); // Calling class's method
        obj2.throwIt(); // Method Overridden

        Mouse obj3;
        obj3 = new Mouse();
        
    }
}
