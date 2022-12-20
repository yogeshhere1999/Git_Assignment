import java.io.*;
import java.util.*;

class Solution5 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

class Solution
{
    public static void sort012(int a[], int n)
    {
        int i = 0;
        int j = 0;
        int k = a.length -1;
        
        while(i<=k){
            if(a[i] == 1){
                i++;
            }else if(a[i] == 0){
                swap(a,i,j);
                i++;
                j++;
            }else{
                swap(a,i,k);
                k--;
            }
        }
    }

    public static void swap(int [] a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}


