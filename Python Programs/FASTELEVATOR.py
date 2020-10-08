import time
# FASTELEVATOR
# @program 13 
# date 06-01-2019

continue_ON = True
current_level = 0
def operate(current_level, level_number):
    print('Welcome to FASTELEVATOR! Current floor: ' + str(current_level)) 
    if(current_level == level_number):
        print ('You are already in that floor')
    elif(current_level < level_number):
        while current_level < level_number:
            print('[||]' + str(current_level))
            current_level = current_level + 1
            time.sleep(0.1)
        print('[|  |] You have arrived at the Level: ' + str(current_level))
    else:
        while level_number < current_level:
            print('[||]' + str(current_level))
            current_level = current_level - 1 
            time.sleep(0.1)           
        print('[|  |] You have arrived at the Level: ' + str(current_level))
    return current_level

while continue_ON == True:
    level_number = int(input("Which level number?(Type string to exit)  "))
    current_level = operate(current_level, level_number)
  





