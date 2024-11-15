class CountInversion1 {
    public static int count = 0;

    public static int[] mergesorttwo(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int result[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
                count += n - i; // Count the inversions
            }
        }
        while (i < n) {
            result[k++] = arr1[i++];
        }
        while (j < m) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static int[] mergesort(int arr[], int si, int ei) {
        if (si == ei) {
            int bs[] = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = si + (ei - si) / 2;
        int left[] = mergesort(arr, si, mid);
        int right[] = mergesort(arr, mid + 1, ei);
        int res[] = mergesorttwo(left, right);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 2, 9, 5};
        int ans[] = mergesort(arr, 0, arr.length - 1);
        System.out.println("Count of inversion in array: " + count);
    }
}
