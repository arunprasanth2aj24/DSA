class Solution {
    int countFreq(int[] arr, int target) {

        int first = firstOccurance(arr , target);
        if(first == -1) return 0;

        int last = lastOccurance(arr , target);
        return last - first + 1;

    }

    int firstOccurance (int [] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        int ans = -1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            if(arr[mid] > target) end = mid - 1;
            if(arr[mid] < target) start = mid + 1;


        }

        return ans;
    }

    int lastOccurance (int [] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        int ans = -1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            if(arr[mid] > target) end = mid - 1;
            if(arr[mid] < target) start = mid + 1;


        }

        return ans;
    }
}
