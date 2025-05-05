class Leet8 {
    static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            final int m = (l + r) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 3, 4, 5 };
        int val = 2;
        System.out.println(searchInsert(arr, val));
    }
}