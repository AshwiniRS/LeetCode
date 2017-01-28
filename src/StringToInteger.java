
public class StringToInteger {
	  public static int myAtoi(String str) {
	        long result=0;
	        boolean neg=false;
	        boolean signFound=false;
	        str=str.trim();
	        char[] strArr = str.toCharArray();
	        for(int i=0;i<strArr.length;i++){
	        	if((int)strArr[i] == 45 && !signFound){
	        		neg=true;
	        		signFound=true;
	        		continue;
	        	}else if((int)strArr[i] == 43 && !signFound){
	        		signFound=true;
	        		continue;
	        	}
	        	else if((int)strArr[i]<48 || (int)strArr[i]>57) break;
	        	else { 
	        		result=result*10+Math.abs(((int)(strArr[i])-(int)('0'))); 
	        		if(result>=Integer.MAX_VALUE && !neg) return Integer.MAX_VALUE;
	        	}
	        }
	        if(neg) {
	        	    result = result*(-1);
	        		if(result<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
	        		else if(result>=Integer.MAX_VALUE) return Integer.MIN_VALUE;
	        	}
	        return (int)result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int r=myAtoi("-9223372036854775809");
			System.out.println("r" +r);
	}

}
