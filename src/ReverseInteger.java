
public class ReverseInteger {

	public static int reverse(int x){
		long revNum=0;
		int r=0;
		int temp = Math.abs(x);
		if(x>=Integer.MAX_VALUE || x<=Integer.MIN_VALUE) return 0;
		while(temp!=0){
			revNum = revNum * 10;
			revNum = revNum + temp%10;
	        temp = temp/10;
	        System.out.println(revNum);
		}
		if(revNum>=Integer.MAX_VALUE || revNum<=Integer.MIN_VALUE) return 0;
		if(x<0) revNum=revNum*(-1);
		return (int)revNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1534236469;
		int rev = reverse(x);
		System.out.println(rev);
	}

}
