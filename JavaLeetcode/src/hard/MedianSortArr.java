package JavaLeetcode.src.hard;

import java.util.Arrays;

public class MedianSortArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int medianIndex = totalLength / 2;

        boolean isEvenLength = (totalLength % 2 == 0);
        int currentNum = 0;
        int prevNum = 0;
        int i = 0; // Index for nums1
        int j = 0; // Index for nums2

        while (i + j <= medianIndex) {
            prevNum = currentNum;

            // Store the current number and move the pointer accordingly
            if (i < nums1.length && (j == nums2.length || nums1[i] <= nums2[j])) {
                currentNum = nums1[i];
                i++;
            } else {
                currentNum = nums2[j];
                j++;
            }
        }

        return isEvenLength ? (prevNum + currentNum) / 2.0 : currentNum;
    }

    public void testDuplicates() {
        System.out.println("Running Tests for 4.MedianSortArr");

        // Test 1
        int[] t1_nums1 = { 1, 3 };
        int[] t1_nums2 = { 2 };
        double t1_median = findMedianSortedArrays(t1_nums1, t1_nums2);
        double t1_expectedMedian = 2.0;
        System.out.println("Test 1 - Median: " + t1_median + " (Expected: " + t1_expectedMedian + ")");
        assert t1_median == t1_expectedMedian;

        // Test 2
        int[] t2_nums1 = { 1, 2, 3, 4 };
        int[] t2_nums2 = { 4, 5, 6, 7 };
        double t2_median = findMedianSortedArrays(t2_nums1, t2_nums2);
        double t2_expectedMedian = 4.0;
        System.out.println("Test 2 - Median: " + t2_median + " (Expected: " + t2_expectedMedian + ")");
        assert t2_median == t2_expectedMedian;

        // Test 3
        int[] t3_nums1 = { 1, 3, 5, 7, 9 };
        int[] t3_nums2 = { 3, 4, 6, 8, 10 };
        double t3_median = findMedianSortedArrays(t3_nums1, t3_nums2);
        double t3_expectedMedian = 5.5;
        System.out.println("Test 3 - Median: " + t3_median + " (Expected: " + t3_expectedMedian + ")");
        assert t3_median == t3_expectedMedian;

        // Test 4
        int[] t4_nums1 = { 1, 3, 7, 10, 12 };
        int[] t4_nums2 = { 2, 4, 6, 8, 9, 11, 12 };
        double t4_median = findMedianSortedArrays(t4_nums1, t4_nums2);
        double t4_expectedMedian = 7.5;
        System.out.println("Test 4 - Median: " + t4_median + " (Expected: " + t4_expectedMedian + ")");
        assert t4_median == t4_expectedMedian;

        // Test 5
        int[] t5_nums1 = { 2, 4, 6, 8, 10 };
        int[] t5_nums2 = { 1, 3, 5, 7, 9 };
        double t5_median = findMedianSortedArrays(t5_nums1, t5_nums2);
        double t5_expectedMedian = 5.5;
        System.out.println("Test 5 - Median: " + t5_median + " (Expected: " + t5_expectedMedian + ")");
        assert t5_median == t5_expectedMedian;
        System.out.println("Running Upper Limits Test - Using Ranomized Input Arrays of Size 1000 and the values are between -106 and 106");
        for (int i = 0; i < 5; i++) {
            testUpperLimits();
        }

    }

    public void testUpperLimits() {

        // Generate large input arrays
        int m = 1000;
        int n = 1000;
        int[] t_nums1 = new int[m];
        int[] t_nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            t_nums1[i] = (int) (Math.random() * 213) - 106;
        }
        for (int i = 0; i < n; i++) {
            t_nums2[i] = (int) (Math.random() * 213) - 106;
        }

        // Sort the arrays
        Arrays.sort(t_nums1);
        Arrays.sort(t_nums2);

        // Calculate expected median
        double expectedMedian;
        int totalLength = m + n;
        int medianIndex = totalLength / 2;
        boolean isEvenLength = (totalLength % 2 == 0);
        if (isEvenLength) {
            int prev = 0, curr = 0;
            int i = 0, j = 0;
            while (i + j <= medianIndex) {
                prev = curr;
                if (i < m && (j == n || t_nums1[i] <= t_nums2[j])) {
                    curr = t_nums1[i];
                    i++;
                } else {
                    curr = t_nums2[j];
                    j++;
                }
            }
            expectedMedian = (prev + curr) / 2.0;
        } else {
            int curr = 0;
            int i = 0, j = 0;
            while (i + j <= medianIndex) {
                if (i < m && (j == n || t_nums1[i] <= t_nums2[j])) {
                    curr = t_nums1[i];
                    i++;
                } else {
                    curr = t_nums2[j];
                    j++;
                }
            }
            expectedMedian = curr;
        }

        // Find the actual median using the function
        double actualMedian = findMedianSortedArrays(t_nums1, t_nums2);

        // Print and assert the results
        System.out.println("Median: " + actualMedian + " (Expected: " + expectedMedian + ")");
        assert actualMedian == expectedMedian;
    }

}