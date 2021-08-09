public class overflow {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte)a;

        System.out.println(a);
        System.out.println(b);

        byte x = 10;
        byte y = 10;
        //byte z = a + b;   error because the a+ b is int
        byte z = (byte) (x + y);
        System.out.println(z); 
    }
}

// OVERFLOW : Overflow occurs when we assign such a value to a variable which is more than the maximum permissible value.
// UNDERFLOW : Underflow occurs when we assign such a value to a variable which is less than the minimum permissible value.
// JVM does not throw any exception in case Overflow or underflow occurs, it simply changes the value. Its programmer responsibility to check the possibility of an overflow/underflow condition and act accordingly. 
