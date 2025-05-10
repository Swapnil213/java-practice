import java.util.Arrays;

class Leet11 {
    static int singleNumber(int[] nums) {
        int result = 0;
        int i = 0;
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        while(i < nums.length){
            if(i == nums.length-1){
                result = nums[i];
                break;
            }
            if(nums[i] != nums[i+1]){
                result = nums[i];
                break;
            }
            i = i + 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 4, 1, 5 };
        System.out.println(singleNumber(arr));
    }
}
