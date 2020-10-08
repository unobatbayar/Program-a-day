
# Pascal's Triangle
# @author unobatbayar
# Input website link and download to a directory
# @author unobatbayar just for comments not whole code this time
# @program 10 
# date 27-10-2018

print("Welcome to Pascal's Triangle!" + "\n") 

row = int(input('Please input a row number to which you want to see the triangle to' + '\n'))

a=[]
for i in range(row):
    a.append([]) 
    a[i].append(1) #append(object) - Updates the list by adding an object to the list. append(): It is basically used in Python to add one element. #basically the 1's surrounding the triangle
    for j in range(1,i): 
        a[i].append(a[i-1][j-1]+a[i-1][j]) #add what's in the headspace
    if(row!=0):
        a[i].append(1) #add another value if row doesn't equal to 0
for i in range(row):
    print("   "*(row-i),end=" ",sep=" ") 
    for j in range(0,i+1):
        print('{0:6}'.format(a[i][j]),end=" ",sep=" ")
    print()

## REFERENCE:
# Thanks to Sanfoundry for providing the main code, I initially tried to create it
# on my own, however, my code was bad and wasn't working quite right.
# link to the website: https://www.sanfoundry.com/python-program-print-pascal-triangle/
