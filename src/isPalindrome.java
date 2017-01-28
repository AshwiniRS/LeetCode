/*
 *    bool isPalindrome(int x) {
        if(x<0|| (x!=0 &&x%10==0)) return false;
        int sum=0;
        while(x>sum)
        {
            sum = sum*10+x%10;
            x = x/10;
        }
        return (x==sum)||(x==sum/10);
    }
 * 
 * 
 */
public class isPalindrome {

	public static boolean is_palindrome(int x){
		int digits=0;
		int temp=x;
		while(temp!=0){
			digits++;
			temp=temp/10;
		}

		int i=1;
		//digits=digits-1;
		if(x>0 && digits==0) return true;
		if(x<0) return false;
		
		int fx=x;
		int bx=x;
		while(i<=digits/2){
			
			if(Math.floor(fx/(Math.pow(10,digits-i))) != Math.floor(bx%(Math.pow(10,1)))) return false;
			
			fx=(int) (fx%(Math.pow(10,digits-i)));
			System.out.println(fx);
			bx=bx/10;
			System.out.println(bx);
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		int x=2000121002;
		boolean result = is_palindrome(x);
		System.out.println(result);
	}

}
