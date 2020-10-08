# From any external file our program counts the number of lines
# thanks to Stackoverflow
# @program 3
# @author unobatbayar
# @date 03-10-2018

num_lines = sum(1 for line in open('out.txt'))
print(num_lines)
