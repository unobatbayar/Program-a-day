# Algorith of Attraction
# @author unobatbayar
# Basic information used: Physical, Status, Character, Chemistry 
# Let's just give points for each trait, however, minus points if not her preference

points = 0 # will give points depending on traits below
questions = ["He has a symmetrical face:", 
             "He has a good smell:", "He is handsome:", 
             "He is well dressed or looking good:", 
             "He has clear skin, bright eyes, fit body:",
             "He is powerful (financial, physical, Informational or etc):",
             "He is ambitious, motivated:",
             "He has a great job or holds a reputable position:",
             "He is intelligent:",
             "He is funny:",
             "He is not shy:",
             "He is confident:",
             "He has a good body language:",
             "There is good chemistry between you and the guy:", 
             "He meets your preference/type:" ] 

print(' Welcome to Algorithm of Attraction by Uno! + ')
print (' Please only answer 1 for yes and 0 for no in all ' + str(len(questions)) + ' questions.')

for i,question in enumerate(questions):
    points += int(input("Question "+ str(i) + "/" + str(len(questions)) + " " + question + " "))

print("The algorithm is complete! Result:")
print( str(points/len(questions)*100) + "% probability of being attracted.")