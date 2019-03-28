package UnicodeCalculator;

// import scanner/array/list
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AbsoluteValDifference {
	
	public static void main(String[] args) {
		
		//setup scanner and declare variables
		Scanner scan = new Scanner (System.in);
		List <Integer> valuesWord1 = new ArrayList<Integer>();
		List <Integer> valuesWord2 = new ArrayList<Integer>();
		String word1, word2;
		int sumWord1, sumWord2;
		int difference;
		
		// first input
		System.out.println("What is your first word?");
		word1 = scan.nextLine();
		
		//second input
		System.out.println("What is your second word?");
		word2 = scan.nextLine();
		scan.close();
		
		//convert first word to unicode for each letter using loop
		{
		int i =0;	// declared here so i can be used again next loop
			while (i < word1.length()) {	// parameters to prevent infinite loop
				char c = word1.charAt(i);	// read letter at index()
				int letterVal = c;		// stores as int
				valuesWord1.add(letterVal);		// adds to array
				++i;								// next letter index
			}
			System.out.println(valuesWord1);	// prints array
		}
		
		// add all values in first word
		sumWord1 = 0;
		for (int numIndex = 0; numIndex < valuesWord1.size(); ++numIndex) {	//index 0, parameters are less than list size, index +1
			sumWord1 += valuesWord1.get(numIndex);
		}
		System.out.println(sumWord1);
		
		//convert second word to unicode using loop
		{
		int i = 0;
			while (i < word2.length()) {
				char c = word2.charAt(i);
				int letterVal = c;
				valuesWord2.add(letterVal);
				++i;
			}
			System.out.println(valuesWord2);
		} 
		
		// add all values in second word
		sumWord2 = 0;
		for (int numIndex = 0; numIndex < word2.length(); ++numIndex) {
			sumWord2 += valuesWord2.get(numIndex);
		}
		System.out.println(sumWord2);
		
		// difference between strings and print
		difference = java.lang.Math.abs(sumWord1 - sumWord2);
		System.out.println("Difference (as absolute value): " + difference);
		
	}
}
