class StringDemo {
    public static void main (String args[]) {
        String s = "Fahad"; //  Behind the scenes: // String s = new String("Fahad"); 
        s = s + " Rasheed"
        // Strings are immutable
        System.out.println(s); // This will print Fahad Rasheed but that's a copy
        // In JVM, there is a string pool (imagine your RAM diagram/ memory diagram) in the heap memory. The modification will create a new variable or new string literal but the original is still there.
        // Additionally, if I create a new variable with the same value, both variables will point to the same value in the string pool, say Fahad at 101 address. No new variable is created.

        StringBuffer s1 = new StringBuffer("Meow"); // This is a mutable string
        s.append(" Rasheed");
        // s.length(), s.charAt(int index)
    }
}