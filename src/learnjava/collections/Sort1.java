package learnjava.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
//Create and display a list containing the suits array elements

List<String> list = Arrays.asList(suits);
 System.out.printf("Unsorted array elements: %s%n", list);
 
 Collections.sort(list);// sort Arraylist
 System.out.printf("Sorted array elements: %s%n", list);
 
 
	}

}
