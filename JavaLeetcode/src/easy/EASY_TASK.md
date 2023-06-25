# 26. Remove Duplicates from Sorted Array

[Link to file](RemoveDuplicates.java)

## Description

This repository contains a Java program that solves the "Remove Duplicates from Sorted Array" problem. Given an integer array `nums` sorted in non-decreasing order, the program removes the duplicates in-place such that each unique element appears only once. The relative order of the elements is kept the same. The program then returns the number of unique elements in `nums`.

To be accepted, the program needs to fulfill the following requirements:

- Change the array `nums` such that the first `k` elements of `nums` contain the unique elements in the order they were present in `nums` initially. The remaining elements of `nums` are not important, as well as the size of `nums`.
- Return `k`.

A custom judge is used to test the solution with the provided input array and the expected answer. If all assertions pass, the solution will be accepted.

## Example

### Input

```
nums = [1,1,2]
```

### Output

```
2, nums = [1,2,_]
```


Explanation: The function should return `k = 2`, with the first two elements of `nums` being 1 and 2, respectively. It does not matter what is left beyond the returned `k` (hence they are represented as underscores).

## Constraints

- 1 <= `nums.length` <= 3 * 10^4
- -100 <= `nums[i]` <= 100
- `nums` is sorted in non-decreasing order.

---