package String;

public class permutation {
	static  String swap(String str,int i,int j) {
		StringBuilder sb = new StringBuilder(str); 
        sb.setCharAt(i, str.charAt(j)); 
        sb.setCharAt(j, str.charAt(i)); 
        
        return sb.toString(); 
	}
	
	static void permute(String str,int l, int r) {
		if(l==r) {
			System.out.println(str);
		}else {
			for(int i=l;i<=r;i++) {
				str=swap(str,i,l);
				permute(str,l+1,r);
				str=swap(str,i,l);
			}
		}
	}
	
	public static void main(String args[]) {
		String str="ABC";
		int len=str.length();
		permute(str,0,len-1);
	}
}
