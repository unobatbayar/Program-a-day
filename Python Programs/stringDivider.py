# From any external file our program counts the number of lines
# thanks to Stackoverflow
# @program 8
# @author unobatbayar
# @date 18-10-2018

userInput = input('Please input string to divide!:') #e.g King
half = int(len(userInput)/2)
first = userInput[:half] #Ki
last = userInput[half:] #ng
print(first + ' ' + last)