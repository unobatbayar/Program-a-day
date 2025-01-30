import sys

n = 0b10110001
# print(bin(n))
print(sys.getsizeof(n))
n = n << 500
print(sys.getsizeof(n))
# print(n)
