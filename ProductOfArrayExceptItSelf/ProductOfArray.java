class ProductOfArray {
    public static int[] productOfArray(int arr[]) {
        int n = arr.length;
        int left[] = new int[n]; // for multiplication of left array
        int right[] = new int[n]; // for multiplication of right array
        
        // Initialize left array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        
        // Initialize right array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        
        // Construct the answer array
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 2};
        int result[] = productOfArray(arr);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
