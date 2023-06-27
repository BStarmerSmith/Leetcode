package JavaLeetcode.src.easy;

public class RemoveDuplicates {
    public void testDuplicates() {
        System.out.println("Running Tests for 26.RemoveDuplicates");
        int[] nums1 = {1, 1, 2};
        System.out.print("Original array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        int k1 = removeDuplicates(nums1);
        System.out.println("Number of unique elements: " + k1);
        System.out.print("Modified array: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("\n------------------------------------");
        assert k1 == 2;
        assert nums1[0] == 1;
        assert nums1[1] == 2;

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.print("Original array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();
        int k2 = removeDuplicates(nums2);
        System.out.println("Number of unique elements: " + k2);
        System.out.print("Modified array: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("\n------------------------------------");
        assert k2 == 5;
        assert nums2[0] == 0;
        assert nums2[1] == 1;
        assert nums2[2] == 2;
        assert nums2[3] == 3;
        assert nums2[4] == 4;

        int[] nums3 = {1, 1, 1, 1, 1};
        System.out.print("Original array: ");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println();
        int k3 = removeDuplicates(nums3);
        System.out.println("Number of unique elements: " + k3);
        System.out.print("Modified array: ");
        for (int i = 0; i < k3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println("\n------------------------------------");
        assert k3 == 1;
        assert nums3[0] == 1;

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        for (int num : nums4) {
            System.out.print(num + " ");
        }
        System.out.println();
        int k4 = removeDuplicates(nums4);
        System.out.println("Number of unique elements: " + k4);
        System.out.print("Modified array: ");
        for (int i = 0; i < k4; i++) {
            System.out.print(nums4[i] + " ");
        }
        System.out.println("\n------------------------------------");     
        assert k4 == 5;
        assert nums4[0] == 1;
        assert nums4[1] == 2;
        assert nums4[2] == 3;
        assert nums4[3] == 4;
        assert nums4[4] == 5;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
