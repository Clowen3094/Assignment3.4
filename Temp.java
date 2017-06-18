//demonstrating constructor chaining
package session3;

class Temp
{
    // default constructor 1
    
    // using this keyword from same class
    Temp()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    Temp(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    Temp(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        // invokes default constructor first
        new Temp();
    }
}