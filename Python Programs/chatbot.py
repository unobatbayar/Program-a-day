from random import *

"""
@author unobatbayar
@program 2
@date 02-10-2018

"""

			  		   									  #Chatbot
moodChoices = ("Romantic", "Humorous", "Mysterious", "Mad")  #this is a tuple, you can't change like a list 
replies = ['Yes', 'Sorry, I did not understand', 'What do you think?', 'Wow, I never thought about that', 'はい', 'An ancient man, said so too!', 'yo soy tu amigo']
romantic = [ 'Love..', '<3', 'Awwww', ':-)', 'Kisses!']
humorous = [ 'Hahaha', 'LOL', 'HAHAHA', ':-D', ':DDD']
mysterious = ['?', 'or is it?', 'perhaps', '.....', 'I see you']
mad = [ '!!', '>:(', 'OKAY?', 'WHAT?']
botName = 'Chatbot'
botMood = randint(0, 3)
numberOfReplies = 6
botMoodName = moodChoices[botMood]
	
print('Hello, I am '+ botMoodName + ' ' + botName + '. Type "stop" to stop the Chatbot. Enter your name:')

userName = input()
print('Hello, ' + userName)

chatbot_ON = True
while chatbot_ON :
	userReply = input()
	replies.insert(1, userReply)
	if botMood == 0:
		print(replies[randint(0, numberOfReplies)] + " " + romantic[randint(0, 4)])
	elif botMood == 1:
 		print(replies[randint(0, numberOfReplies)] + " " + humorous[randint(0, 4)])
	elif botMood == 2:
		print(replies[randint(0, numberOfReplies)] + " " + mysterious[randint(0, 4)])
	elif botMood == 3:
		print(replies[randint(0, numberOfReplies)] + " " + mad[randint(0, 3)])
	if userReply == "stop":
		chatbot_ON = False
		print(replies)