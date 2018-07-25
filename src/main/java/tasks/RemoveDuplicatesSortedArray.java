package tasks;

/**
 * Created by anastasiia_911 on 7/25/18.
 */
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        int j = 0; //index for first non duplicated value
        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }
        for (
                int i = 0;
                i < nums.length - 1; i++)

        {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];    //override first value in nums [] with first non dupl value
            }
        }

        nums[j++] = nums[nums.length - 1];
        return j;
    }
}

