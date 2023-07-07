#!/usr/bin/env python3

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or len(s) <= numRows:
            return s    
        rows = ['' for _ in range(numRows)]
        index, step = 0, 1

        for char in s:
            rows[index] += char            
            if index == 0:
                step = 1
            elif index == numRows - 1:
                step = -1
            index += step
        return ''.join(rows)

solution = Solution()

input1 = "PAYPALISHIRING"
output1 = solution.convert(input1, 3)
expected1 = "PAHNAPLSIIGYIR"
print(f"Input: {input1}, Output: {output1}, Expected: {expected1}")
assert output1 == expected1

input2 = "HELLO"
output2 = solution.convert(input2, 1)
expected2 = "HELLO"
print(f"Input: {input2}, Output: {output2}, Expected: {expected2}")
assert output2 == expected2

input3 = "ABCD"
output3 = solution.convert(input3, 2)
expected3 = "ACBD"
print(f"Input: {input3}, Output: {output3}, Expected: {expected3}")
assert output3 == expected3

input4 = ""
output4 = solution.convert(input4, 5)
expected4 = ""
print(f"Input: {input4}, Output: {output4}, Expected: {expected4}")
assert output4 == expected4