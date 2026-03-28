/**
* Author: Shreyas Bhagat
* Date: 7 Dec 2025
* Description: 
*/
package Practise;
public class P02_staticNStatic {
	int intr=1;
	String str="Hello world!";
	char chr='A';
	
	static int a;
	static String strr;
	static char ch;
	static float fl;
	static double df;
	public static void main(String[] args) {
		
		P02_staticNStatic sns= new P02_staticNStatic();
		
		System.out.println(sns.intr);
		System.out.println(sns.str);
		System.out.println(sns.chr);
		System.out.println(a);
		System.out.println(strr);
		System.out.println(ch);
		System.out.println(fl);
		System.out.println(df);
		
	}

}
