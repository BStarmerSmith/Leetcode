# 1: Two Sum

Given an array of integers `nums` and an integer `target`, return the indices of two numbers in `nums` such that they add up to the `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Examples

### Example 1:

**Input:**

```
nums = [2, 7, 11, 15]
target = 9
```

**Output:**

```
[0,1]
```

**Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

### Example 2:

**Input:**

```
nums = [3, 2, 4]
target = 6
```

**Output:**
```
[1,2]
```

### Example 3:

**Input:**

```
nums = [3, 3]
target = 6
```

**Output:**

```
[0, 1]
```

## Constraints

- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.

---

# 13: Roman to Integer

[Link to file](roman_to_int.py)


Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example, 2 is written as II in Roman numerals, which is just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written from largest to smallest from left to right. However, there are some cases where subtraction is used. For example, four is written as IV (one before five) and nine is written as IX (one before ten). There are six instances where subtraction is used:

- I can be placed before V (5) and X (10) to make 4 and 9.
- X can be placed before L (50) and C (100) to make 40 and 90.
- C can be placed before D (500) and M (1000) to make 400 and 900.

Given a Roman numeral, convert it to an integer.

## Examples

### Example 1:

**Input:**

```
s = "III"
```

**Output:**

```
3
```


**Explanation:** III represents the number 3.

### Example 2:

**Input:**

```
s = "LVIII"
```

**Output:**

```
58
```


**Explanation:** L = 50, V = 5, III = 3, so the total is 50 + 5 + 3 = 58.

### Example 3:

**Input:**

```
s = "MCMXCIV"
```

**Output**

```
1994
```


**Explanation:** M = 1000, CM = 900, XC = 90, IV = 4, so the total is 1000 + 900 + 90 + 4 = 1994.

## Constraints

- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that s is a valid Roman numeral in the range [1, 3999].

---
