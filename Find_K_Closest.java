// Time Complexity - O(log(n - k))
// Space Complexity - O(1)
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length - k;

        while(low < high){
            int mid = low + (high - low) / 2;
            int start = x - arr[mid];
            int end = arr[mid + k] - x;

            if(start > end){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = low; i < low + k; i++){
            result.add(arr[i]);
        }

        return result;
    }
}
