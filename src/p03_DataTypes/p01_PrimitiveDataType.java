/**
* Author: Shreyas Bhagat
* Date: 21 Jan 2026
* Description: This program demonstrates the size (in bits and bytes) of Java primitive types.
* It also shows how 1 bit converts to bytes (1 bit = 0.125 byte).
*/
package p03_DataTypes;
public class p01_PrimitiveDataType {
	
	public static void main(String[] args) {
        System.out.println("byte    : " + Byte.SIZE + " bits  = " + (Byte.SIZE / 8) + " bytes");
        System.out.println("char    : " + Character.SIZE + " bits = " + (Character.SIZE / 8) + " bytes");
        System.out.println("short   : " + Short.SIZE + " bits = " + (Short.SIZE / 8) + " bytes");
        System.out.println("int     : " + Integer.SIZE + " bits = " + (Integer.SIZE / 8) + " bytes");
        System.out.println("long    : " + Long.SIZE + " bits = " + (Long.SIZE / 8) + " bytes");
        System.out.println("float   : " + Float.SIZE + " bits = " + (Float.SIZE / 8) + " bytes");
        System.out.println("double  : " + Double.SIZE + " bits = " + (Double.SIZE / 8) + " bytes");

        // Boolean is special: JVM does not define exact size
        System.out.println("boolean : Conceptually 1 bit (true/false), but stored as 1 byte internally");
		
	}

}
