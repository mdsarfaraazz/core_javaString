package string.demo;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the String");
          String st=sc.nextLine();
          int count = 0;
          
          st=st.toLowerCase();
          
          String Words[]=st.split(" ");
          System.out.println("the duplicate words are in the string are....");
          
          for(int i = 0; i<Words.length ; i++) {
        	  for( int j = i+1 ; j<Words.length; j++) {
        		  
        		  if(Words[i].contentEquals(Words[j])) {
        			 count++;
        			 Words[j]="0";
        			 
        		
        		  }
        		  
        	  }
        	  if(count>1 && Words[i]!="0") {
        		  System.out.println(Words[i]+" , ");
        	  }
          }
	}

}
