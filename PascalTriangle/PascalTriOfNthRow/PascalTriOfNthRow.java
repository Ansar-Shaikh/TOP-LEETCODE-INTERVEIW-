class PascalTriOfNthRow {
    public static void nthRow(int n) {
        int ans = 1;
        System.out.print(ans + " "); // The first element is always 1
        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1) / i;
            System.out.print(ans + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    public static void main(String[] args) {
        nthRow(6); // Example usage: prints the 6th row of Pascal's Triangle
    }
}
