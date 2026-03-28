/**
* Author: Shreyas Bhagat
* Date: 1 Feb 2026
* Description:
* ========================================
        PROGRAM 2: LEVEL 2 (MEDIUM)
========================================
----------------------------------------
OBJECTIVE
----------------------------------------
Create a comprehensive Java program that explores:
- Type casting (implicit and explicit)
- Data type ranges
- Overflow/underflow behavior
- Utility of Wrapper Classes for type conversions

----------------------------------------
REQUIREMENTS
----------------------------------------

SECTION 1: Data Type Ranges
- Display a table showing MIN and MAX values for all numeric primitive types
- Use Wrapper class constants (e.g., Integer.MIN_VALUE, Byte.MAX_VALUE)
- Format output in a table structure

SECTION 2: Implicit Casting (Widening)
- Start with a byte variable with value 100
- Demonstrate automatic conversion through the chain:
  byte → short → int → long → float → double
- Print value at each step to show no data loss
- Demonstrate char to int conversion (ASCII value)

SECTION 3: Explicit Casting (Narrowing)
- Convert double to int and show decimal truncation
- Convert int (value: 130) to byte and explain overflow result
- Convert large long to int and show data loss
- Implement a safe casting check:
  Before casting, verify if value is within target type's range
  Only cast if safe, otherwise print warning

SECTION 4: Wrapper Classes
- Show boxing and unboxing:
    int primitive = 42;
    Integer wrapper = primitive;  // Auto-boxing
    int back = wrapper;           // Auto-unboxing
- Demonstrate useful Wrapper methods:
    Integer.parseInt()
    Double.parseDouble()
    Integer.toBinaryString()
    Integer.toHexString()
- Show that Wrapper can be null but primitive cannot

SECTION 5: String ↔ Primitive Conversion
- Convert String "12345" to int
- Convert String "99.99" to double
- Convert String "true" to boolean
- Convert int to String using 3 different methods
- Handle invalid conversion with try-catch (e.g., "123abc" to int)

----------------------------------------
EXPECTED OUTPUT FORMAT
----------------------------------------

╔══════════════════════════════════════════════╗
║   DATA TYPES - INTERMEDIATE CONCEPTS         ║
╚══════════════════════════════════════════════╝

┌──────────────────────────────────────────────┐
│  SECTION 1: DATA TYPE RANGES (MIN/MAX)       │
└──────────────────────────────────────────────┘

Data Type    | Size (bits) | Min Value    | Max Value
-------------|-------------|--------------|-------------
byte         | 8           | -128         | 127
... continue for all numeric types ...

┌──────────────────────────────────────────────┐
│  SECTION 2: IMPLICIT CASTING (Widening)      │
└──────────────────────────────────────────────┘
... output ...

----------------------------------------
CONSTRAINTS
----------------------------------------
- Use formatted output (System.out.printf)
- Handle all exceptions properly
- Add visual separators between sections

----------------------------------------
BONUS CHALLENGE
----------------------------------------
- Create a method safeCast(int value, String targetType) 
  that returns the casted value only if safe
- Display memory size in bytes for each primitive type 
*/
package p02_Variable;
public class q02_MediumDataTypes {
	

	public static void main(String[] args) {
		
		// SECTION 1: Data Type Ranges
	    System.out.println("Data Type    | Size (bits) | Min Value                    | Max Value");
        System.out.println("-------------|-------------|------------------------------|----------------------------");
        System.out.printf("byte         | 8           | %-28d | %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short        | 16          | %-28d | %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int          | 32          | %-28d | %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long         | 64          | %-28d | %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float        | 32          | %-28e | %e%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double       | 64          | %-28e | %e%n", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("char         | 16          | %-28d | %d%n", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		
		//SECTION 2: Implicit Casting (Widening)
		byte byteValue = 100;
		short shortValue = byteValue; // byte to short
		int intValue = shortValue; // short to int
		long longValue = intValue; // int to long
		float floatValue = longValue; // long to float
		double doubleValue = floatValue; // float to double

		System.out.println("\nImplicit Casting (Widening):");
		System.out.println("Byte value: " + byteValue);
		System.out.println("Short value: " + shortValue);
		System.out.println("Int value: " + intValue);
		System.out.println("Long value: " + longValue);
		System.out.println("Float value: " + floatValue);
		System.out.println("Double value: " + doubleValue);

		char charValue = 'A';
		int charToInt = charValue; // char to int
		System.out.println("\nChar value: " + charValue + " to Int value: " + charToInt);
		
		// SECTION 3: EXPLICIT CASTING (Narrowing)

        double originalDouble = 9.78;
        int castedInt = (int) originalDouble;
        System.out.println("\ndouble 9.78 → int: " + castedInt + " (decimal truncated!)");

        int bigNumber = 130;
        byte smallByte = (byte) bigNumber;
        System.out.println("int 130 → byte: " + smallByte + " (OVERFLOW! 130 - 256 = -126)");

        long bigLong = 10000000000L;
        int truncatedInt = (int) bigLong;
        System.out.println("long 10000000000 → int: " + truncatedInt + " (DATA LOSS!)");

        System.out.println("\n--- Safe Casting Example ---");
        int safeValue = 100;
        if (safeValue >= Byte.MIN_VALUE && safeValue <= Byte.MAX_VALUE) {
            byte safeByte = (byte) safeValue;
            System.out.println("Safe cast: int " + safeValue + " → byte " + safeByte);
        } else {
            System.out.println("Cannot safely cast " + safeValue + " to byte!");
        }
		
        
        // SECTION 4: Wrapper Classes

        int primitiveInt = 42;
        Integer wrapperInt = 42;  // Auto-boxing (int → Integer)

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Are they equal? " + (primitiveInt == wrapperInt));  // Auto-unboxing

        System.out.println("\n--- Useful Wrapper Methods ---");
        System.out.println("Integer.parseInt(\"123\") = " + Integer.parseInt("123"));
        System.out.println("Double.parseDouble(\"3.14\") = " + Double.parseDouble("3.14"));
        System.out.println("Boolean.parseBoolean(\"true\") = " + Boolean.parseBoolean("true"));
        System.out.println("Integer.toBinaryString(10) = " + Integer.toBinaryString(10));
        System.out.println("Integer.toHexString(255) = " + Integer.toHexString(255));

        Integer nullableNumber = null;
        System.out.println("\nWrapper can be null: " + nullableNumber);
        
        
        // SECTION 5: STRING TO PRIMITIVE CONVERSION
        String strNumber = "12345";
        String strDecimal = "99.99";
        String strBool = "true";

        int parsedInt = Integer.parseInt(strNumber);
        double parsedDouble = Double.parseDouble(strDecimal);
        boolean parsedBool = Boolean.parseBoolean(strBool);

        System.out.println("String \"" + strNumber + "\" → int: " + parsedInt);
        System.out.println("String \"" + strDecimal + "\" → double: " + parsedDouble);
        System.out.println("String \"" + strBool + "\" → boolean: " + parsedBool);

        int num = 500;
        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);
        String str3 = "" + num; 

        System.out.println("\nint " + num + " → String: \"" + str1 + "\"");
        System.out.println("Methods: String.valueOf(), Integer.toString(), \"\" + num");

        System.out.println("\n--- Handling Invalid Conversions ---");
        String invalidNumber = "123abc";
        try {
            int result = Integer.parseInt(invalidNumber);
            System.out.println("Parsed: " + result);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Cannot parse \"" + invalidNumber + "\" to int!");
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }
		
	}

}
