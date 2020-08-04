package com.leetcode.topInterviewQuestions;
import java.util.Collections;
/*
 * Leetcode-692
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {

	public static void main(String[] args) {
		int nums[] = new int[]{1,1};
		String value[] = new String[]{"i", "love", "leetcode", "i", "love", "coding","coding"};
		int k=2;
		topKFrequent(value,k);
		}

	private static List<String> topKFrequent(String[] text, int k) {
		int maxFrequency = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String num:text){
			if(map.get(num) != null){
				map.put(num, map.get(num)+1);
			}else{
				map.put(num, 1);
			}
			maxFrequency = Math.max(maxFrequency, map.get(num));
		}
		 List<String>[] frequencyBucket = new List[maxFrequency+1];
		 for(String key:map.keySet()){
			 int value = map.get(key);
				if(frequencyBucket[value] == null){
					frequencyBucket[value] = new LinkedList<String>();
				}
				frequencyBucket[value].add(key);
		 }
		List<String> list = new LinkedList<>();
		for(int index = frequencyBucket.length-1; index>=0; index--){
			if(frequencyBucket[index]!=null && k>0){
				List<String> subList = frequencyBucket[index];
				if(subList.size()>1){
					Collections.sort(subList);
				}
				for(int listIndex=0; listIndex<subList.size() && k>0; listIndex++){
					list.add(subList.get(listIndex));
					k--;
				}
			}
		}
		return list;
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