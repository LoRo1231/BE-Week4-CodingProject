package coding.project;

import java.util.Arrays;

public class CodingProjectWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

		i. Make sure that there are 9 elements of type int in this new array.  

		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console. */
		
		System.out.println(" ");
		System.out.println("---------- Question 1 ----------");
		System.out.println(" ");
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(Arrays.toString(ages));
		
		System.out.println(" ");
		System.out.println("---------- Question 1  : A ----------");
		System.out.println(" ");
		
		int subtractVal = ages[ages.length -1] - ages[0];
		System.out.println(subtractVal);
		
		System.out.println(" ");
		System.out.println("---------- Question 1  : B ----------");
		System.out.println(" ");
		
		int [] ages2 = {22, 12, 6, 90, 7, 32, 13, 5, 72};
		
		System.out.println("The length of the array is: " + ages2.length);
		
		int subtractVal2 = ages2[ages2.length -1] - ages2[0];
		System.out.println(subtractVal2);
		
		System.out.println(" ");
		System.out.println("---------- Question 1  : C ----------");
		System.out.println(" ");
		
		int sum = 0; //initialize a beginning sum of 0
		for (int number : ages2) { //for each number in the ages2 array
			sum += number; //add that number to the sum
		}
		int average = sum / ages2.length; //divide the sum by the length of the array & store in a variable
		System.out.println(average);
		
		
		/* 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console. */
		
		System.out.println(" ");
		System.out.println("---------- Question 2 ----------");
		System.out.println(" ");
		
		String [] names = new String[6];
		
		names[0]= "Sam";
		names[1]= "Tommy";
		names[2]= "Tim";
		names[3]= "Sally";
		names[4]= "Buck";
		names[5]= "Bob";
		
		System.out.println(Arrays.toString(names));
		
		System.out.println(" ");
		System.out.println("---------- Question 2 : A ----------");
		System.out.println(" ");
		
		int stringSum = 0; //initialize a beginning sum of 0
		
		for (String name : names) { //for each name in the name array
			stringSum += name.length(); //find the length of the name and add it to the sum
		}
		int stringAv = stringSum / names.length; //take the sum and divide it by the entire length of the array
		System.out.println(stringAv);
		
		System.out.println(" ");
		System.out.println("---------- Question 2 : B ----------");
		System.out.println(" ");
		
		String concatString = ""; //start with empty string
		for (String name : names) { //for each name in the names array
			concatString += name + " "; //add the name to our variable concatString
		}
		System.out.println(concatString);
		
		// 3. How do you access the last element of any array?
		
		System.out.println(" ");
		System.out.println("---------- Question 3 ----------");
		System.out.println(" ");
		
		// find the length of the array - 1 since java is 0 based.
		
		System.out.println(names[names.length - 1]);
		
		//4. How do you access the first element of any array?
		
		System.out.println(" ");
		System.out.println("---------- Question 4 ----------");
		System.out.println(" ");
		
		// it will be in position 0 since java is 0 based.
		
		System.out.println(names[0]);
		
		 /* 5. Create a new array of int called nameLengths. Write a loop to iterate over 
		  * the previously created names array and add the length of each name to the nameLengths array. */
		
		System.out.println(" ");
		System.out.println("---------- Question 5 ----------");
		System.out.println(" ");
		
		int [] nameLengths = new int [names.length]; //since it will need to store the same number of elements as the previous array
													//getting names.length will programmatically keep up with what length it should be if that array were to change.
		for(int i = 0; i < nameLengths.length; i++) { //Iterate over the new array
			nameLengths[i] += names[i].length(); //for each position, add the length of the element in the previous array to the new one
		}
		System.out.println(Arrays.toString(nameLengths));
		
		/* 6. Write a loop to iterate over the nameLengths array and calculate the sum of all 
		 * the elements in the array. Print the result to the console. */
		
		System.out.println(" ");
		System.out.println("---------- Question 6 ----------");
		System.out.println(" ");
		
		int lengthSum = 0;
		
		for(int num : nameLengths) {
			lengthSum += num;
		}
		System.out.println(lengthSum);
		
		/* 7. Write a method that takes a String, word, and an int, n, as arguments and returns 
		 * the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
		 * I expect the method to return “HelloHelloHello”). */
		
		System.out.println(" ");
		System.out.println("---------- Question 7 ----------");
		System.out.println(" ");
		
		System.out.println(repeatWord("Hello", 3)); //top-dwon dev. chose method & arguments to pass in then wrote method below.
		
		/* 8. Write a method that takes two Strings, firstName and lastName, and returns 
		 * a full name (the full name should be the first and the last name as a String separated 
		 * by a space). */
		
		System.out.println(" ");
		System.out.println("---------- Question 8 ----------");
		System.out.println(" ");
		
		System.out.println(fullName("Logan", "Robertson"));
		
		/* 9. Write a method that takes an array of int and returns true if the sum of all the 
		 * ints in the array is greater than 100. */
		
		System.out.println(" ");
		System.out.println("---------- Question 9 ----------");
		System.out.println(" ");
		
		System.out.println(greaterThan100(nameLengths));
		
		
		/* 10. Write a method that takes an array of double and returns the average of all the elements in the array. */
		
		System.out.println(" ");
		System.out.println("---------- Question 10 ----------");
		System.out.println(" ");
		
		double [] doubleArray = {12.31, 65.89, 15.77, 90.88};
		
		System.out.println(arrayAverage(doubleArray));
		
		/* 11. Write a method that takes two arrays of double and returns true if the average 
		 * of the elements in the first array is greater than the average of the elements in the second array. */
		
		System.out.println(" ");
		System.out.println("---------- Question 11 ----------");
		System.out.println(" ");

		double [] doubleArray2 = {34.21, 22.14, 84.31, 11.34};
		
		System.out.println(arrayAvCompare(doubleArray, doubleArray2));
		
		/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
		 * and a double moneyInPocket, and returns true if it is hot outside and if 
		 * moneyInPocket is greater than 10.50. */
		
		System.out.println(" ");
		System.out.println("---------- Question 12 ----------");
		System.out.println(" ");
		
		boolean isHotOutside = true;
		double moneyInPocket = 20.00;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		/* 13. Create a method of your own that solves a problem. 
		 * In comments, write what the method does and why you created it. */
		
		System.out.println(" ");
		System.out.println("---------- Question 13 ----------");
		System.out.println(" ");

		//Method for should I water the plants? If it is hot outside & cloudy or if it is night time,
		//then return a string "Hurry! get the water!". Otherwise return "Nah, they're fine."
		
		boolean isCloudy = true;
		boolean isDaylight = true;
		
		System.out.println(shouldWaterPlants(isHotOutside, isCloudy, isDaylight));
		
	}
	
	// METHOD FOR #7
	
	public static String repeatWord(String word, int n) { //takes word and n as params.
		
		String sb = ""; //Declare an empty string
		
		for (int i = 1; i < n; i++) { //iterate for the number of times of n
			sb += word; //add the word each time
		}
		return sb;
	}
	
	// METHOD FOR #8
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	// METHOD FOR #9
	
	public static boolean greaterThan100(int [] array) {
		int sum = 0;
		for(int num : array) { //first find the sum of the int array passed in
			sum += num;
		}
		if(sum > 100) { // if that sum is greater than 100 then return true or false
			return true;
		} else {
			return false;
		}
	}
	
	// METHOD FOR #10
	
	public static double arrayAverage (double [] array) {
		double sum = 0;
		for(double num : array) {
			sum += num;
		}
		double average = sum / array.length;
		return average;
	}
	
	// METHOD FOR #11
	
	public static boolean arrayAvCompare(double [] array, double [] array2) {
		
		double arraySum1 = 0;
		
		for(double num : array) {
			arraySum1 += num; //find sum of 1st array
		}
		
		double arraySum2 = 0;
		
		for(double num : array2) {
			arraySum2 += num; // find sum of 2nd array
		}
		
		if(arraySum1 / array.length > arraySum2 / array2.length) {
			return true;
		} else {
			return false; //conditional, if the first sum is larger, return true. Otherwise false
		}
		
	}
	
	// METHOD FOR #12
	
	public static boolean willBuyDrink(boolean temp, double money) {
		if(temp && money > 10.50) { //if the temp is true & money is greater than 10.50
			return true;
		} else {
			return false;
		}
	}
	
	// METHOD FOR #13
	
	public static String shouldWaterPlants(boolean temp, boolean cloudy, boolean daytime) {
		if(temp && cloudy || !daytime) {
			return "Hurry! get the water!";
		} else {
			return "Nah, they're fine";
		}
	}
	
	

}
