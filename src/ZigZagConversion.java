

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        char[] sArray = s.toCharArray();
        String[] result = new String[numRows+1];
        for(int i=0;i<result.length;i++)
        	result[i]="";
        
        int k=0;
        int j=0;
        
        for(j=0;j<sArray.length;){
        	while(k!=numRows && j<sArray.length){
        		if(k<0) k=0;
        		System.out.println(k);
        		result[k]+=Character.toString(sArray[j]);
        		k++;
        		j++;
        
        	}k=k-2;
        	while(k>0 && j<sArray.length){
        		System.out.println(k);
        		result[k]+=Character.toString(sArray[j]);
        		k--;
        		j++;
        		
        	}
        }
        
        return convertArrayToString(result);
   }
	    
	    //array to String implementation
	    public static String convertArrayToString(String[] sArr) {
	        StringBuilder sb = new StringBuilder();
	        for(String obj : sArr) sb.append(obj.toString());
	        return sb.toString();
	    }
    
    public static void main(String[] args){
    	String str = "AB";
    	String result = convert(str,1);
    	System.out.println(result);
    }
    
    /*
     * 
     * P   A   H   N
	   A P L S I I G
       Y   I   R
     */
    //"PAHNAPLSIIGYIR
}