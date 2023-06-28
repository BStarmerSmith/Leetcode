#!/usr/bin/env python3

class Solution:
    # Thge idea is to use Manacher's algorithm to find the longest palindrome in linear time.
    def longestPalindrome(self, s: str) -> str:
        string_len = len(s)
        if string_len < 2:
            return s

        processed_str = '#'.join('^{}$'.format(s))
        palindrome_lengths = [0] * (2 * string_len + 1)
        center = right = max_len = max_len_center = 0

        for i in range(1, 2 * string_len):
            if i < right:
                mirror = 2 * center - i
                palindrome_lengths[i] = min(
                    right - i, palindrome_lengths[mirror])

            while processed_str[i + 1 + palindrome_lengths[i]] == processed_str[i - 1 - palindrome_lengths[i]]:
                palindrome_lengths[i] += 1

            if i + palindrome_lengths[i] > right:
                center = i
                right = i + palindrome_lengths[i]

            if palindrome_lengths[i] > max_len:
                max_len = palindrome_lengths[i]
                max_len_center = i

        start = (max_len_center - max_len) // 2
        end = start + max_len

        return s[start:end]


test_cases = [
    ("babad", "bab"),
    ("cbbd", "bb"),
    ("a", "a"),
    ("ac", "a"),
    ("bb", "bb"),
    ("abcde", "a"),
    ("abacdfgdcaba", "aba"),
    ("", ""),
]

solution = Solution()
print("Running test 5. Longest Palindromic Substring")
for i, (input_str, expected) in enumerate(test_cases):
    output = solution.longestPalindrome(input_str)
    status = "PASS" if output == expected else "FAIL"
    print(
        f"Test case #{i+1}: Input: {input_str} | Expected: {expected} | Actual: {output} | Status: {status}")