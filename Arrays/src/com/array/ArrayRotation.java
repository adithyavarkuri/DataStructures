package com.array;

//O(n)
public class ArrayRotation {
	
	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7};
		rotate(arr, 6);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}
	
	public static void rotate(int[] array , int noOfRotations) {
		
		int[] temp =  new int[noOfRotations];
		
		int rotationCount =0;
		
		for(int i=0;i<array.length;i++) {
			if(i<noOfRotations) {
				temp[i] = array[i];
				if(i>=(array.length-noOfRotations)) {
					array[i] = temp[rotationCount];
					rotationCount++;
				}
			}else  {
				array[i-noOfRotations] = array[i];
				if(i>=(array.length-noOfRotations)) {
					array[i] = temp[rotationCount];
					rotationCount++;
				}
			}
		}
		
		
		
		
		
		
		
	}

}
