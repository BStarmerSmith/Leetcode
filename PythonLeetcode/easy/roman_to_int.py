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
        print(result)
        return result

solution = Solution()
print("III = " + solution.romanToInt("III"))
print("LVIII = " + solution.romanToInt("LVIII"))
print("MCMXCIV = " + solution.romanToInt("MCMXCIV"))
