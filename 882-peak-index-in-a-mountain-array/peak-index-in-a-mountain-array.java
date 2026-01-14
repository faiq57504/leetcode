class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Increasing slope, move right
                left = mid + 1;
            } else {
                // Decreasing slope, move left
                right = mid;
            }
        }

        // left == right is the peak index
        return left;
    }
}
