package string.demo;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	    String str1="abcds";
	    String str2="dcba";
	    
	    if(str1.length()!=str2.length()) {
	    	System.out.println("length of the string is differnt so its not a anagrom");
	    }
	    
	    else {
	    	char[] ch1=str1.toCharArray();
	    	char[] ch2=str2.toCharArray();
	    	
	    	Arrays.sort(ch1);
	    	Arrays.sort(ch2);
	    	
	    	if(Arrays.equals(ch1,ch2)) {
	    		System.out.println("Both string are anagram");
	    	}
	    	else {
	    		System.out.println("Both string are not anagram");
	    	}
	    }
	}

}
