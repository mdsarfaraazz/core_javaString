package string.demo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String st= "sarfaraaz";
         String st1=" ";
         
        // int l = st.length();
         
         for(int i=st.length()-1;i>=0;i--) {
        	 st1=st1+st.charAt(i);
         }
         System.out.println(st1);
	}

}
