c = 10
print(bin(10))

length = c.bit_length()

for i in range(length):
    print(bin(c >> i))
    
# print(c.bit_length())

