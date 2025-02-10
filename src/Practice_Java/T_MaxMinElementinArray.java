package Practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T_MaxMinElementinArray {

	public static void main(String[] args) {
		int[] numbers = {36,-99,-7,0,55,89,32,15,56,99};

		int max = numbers[0]; //This line initializes an integer variable max with the value of the first element (index 0) in the numbers array. It assumes the first element is the maximum element until it checks all elements in the array.
		int min = numbers[0]; //This line initializes an integer variable min with the value of the first element (index 0) in the numbers array. It assumes the first element is the minimum element until it checks all elements in the array.

		for (int i = 1; i < numbers.length; i++) //This loop starts from index 1 (the second element) of the numbers array and iterates through the array up to its last element.
		{
			if (numbers[i] > max) //This line compares the current element at index i of the numbers array with the current maximum value stored in the max variable. If the current element is greater than the current maximum, it means we have found a new maximum, so it updates the max variable to the current element's value.
			{
				max = numbers[i];
			}
			if (numbers[i] < min) //This line compares the current element at index i of the numbers array with the current minimum value stored in the min variable. If the current element is smaller than the current minimum, it means we have found a new minimum, so it updates the min variable to the current element's value.
			{
				min = numbers[i];
			}
		}

		System.out.println("Maximum element: " + max);
		System.out.println("Minimum element: " + min);
	}


}


