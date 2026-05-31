class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        sum = 0
        while n>0:
            digit = n % 10
            sum += digit
            n //= 10
            print(sum)
        return sum