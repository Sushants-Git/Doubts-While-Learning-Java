// Rounding a double to 5 decimal places
// You can round to the fifth decimal place by making it the first decimal place by multiplying your number. Then do normal rounding, and make it the fifth decimal place again.

// Let's say the value to round is a double named x:

double factor = 1e5; // = 1 * 10^5 = 100000.
double result = Math.round(x * factor) / factor;

// If you want to round to 6 decimal places, let factor be 1e6, and so on.

------------------------------------------------------------------------------------------------------------------------------------------------------------

//Static methods in Java are inherited, but cannot be overridden.
  
public class Writer {
    public static void write() {
        System.out.println("Writing");
    }
}

public class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}

public class Programmer extends Writer {

    public static void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Writer thirdWriter = null;
        thirdWriter.write();
    }
}
//-----> Output :- Writing

-------------------------------------------------------------------------------------------------------------------------------------------------------------

public static int GCD(int a, int b){
        // Here it does not matter if a>b or b>a.
        // Let's say our desire was that 'a' was the greater term.
        // if 'a' is the greater term we are fine with it.
        if (a % b == 0)
        return b;
        else
        return GCD(b, a % b);
        // Here even if 'a' is not the greater term.
        // The greater term 'b' will become 'a' and since a<b => a%b = a.(GCD(b, a % b);)
        // so it will become greater,smaller irrespective of the input
    }
// Complexity log(a+b) (https://codility.com/media/train/10-Gcd.pdf)

-------------------------------------------------------------------------------------------------------------------------------------------------------------

Point originOne = new Point(23, 94);
Rectangle rectOne = new Rectangle(originOne, 100, 200);
Rectangle rectTwo = new Rectangle(50, 100);


// 1.Declaration: The code set in bold are all variable declarations that associate a variable name with an object type.
// 2.Instantiation: The new keyword is a Java operator that creates the object.
// 3.Initialization: The new operator is followed by a call to a constructor, which initializes the new object.

--------------------------------------------------------------------------------------------------------------------------------------------------------------

// Declaring a Variable to Refer to an Object
// Previously, you learned that to declare a variable, you write:
// type name;
// This notifies the compiler that you will use name to refer to data whose type is type. With a primitive variable, this declaration also reserves the proper amount of memory for the variable.
// You can also declare a reference variable on its own line. For example:
// Point originOne;
// If you declare originOne like this, its value will be undetermined until an object is actually created and assigned to it. Simply declaring a reference variable does not create an object. For that, you need to use the new operator, as described in the next section. You must assign an object to originOne before you use it in your code. Otherwise, you will get a compiler error.
// A variable in this state, which currently references no object, can be illustrated as follows (the variable name, originOne, plus a reference pointing to nothing):
  
---------------------------------------------------------------------------------------------------------------------------------------------------------------
  
// int height = new Rectangle().height;  
  
---------------------------------------------------------------------------------------------------------------------------------------------------------------  

// Lambda Expressions
// One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method,
// then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method.
  
// An interface having a single method, a class implementing that inerface and overriding that method then you create an object of this class.
// Instead of doing all this you can just create an object using lambda functions.  

---------------------------------------------------------------------------------------------------------------------------------------------------------------
  
// The difference between a checked and unchecked exception is that a checked exception is caught at compile time whereas a runtime or unchecked exception is,
// as it states, at runtime.
// A checked exception must be handled either by re-throwing or with a try catch block, a runtime isn’t required to be handled. An unchecked exception is a programming error and are fatal,
// whereas a checked exception is an exception condition within your codes logic and can be recovered or retried from.  

![Types of Exceptions in Java, Checked vs Unchecked](https://cdn.rollbar.com/wp-content/uploads/2021/10/types-of-exceptions-in-java-checked-unchecked.png)

----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Recursive Programs to find Minimum                                                     
static int Min(int[] arr,int index) {
		if(index == arr.length - 1) {
			return arr[arr.length - 1];
		}
		return Math.min(arr[index],Min(arr,index + 1));
	}               

----------------------------------------------------------------------------------------------------------------------------------------------------------------                                                     
