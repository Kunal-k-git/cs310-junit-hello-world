package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        // Step 1: Create a new Stringbuilder with original message inside
        StringBuilder sb = new StringBuilder(message);
        
        // Step 2: Use StringBuilder's built-in function to flip the text
        sb.reverse();
        
        // Step 3: Turn it back to a String and return it
        return sb.toString();
    }
    
}