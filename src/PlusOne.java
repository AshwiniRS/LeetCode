
public class PlusOne {

	 public static int[] plusOne(int[] digits) {
		 int n = digits.length;
		 for(int i=n-1;i>=0;i--){
			 if(digits[i]<9){
				 digits[i]++;
				 return digits;
			 }
			 digits[i]=0;
		 }
		 
		 int[] newNo = new int[n+1];
		 newNo[0]=1;
		 return newNo;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9};
		int[] sol = plusOne(digits);
		for(int k=0;k<sol.length;k++){
			System.out.print(sol[k]+" ");
		}
			
		
	}

}
