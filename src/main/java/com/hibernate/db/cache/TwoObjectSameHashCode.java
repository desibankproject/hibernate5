package com.hibernate.db.cache;

public class TwoObjectSameHashCode {
	
	public static void main(String[] args) {
		String str1=new String("jack");
		String str2=new String("jack");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Long xx=3254239L;
		System.out.println(xx.hashCode());
		if(str1.equals(xx))  {		//   if (anObject instanceof String) {
		
		}
		
		
	}

}
