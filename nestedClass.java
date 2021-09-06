public class nestedClass {
    
}
// JAVA inner classes and nested classes
// ->is a class that is a class declared inside a class or an interface
// ->we use inner classes to logically group classes and interface in one place to be more readable and maintainable
// -> it can access all the members of tghe outer class, including the private data members and the methods
// advantages :
// -> it can access all the members and the methods of the outer class including private 
// -> to develop more readable and maintainable code
// -> code optimization : it requires less code to write

//diffrence between inner and nested class:
// ->an inner class is a part of the nested class
// ->a non static nested class is an inner class

//types of nested classes:
//--->two types:
// 1. static
// 2. non-static (inner class):
// -->member inner class: 
//  -->a class created within class and outside the method
//  --> it is also known as regular inner class
//  --> it can be declared with class modifiers like public, private and protected
// -->anonymous inner class: 
//  --> a class created for implementing an interface or extending class
//  --> java compiler decides its name 
// -->local inner class: 
//  --> a class was created within the class