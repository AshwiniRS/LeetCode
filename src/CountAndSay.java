
public class CountAndSay {
	public static String countAndSay(int n) {
		int i=1;
		int count=1;
		StringBuilder current= new StringBuilder("1");
		StringBuilder seq;
		while(i<n){
			seq=current;
			current=new StringBuilder();
			count=1;
			char say=seq.charAt(0);
			for(int k=1;k<seq.length();k++){
				if(seq.charAt(k)!=say){
					current.append(count).append(say);
					count=1;
					say=seq.charAt(k);
				}else count++;
			}current.append(count).append(say);
			i++;
		}
		return current.toString();
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println(countAndSay(n));

	}

}
