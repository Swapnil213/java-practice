public class Leet7 {
  static int removeElement(int[] nums, int val) {
    int i = 0;

    for (final int num : nums)
      if (num != val)
        nums[i++] = num;

    return i;
  }
  public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 2, 3, 4, 5 };
      int val = 2;
      System.out.println(removeElement(arr, val));
  }
}
