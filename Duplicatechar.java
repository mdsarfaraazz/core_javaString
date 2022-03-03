package string.demo;

public class Duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String st="hhggaattaak";
        char[] ch=st.toCharArray();
        int length = st.length();
        
        for(int i=0;i<st.length();i++) {
        	for(int j=i+1;j<st.length();j++) {
        		if(ch[i]==ch[j]) {
        			 System.out.println("Duplicate elements are..."+ch[j]);
        			 break;
        		}
        	}
        }
	}

}
