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
print("Target list: [2,7,11,15] Target: 9 Output: " + solution.twoSum([2,7,11,15], 9))
print("Target list: [3,2,4] Target: 6 Output: " + solution.twoSum([3,2,4], 6))
print("Target list: [3,3] Target: 6 Output: " + solution.twoSum([3,3], 6))