#!/usr/bin/env python3

class Solution:
    def romanToInt(self, s: str) -> int:
        roman_values = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        
        result = 0

        for x, s_value in enumerate(s):
            value = roman_values[s_value]

            if x < len(s) - 1:
                next_value = roman_values[s[x+1]]
                if value < next_value:
                    value = -value
            else:
                next_value = 0
            result += value
        return result

solution = Solution()

# Test Case 1
input1 = "III"
output1 = solution.romanToInt(input1)
expected1 = 3
print(f"Input: {input1}, Output: {output1}, Expected: {expected1}")
assert output1 == expected1

# Test Case 2
input2 = "LVIII"
output2 = solution.romanToInt(input2)
expected2 = 58
print(f"Input: {input2}, Output: {output2}, Expected: {expected2}")
assert output2 == expected2

# Test Case 3
input3 = "MCMXCIV"
output3 = solution.romanToInt(input3)
expected3 = 1994
print(f"Input: {input3}, Output: {output3}, Expected: {expected3}")
assert output3 == expected3

# Test Case 4
input4 = "XLVII"
output4 = solution.romanToInt(input4)
expected4 = 47
print(f"Input: {input4}, Output: {output4}, Expected: {expected4}")
assert output4 == expected4

# Test Case 5
input5 = "CMXCIX"
output5 = solution.romanToInt(input5)
expected5 = 999
print(f"Input: {input5}, Output: {output5}, Expected: {expected5}")
assert output5 == expected5
