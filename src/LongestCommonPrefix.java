/***
 * public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    for (int i = 1; i < strs.length; i++) 
        while (strs[i].indexOf(strs[0]) != 0) 
            strs[0] = strs[0].substring(0, strs[0].length() - 1);
    return strs[0];
}
 * 
 * 
 * 
 * 
 * 
 * @author ashwini
 *
 */
public class LongestCommonPrefix {
	
	public static String lcp(String[] str){
		String result="";
		if(str.length==0) return result;
		String small=str[0];
		String large=str[1];
		//first find in first two strings
		if(str[0].length() < str[1].length()){
			small = str[0];
			large = str[1];
		}else{
			small = str[1];
			large = str[0];
		}
		int index=0;
		for(char c : small.toCharArray()){
			if(c!=large.charAt(index)) break;
			else{
				result+=Character.toString(c);
				index++;
			}
		}
		System.out.println(result);
		boolean found = false;
		for(int i=2;i<str.length;i++){
			found=false;
			if(!str[i].equals("")){
				if(result.length()<=str[i].length() && result.equals(str[i].substring(0, result.length()))) {
					found=true;
					continue;
				}
				else{
					int k=1;
					while(k<result.length() && result.length()<=str[i].length()){
						result=result.substring(0, result.length()-1);
						if(result.equals(str[i].substring(0, result.length()))){
							found=true;
							break;
						}
						else k++;
					}
				}
				
				if(result.length()>str[i].length()){
					result=result.substring(0,str[i].length());
					if(result.equals(str[i])){
						found=true;
					}else{
						String temp=str[i];
						while(result.length()>0){
							
							result=result.substring(0,result.length()-1);
							temp=temp.substring(0, temp.length()-1);
							if(result.equals(temp)){
								found=true;
								break;
							}
						}
					}
				}
			}
		}
		if(!found && str.length>2) return "";
		return result;
	}
	public static void main(String[] args){
		String[] str = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aab","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
		String result = lcp(str);
		System.out.println(result);
	}
}
