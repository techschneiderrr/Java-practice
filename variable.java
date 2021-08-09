public class variable {
    static int c = 20; //static variable
    static void method(){
        float b = 100; //local variable
        System.out.println("this is a local variable b : " + b);
    }
    public static void main(String args[]) {
        int a = 50; //instance variable
        System.out.println("this is an instance variable a : " + a);
        method();
        System.out.println("this is a static variable c : " + c);
    }
}

// Variable : 
// -> a variable is name of a memory location.
// -> a variable is assigned with a datatype.
// -> a variable is the name of a reserved area allocated in the memory.
// example : int data = 50;
// here data is a variable of type int whose value is 50.

// Types of variable :
// -> local
// -> instance
// -> static

// Local varible : 
// -> variable declared inside the body of the method.
// -> a local variable cannot be defined with a static keyword.

// Instance variable : 
// -> variable declared inside the class but outside the method.
// -> it is not declared as static.
// -> it is called instance variable because its value is instance specific and is not shared among the instances.

// Static variable :
// -> you can only create a single copy of the static variable and share it among all the instances of the class.
// -> memory allocation happens only once for static variable, when the class is loaded in the memory.

