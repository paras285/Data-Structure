package com.leetcode.arrays;

public class CompareVersion {
	public static void main(String[] args) {
		String version1= "2.10.0";
		String version2 = "2.1";
		int value = compareVersions(version1,version2);
		System.out.println(value);
		}

	private static int compareVersions(String version1, String version2) {
		/*String version1Array[] = version1.split("\\.");
		String version2Array[] = version2.split("\\.");
		int comparedValue = version1.compareTo(version2);
		System.out.println((comparedValue==0)?0:
			(comparedValue<0)?-1:1);
		if(version1Array[0].compareTo(version2Array[0]) < 0){
			System.out.println(version1Array[0]);
		}else{
			System.out.println(version2Array[0]);
		}
*/	
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int n = Math.max(v1.length,v2.length);
		for(int i=0; i<n; i++){
		int k = i<v1.length ? Integer.parseInt(v1[i]) : 0;
		int j = i<v2.length ? Integer.parseInt(v2[i]) : 0;
		if(k > j) return 1;
		else if(k < j) return -1;
		else continue;
		}
		return 0;	
	}
}
