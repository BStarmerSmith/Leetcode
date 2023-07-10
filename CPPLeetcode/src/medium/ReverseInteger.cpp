#include <iostream>
#include <cassert>
#include <limits>

class Solution
{
public:
    int reverse(int x)
    {
        long reversed = 0;
        while (x != 0)
        {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
        }
        if (reversed > std::numeric_limits<int>::max() || reversed < std::numeric_limits<int>::min())
        {
            return 0; // Overflow occurred
        }
        return static_cast<int>(reversed);
    }
};

int main()
{
    Solution solution;

    std::cout << "7. Reverse Integer running" << std::endl;

    // Example 1: Positive number
    int num1 = 12345;
    int expected1 = 54321;
    int result1 = solution.reverse(num1);
    std::cout << "Reversed number (Example 1): " << result1 << std::endl;
    assert(result1 == expected1);

    // Example 2: Negative number
    int num2 = -9876;
    int expected2 = -6789;
    int result2 = solution.reverse(num2);
    std::cout << "Reversed number (Example 2): " << result2 << std::endl;
    assert(result2 == expected2);

    // Example 3: Single-digit number
    int num3 = 5;
    int expected3 = 5;
    int result3 = solution.reverse(num3);
    std::cout << "Reversed number (Example 3): " << result3 << std::endl;
    assert(result3 == expected3);

    // Example 4: Number with trailing zeros
    int num4 = 1200;
    int expected4 = 21;
    int result4 = solution.reverse(num4);
    std::cout << "Reversed number (Example 4): " << result4 << std::endl;
    assert(result4 == expected4);

    // Example 5: Large number
    int num5 = 1234567890;
    int expected5 = 987654321;
    int result5 = solution.reverse(num5);
    std::cout << "Reversed number (Example 5): " << result5 << std::endl;
    assert(result5 == expected5);

    std::cout << "All examples passed!" << std::endl;

    return 0;
}
