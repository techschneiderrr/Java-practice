public class datatypes {
    public static void main(String[] args) {
        System.out.println("\nThis doc has the notes related to the data types in java in the comment form.\n");
    }
}

//Datatypes : it specifies the different sizes and values that can be stored in the variable.

//there are 2 types of datatypes in java:
//-> Primitive data type
//-> Non-Primitive data type

//-> Primitive data type :
//-> are the building blocks of data manipulation.
//-> there are 8 types of Primitive data type :

//  -----------------------------------------------
//  | datatype    | default value | default size  |
//  -----------------------------------------------
//  | 1.boolean   | false         | 1 bit         |
//  | 2.byte      | 0             | 1 byte        |
//  | 3.char      | \u0000        | 2 byte        |
//  | 4.short     | 0             | 2 byte        |
//  | 5.int       | 0             | 4 byte        |
//  | 6.long      | 0l            | 8 byte        |
//  | 7.float     | 0.0f          | 4 byte        |
//  | 8.double    | 0.0d          | 8 byte        |
//  -----------------------------------------------

// 1.Boolean : 
//-> is used to store only 2 possible values : true and false.
//-> is used for simple flags that track true/false
// example:
// Boolean one = false;

// 2.Byte : 
//-> it is 8 bit signed 2's complement integer
//-> its value is from -128 to 127 (inclusive)
//-> its used to save memmory in large arrays where the memory saving is most required
//-> it saves space because byte is 4 times smaller than an integer.
// example:
// byte a = 10;

// 3.Short :
//-> it is 16 bit signed 2's complement integer
//-> its value is from -32768 to 32767 (inclusive)
// example:
// short s = 10000;

// 4.Int :
//-> it is 32 bit signed 2's complement integer
//-> its value is from -2147483648 (-(2^31)) to 2147483647 ((2^31)-1) (inclusive)
// example:
// int s = 107;

// 5.Long :
//-> it is 32 bit signed 2's complement integer
//-> its value is from (-(2^63)) to ((2^63)-1) (inclusive)
// is used when you need range of values more than those provided by int 
// example:
// long s = 109777L;

// 6.Float :
// it is a single precision 32 bit floating point
// its value range is unlimited
// example:
// float s = 107.5f;

// 7.Double :
// it is a double precision 32 bit floating point
// its value range is unlimited
// example:
// double d = 107.5;

// 8.Char :
// it is a single 16-bit unicode character
// its value ranges from \u0000 (0) to \uffff (65535)
// example:
// char s = 'M';
// imp ques : why char uses 2 byte in java and what is \u0000 ?
// Answer : it is because java uses unicode system not ascii code. \u0000 is the lowest value representing 0 and \uffff represents the highest value 65535.
