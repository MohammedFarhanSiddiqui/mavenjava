package com.alice;
public class Rev {
	public String revv(String s) {
		
		char[] maxx=s.toCharArray();
		int l=0;
		int r=maxx.length-1;
		while(l<=r) {
		char temp=maxx[l];
		maxx[l]=maxx[r];
		maxx[r]=temp;
		l++;
		r--;
		
		
		
		

}
		return new String(maxx);
	}
public static void main(String[] args) {
	
}
}
