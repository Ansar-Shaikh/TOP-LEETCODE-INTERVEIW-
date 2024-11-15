class FirstAndLastEleUsingBinarySearching {
    public static int[] searcharray(int nums[], int target) {
        int left = findleftbound(nums, target);
        int right = findrightbound(nums, target);
        if (left == -1) {
            return new int[] {-1, -1};
        }
        return new int[] {left, right};
    }

    public static int findleftbound(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // left subarray look only;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static int findrightbound(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // right subarray look
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 8, 9};
        int ans[] = searcharray(nums, 5);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
