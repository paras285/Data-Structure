package com.leetcode.topInterviewQuestions;
/*
 * Leetcode-347
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int nums[] = new int[]{1,1};
		int k=1;
		topKFrequent(nums,k);
		}

	private static int[] topKFrequent(int[] nums, int k) {
		int maxFrequency = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num:nums){
			if(map.get(num) != null){
				map.put(num, map.get(num)+1);
			}else{
				map.put(num, 1);
			}
			maxFrequency = Math.max(maxFrequency, map.get(num));
		}
		 List<Integer>[] frequencyBucket = new List[maxFrequency+1];
		 for(int key:map.keySet()){
			 int value = map.get(key);
				if(frequencyBucket[value] == null){
					frequencyBucket[value] = new LinkedList<Integer>();
				}
				frequencyBucket[value].add(key);
		 }
		List<Integer> list = new LinkedList<>();
		for(int index = frequencyBucket.length-1; index>=0; index--){
			if(frequencyBucket[index]!=null && k>0){
				List<Integer> subList = frequencyBucket[index];
				Iterator<Integer> iterator = subList.iterator();
				while(iterator.hasNext() && k>0){
					list.add(iterator.next());
					k--;
				}
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
/*public class MostFrequentElements {
	 
	   public static List<Integer> kMostFrequent(int[] nums, int k) {
	 
	      //Map which stores number and it's occurrence count
	      Map<Integer, Integer> countMap = new HashMap<>();
	 
	      //Variable which stores maximum frequency of any number
	      int maxFreq = 0;
	 
	      //Traverse an array
	      for(int i = 0; i < nums.length; i++) {
	       
	         //Get the occurrence of current element and add 1
	        int freq = countMap.getOrDefault(nums[i],0)+1;         
	 
	        //put the elem and it's freq in a map 
	        countMap.put(nums[i], freq);  
	          
	        //keep track of maximum occurrence
	        maxFreq = Math.max(maxFreq, freq);            
	      }
	 
	      //Declare a multi-storage bucket
	      List<Integer>[] bucket = new List[maxFreq + 1];
	 
	      for(int n : countMap.keySet()) {
	        int freq = countMap.get(n);
	 
	        if(bucket[freq]==null)
	          bucket[freq] = new ArrayList<>();
	 
	        bucket[freq].add(n);
	      }
	 
	      List<Integer> res = new ArrayList<>();
	 
	      //Pick top k elements
	      for(int i = bucket.length-1; i >= 0 && k>0; i--) { 
	          if(bucket[i]!=null){
	             List<Integer> list = bucket[i]; 
	             res.addAll(list);
	             k-= list.size();
	           }
	       }
	    
	      return res;
	  }
	 
	  public static void main(String[] args) {
	       int[] arr = {1, 1, 1, 2, 2, 3, 3, 3};
	       List<Integer> result = kMostFrequent(arr, 2);
	 
	       for(Integer elem : result) {
	         System.out.print(elem + " ");
	       }
	  }
	}*/