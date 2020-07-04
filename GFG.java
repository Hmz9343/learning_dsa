public class GFG { 
  
    // Function to print all the permutations of str 
    static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.println(ans + " ");
            System.out.println();
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
            
            System.out.println(ros);
            System.out.println(ans);
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "abb";
        System.out.println("substring:"+s.substring(0,0));
        printPermutn(s, ""); 
    } 
} 