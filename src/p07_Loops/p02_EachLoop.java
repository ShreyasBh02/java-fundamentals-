/**
 * Author: Shreyas Bhagat
 * Date: 14 Mar 2026
 * Description: Demonstrates the use of enhanced for-loops
 *              with integers, strings, and custom objects.
 */

package p07_Loops;

import java.util.Arrays;
import java.util.List;

public class p02_EachLoop {

	public static void main(String[] args) {

        // Example 1: Iterating over a list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Numbers:");
        for (Integer x : numbers) {
            System.out.print(x + ", ");
        }
        System.out.println("\n"); 

        // Example 2: Iterating over a list of strings
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");
        System.out.println("Names:");
        for (String name : names) {
            System.out.print(name + ", ");
        }

	}

}
