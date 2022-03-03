package string.demo;

import java.util.StringTokenizer;

public class SpliteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int a=0;
		String s1= "I'm for karnataka";
		String[] words = s1.split("\s");
		for(String w:words) {
			System.out.println(w);
		}
		//System.out.println(s1);
		 
		/*if((s1 == null)|| s1.isEmpty()){
			return a;
		}*/
		StringTokenizer tokens = new StringTokenizer(s1);
		return;
	}
      
}
