package com.leetcode.arrays.medium;

public class FindPeakElement {
	public static void main(String args[]){
		int array[] = new int[]{1,2,3};
		findPeakElementUsingBruteForce(array);
		findPeakElementUsingBetterApproach(array);
	}

	private static void findPeakElementUsingBruteForce(int[] array) {
		int peakElement = 0;
		for(int index=1; index<array.length-1; index++){
			if(array[index]>array[index+1] && array[index]>array[index-1]){
				peakElement =  index;
				break;
			}
		}
		System.out.println(peakElement);
	}
	
	private static void findPeakElementUsingBetterApproach(int[] array) {
		System.out.println(findPeakUsingRecurssion(array,0,array.length));
		/*int left = 0, right= array.length-1;
		if(left == right){
			System.out.println(left);
		}else if(right-left == 1){
			if(array[left]>array[right]){
				System.out.println(left);
			}else{
				System.out.println(right);
			}
		}else{
			System.out.println(findPeakUsingRecurssion(array,left,right));
		}*/
		
	}

	private static int findPeakUsingRecurssion(int[] array, int low, int high) {
		
		int mid= low + (high-low)/2,n=array.length;
		if((mid == 0 || array[mid-1]<= array[mid]) && (mid == n-1 || array[mid] >=array[mid+1]))
		{
			return mid;
		}else if(mid>0 && array[mid-1]>array[mid]){
			return findPeakUsingRecurssion(array,low,(mid-1));
		}else{
			return findPeakUsingRecurssion(array,(mid+1),high);
		}
		
		 /*int mid = low + (high - low) / 2, n=arr.length; 
		  
	        if ((mid == 0 || arr[mid - 1] <= arr[mid]) 
	            && (mid == n - 1 || arr[mid + 1] <= arr[mid])) 
	            return mid; 
	  
	        else if (mid > 0 && arr[mid - 1] > arr[mid]) 
	            return findPeakUsingRecurssion(arr, low, (mid - 1)); 
	  
	        else
	            return findPeakUsingRecurssion( 
	                arr, (mid + 1), high);
	}*/
	}
}



