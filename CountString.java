package string.demo;


import java.util.Scanner;
 


public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter the string");
		        String str=sc.nextLine();
		        int count=0;
		        String[] word=str.split(" ");
		        for(String w:word) {
		            System.out.println( w );
		            count++;
		        }
		        System.out.println("count of the word" + count);
		        sc.close();
		 
		    }
		 
		
	}


