package com.example;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = {-1,0};
		int[] result = twoSum(numbers, -1);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(target == numbers[i] + numbers[j]) {
					result[0] = i + 1;
					result[1] = j + 1;
				}
			}
		}
		return result;
    }
	
}
