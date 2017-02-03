import java.util.HashMap;

public class RomanToInteger {
	public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int past=0;
        int sum=0;
        char[] sArr = s.toCharArray();
        for(int i=sArr.length-1;i>=0;i--){
         //   int val1 = map.get(past);
            int val2 = map.get(sArr[i]);
            if(past <= val2) sum+=val2;
            else sum-=val2;
            past=map.get(sArr[i]);
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "DCXXI";
		System.out.println(romanToInt(s));
	}

}
