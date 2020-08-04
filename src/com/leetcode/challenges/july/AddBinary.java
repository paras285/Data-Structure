package com.leetcode.challenges.july;
//https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3395/
public class AddBinary {

	public static void main(String[] args) {
		String a = "11";
		String b = "0";
		new AddBinary().addBinary(a,b);
	}

	private void addBinary(String a, String b) {
		int aIndex = a.length()-1,bIndex = b.length()-1;
		int carry = 0;
		StringBuffer result = new StringBuffer();
		for(;aIndex>=0 && bIndex>=0; aIndex--,bIndex--){
//			int aValue = (int) a.charAt(aIndex);
			int aValue = Character.getNumericValue(a.charAt(aIndex));
			int bValue = Character.getNumericValue(b.charAt(bIndex));
			if(aValue == bValue){
				if(aValue == 0 && carry == 1){
					result.append(1);
					carry = 0;
				}else if(aValue == 0){
					result.append(0);
				}else if(aValue == 1 && carry == 1){
					result.append(1);
					carry = 1;
				}else{
					result.append(0);
					carry = 1;
				}
			}else if(aValue == 0 && bValue == 1){
				if(carry == 1){
					result.append(0);
					carry = 0;
				}else{
					result.append(1);
				}
			}else{
				if(carry == 1){
					result.append(0);
					carry = 0;
				}else{
					result.append(1);
				}
			}
		}
		while((aIndex ==0 && bIndex!=0) 
				|| (aIndex !=0 && bIndex==0)){
			if(aIndex>=0){
//				int aValue = (int)a.charAt(aIndex);
				int aValue = Character.getNumericValue(a.charAt(aIndex));
				if(aValue == 0 && carry == 1){
					result.append(1);
					carry =0;
				}else{
					result.append(0);
				}
				aIndex--;
			}else{
				int bValue = Character.getNumericValue(b.charAt(bIndex));
//				int bValue = b.charAt(bIndex);
				if(bValue == 0){
					result.append(1);
					carry =0;
				}else{
					result.append(0);
				}
				bIndex--;
			}
		}
		if(carry == 1){
			result.append(1);
		}
		System.out.println(result.reverse().toString());
	}

}
