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

------------------------------------------------------------------------------------------------------------------------------------------------------------

public static int GCD(int a, int b){
        // Here it does not matter if a>b or b>a.
        // Let's say our desire was that 'a' was the greater term.
        // if 'a' is the greater term we are fine with it.
        if (a % b == 0)
        return b;
        else
        return GCD(b, a % b);
        // Here even if 'a' is not the greater term.
        // The greater term 'b' will become 'a' and since a<b => a%b = a.
        // so it will become greater,smaller irrespective of the input
    }
// Complexity log(a+b) (https://codility.com/media/train/10-Gcd.pdf)
------------------------------------------------------------------------------------------------------------------------------------------------------------
