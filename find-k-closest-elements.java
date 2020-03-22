// Time Complexity : O(logN+k)
// Space Complexity : O(k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        
        //base case
        if(arr == null || arr.length == 0)
            return result;
        
        int low=0, high=arr.length-k;
        //iterate using binary search
        while(low < high)
        {
            int mid = low+(high-low)/2;
            
            if(x-arr[mid] > arr[mid+k]-x)
                low = mid+1;
            else
                high = mid;
        }
        
        for(int i=0;i<k;i++)
            result.add(arr[low+i]);
        
        return result;
    }
}
