/*Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 * 
 * 
 */

import java.util.Scanner;

public class NumberComplement {

	 public static int findComplement(int num) {
	        double i=0;int k=0;
	        StringBuilder comp = new StringBuilder("");
	        while(num!=0){
	            int two =(int)( Math.pow(2,i));
	            int j=(num%2==1) ? 0  : 1;
	            k=k+two*j;
	            num=num/2;i++;
	              //      
	        }
	        comp.append(k) ;
	        //System.out.println(comp);
	        
	        return Integer.parseInt(comp.toString());
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stubcan
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findComplement(5));
	}

}
