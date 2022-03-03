package string.demo;

public class MinMaxStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String st= "bsjwhefyweg";
        char[] chararray = new char[st.length()];
        chararray=st.toCharArray();
        int [] freq=new int[st.length()];
        
        int Min,Max=0;
        char minchar = 0,maxchar = 0;
        
       for (int i = 0;i<st.length();i++) {
    	   
    	   freq[i]=1;
    	   for(int j=i+1;j<st.length();j++) {
    		   if(chararray[i]==chararray[j] && chararray[i]!=' ' && chararray[i]!=0) {
    			   freq[i]++;
    			   chararray[j]='0';
    		   }
    	   }
       }
       Min=Max=freq[0];
       
       for(int i=0;i<freq.length;i++) {
    	   if(Min>freq[i] && freq[i]!='0') {
    		   Min=freq[i];
    		   minchar = chararray[i];
    	   }
    	   if(Max<freq[i] ) {
    		   Max=freq[i];
    		   maxchar = chararray[i];
    	   }
       }
       System.out.println("min char..."+minchar);
       System.out.println("min char..."+maxchar);
	}

}
