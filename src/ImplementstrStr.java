
public class ImplementstrStr {
	 public static int strStr(String haystack, String needle) {
	        int j=0;int k=0;
	        if(haystack.equals("") && needle.equals("")) return 0;
	        else if(haystack.equals("")) return -1;
	        else if(needle.equals("")) return 0;
	        if(haystack.length()<needle.length()) return -1;
	        char[] haystackArr = haystack.toCharArray();
	        char[] needleArr = needle.toCharArray();
	        for(int i=0;i<haystackArr.length && j<needleArr.length ;i++){
	        	j=0;
	            if(j<needleArr.length){
	                k=i;
	                while(j<needleArr.length && i<haystackArr.length){
	                	if(haystackArr[i]==needleArr[j]){
	                		i++;j++;
	                	}
	                	else
	                		break;
	                }
	                if(j==needleArr.length) return k;
	                i=k;
	            }
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issipi";
		System.out.println(strStr(haystack, needle));
	}

}
