package hashing;

import java.util.HashSet;
import java.util.Scanner;
public class colorfulNumbers{
	public static void main(String[] args) {
		System.out.println(new colorfulNumbers().colorful(3245));
	}
	
	public static int colorful(int a) {
		HashSet<Integer> hash=new HashSet<>();
		String A=Integer.toString(a);
		int prod=1;
		for(int i=0;i<A.length();i++) {
			prod=1;
			for(int j=i;j<A.length();j++) {
				prod*=A.charAt(j)-48;
				if(hash.contains(prod)) {
					return 0;
				}else {
					hash.add(prod);
				}
			}
		}
		return 1;
	}
	
}