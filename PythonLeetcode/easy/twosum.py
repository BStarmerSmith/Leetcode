#!/usr/bin/env python3

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap = {}

        for i, num in enumerate(nums):
            complement = target - num
            if complement in numMap:
                return [numMap[complement], i]
            numMap[num] = i
        return []

solution = Solution()

# Test Case 1
target1 = 9
nums1 = [2, 7, 11, 15]
output1 = solution.twoSum(nums1, target1)
expected1 = [0, 1]
print(f"Target list: {nums1}, Target: {target1}, Output: {output1}, Expected: {expected1}")
assert output1 == expected1

# Test Case 2
target2 = 6
nums2 = [3, 2, 4]
output2 = solution.twoSum(nums2, target2)
expected2 = [1, 2]
print(f"Target list: {nums2}, Target: {target2}, Output: {output2}, Expected: {expected2}")
assert output2 == expected2

# Test Case 3
target3 = 6
nums3 = [3, 3]
output3 = solution.twoSum(nums3, target3)
expected3 = [0, 1]
print(f"Target list: {nums3}, Target: {target3}, Output: {output3}, Expected: {expected3}")
assert output3 == expected3