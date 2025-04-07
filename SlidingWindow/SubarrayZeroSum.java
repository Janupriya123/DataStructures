class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer>s=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]==0 || sum==0 || s.contains(sum))
            {
                return true;
            }
            s.add(sum);
        }
        return false;
        
    }
}
