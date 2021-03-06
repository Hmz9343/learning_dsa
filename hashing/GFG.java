package hashing;

import java.util.*; 

public class GFG  
{  
  
// Print pair with negative  
// and positive value  
static void printPairs(int arr[], int n)  
{  
    ArrayList<Integer> v = new ArrayList<Integer> ();  
    HashMap<Integer,  
            Integer> cnt = new HashMap<Integer,  
                                       Integer>();  
  
    // For each element of array.  
    for (int i = 0; i < n; i++)  
    {  
  
        // If element has not encounter early,  
        // mark it on cnt array.  
        if (cnt.containsKey(Math.abs(arr[i])))  
            cnt.put(Math.abs(arr[i]), 1);  
  
        // If seen before, push it in vector  
        // (given that elements are distinct)  
        else 
        {  
            v.add(Math.abs(arr[i]));  
            cnt.put(Math.abs(arr[i]), 0);  
        }  
    }  
  
    if (v.size() == 0)  
        return;  
  
    Collections.sort(v);  
    for (int i = 0; i < v.size(); i++)  
        System.out.print("-" + v.get(i) +  
                         " " + v.get(i) + " ");  
}  
  
// Driver Code 
public static void main(String[] args)  
{  
    int arr[] = { 4, 8, 9, 4, 1, 1, -8, -9 };  
    int n = arr.length;  
    printPairs(arr, n);  
} 
}  