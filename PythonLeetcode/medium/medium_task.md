# 3. Longest Substring Without Repeating Characters

[Link to file](longest_substring_without_repeating.py)

Given a string `s`, the task is to find the length of the longest substring without any repeating characters.

## Examples

### Example 1:
```
Input: `s = "abcabcbb"`
Output: `3`
Explanation: The longest substring without repeating characters is "abc", which has a length of 3.
```

### Example 2:
```
Input: `s = "bbbbb"`
Output: `1`
Explanation: The longest substring without repeating characters is "b", which has a length of 1.
```

### Example 3:
```
Input: `s = "pwwkew"`
Output: `3`
Explanation: The longest substring without repeating characters is "wke", which has a length of 3. Note that "pwke" is not a substring as it contains repeating characters.
```

## Constraints

- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols, and spaces.

---

# 5. Longest Palindromic Substring

[Link to file](longest_palindromic_substring.py)

Given a string `s`, return the longest palindromic substring in `s`.

## Examples

### Example 1:
```
Input: `s = "babad"`
Output: `"bab"`
Explanation: `"aba"` is also a valid answer.
```

### Example 2:
```
Input: `s = "cbbd"`
Output: `"bb"`
```

## Constraints

- 1 <= `s.length` <= 1000
- `s` consists of only digits and English letters.

# 6. Zigzag Conversion
 
 [Link to file](zigzag_conversion.py)

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P A H N
APLSIIG
Y I R
```

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

## Examples

### Example 1:
```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

### Example 2:
```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
```

### Example 3:
```
Input: s = "A", numRows = 1
Output: "A"
```

## Constraints:
1. `1 <= s.length <= 1000`
2. `s` consists of English letters (lower-case and upper-case), `','` and `'.'`.
3. `1 <= numRows <= 1000`