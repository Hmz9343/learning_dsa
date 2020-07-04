package hashing;
import java.util.*;
public class lszero {
	public static void main(String[] args) {
		int arr[]= {1,2,-2,4,-4};
		Solution(arr);
	}
	public static int Solution(int a[]) {
		HashSet<Integer> hash=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			int sum=0;int pos=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				System.out.println(sum);
				if(sum==0) {
					hash.add(j-i+1);
				}
				
			}
			
		}
		System.out.println(hash);
		//Integer obj=Collections.min(hash);
		//System.out.println(Collections.min(hash));
		return 1;
	}

}
