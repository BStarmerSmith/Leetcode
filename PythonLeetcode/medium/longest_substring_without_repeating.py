#!/usr/bin/env python3

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_dict = {}
        max_length = 0
        start = 0

        for end, char in enumerate(s):
            if char in char_dict:
                # Update the start position of the window
                start = max(start, char_dict[char] + 1)

            char_dict[char] = end
            max_length = max(max_length, end - start + 1)

        return max_length

solution = Solution()

# Test Case 1
input1 = "abcabcbb"
output1 = solution.lengthOfLongestSubstring(input1)
expected1 = 3
print(f"Input: {input1}, Output: {output1}, Expected: {expected1}")
assert output1 == expected1

# Test Case 2
input2 = "bbbbb"
output2 = solution.lengthOfLongestSubstring(input2)
expected2 = 1
print(f"Input: {input2}, Output: {output2}, Expected: {expected2}")
assert output2 == expected2

# Test Case 3
input3 = "pwwkew"
output3 = solution.lengthOfLongestSubstring(input3)
expected3 = 3
print(f"Input: {input3}, Output: {output3}, Expected: {expected3}")
assert output3 == expected3

# Test Case 4
input4 = ""
output4 = solution.lengthOfLongestSubstring(input4)
expected4 = 0
print(f"Input: {input4}, Output: {output4}, Expected: {expected4}")
assert output4 == expected4

# Test Case 5
input5 = "dvdf"
output5 = solution.lengthOfLongestSubstring(input5)
expected5 = 3
print(f"Input: {input5}, Output: {output5}, Expected: {expected5}")
assert output5 == expected5

# Test Case 6 (Harder)
input6 = "abba"
output6 = solution.lengthOfLongestSubstring(input6)
expected6 = 2
print(f"Input: {input6}, Output: {output6}, Expected: {expected6}")
assert output6 == expected6

# Test Case 7 (Harder)
input7 = "tmmzuxt"
output7 = solution.lengthOfLongestSubstring(input7)
expected7 = 5
print(f"Input: {input7}, Output: {output7}, Expected: {expected7}")
assert output7 == expected7
