
public class AddBinary {

	public static String secondMethod(String a, String b){
		StringBuilder solution = new StringBuilder("");
		int len = a.length()>b.length()?a.length()-1:b.length()-1;
		char carry='0';
		while(len>=0){
			if(a.charAt(len)=='1' && b.charAt(len)=='1'){
				solution.append("0");
				carry='1';
			}
		}
		return solution.toString();
	}
	
	public static int converttoNum(String a){
		int sum=0;
		int pow=0;
		int len=a.toCharArray().length-1;
		while(len>=0){
			if(a.charAt(len)=='1') sum+=Math.pow(2,pow );
			len--;
			pow++;
		}
		return sum;
	}
	public static String addBinary(String a, String b) {
        StringBuilder solution=new StringBuilder("");
        int aNum = converttoNum(a);
        int bNum = converttoNum(b);
        int sum = aNum + bNum;
        if(sum==0) return solution.append("0").toString();
        while(sum!=0){
        	int r = sum%2;
        	sum=sum/2;
        	solution.append(r);
 
        }
        //System.out.println(solution.reverse().toString());
		return solution.reverse().toString();
    }
	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}

}
