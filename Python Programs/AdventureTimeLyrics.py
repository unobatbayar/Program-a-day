# Adventure Time Lyrics program!
# @author unobatbayar
# Choose song name, then the program outputs the lyrics
# @author unobatbayar
# @program 6 
# date 16-10-2018

continue_ON = True
title = 'Welcome to Adventure Time Lyrics Program!'
song_list = ('Adventure Time Theme','Good Little Girl', 'Oh Bubblegum', 'Bacon Pancakes','Everything Stays (Young Marceline and Mom)','Bad Little Boy','Island Song', 'Bonus Track')
song_lyrics = [0, 1, 2, 3, 4, 5, 6, 7]
song_lyrics[0] = ('Adventure Time' + '\n' + 'Come on grab your friends' + '\n' + 'We will go to very distant lands' + '\n' + 'With Jake the Dog and Finn the Human' + '\n' + 'The fun will never end, Adventure Time!') 
song_lyrics[1] = ('[Intro]' + '\n' +  'Follow my lead' + '\n' + 'Hey!' + '\n' + '[Marshall Lee]' + '\n' + 'Good little girl, always picking a fight with me' + '\n' + 'You know that I am bad, but you are spending the night with me' + '\n' + 'What, do you want, from my world' + '\n' + 'You are a good little girl' + '\n' + '[Fionna]' + '\n' +  'Bad little boy, thats what you are acting like' + '\n' + 'I really dont buy' + '\n' + 'that youre that kind of guy,' + '\n' + 'and if you are' + '\n' + 'why do you want to hang out with me?' + '\n' + '[Laughs evilly]' + '\n' + '[Marshall Lee]' + '\n' + 'Dont you know Im a villain, every night Im out killin' + '\n' + 'sending everyone running like children' + '\n' + 'I know why youre mad at me, I got demon eyes' + '\n' + 'and theyre looking right through your anatomy' + '\n' + 'Into your deepest fears, baby, Im not from here' + '\n' + 'Im from the Nightosphere' + '\n' + 'To me, youre clear, transparent' + '\n' + 'You got a thing for me girl, its apparent')
song_lyrics[2] = ('Slime Princess, youre alright' + '\n' + 'Flame Princess, youre okay' + '\n' + 'Wildberry Princess could be better' + '\n' + 'All of the princesses are pretty alright, but' + '\n' + '\n' + 'Oh, Bubblegum' + '\n' + 'You look like a lot of fun' + '\n' + 'Im right outside' + '\n' + 'And that is how I know' + '\n' + '\n' + 'Hey, princess, did you get my text' + '\n' + 'With a picture of my awesome gun show?' + '\n' + 'Im also working on my pecs' + '\n' + 'If you like, Ill send ya a picture of that, too' + '\n' + '\n' + 'Oh Bubblegum' + '\n' + 'I really need someone' + '\n' + 'Or anyone' + '\n' + 'Pretty much anyone' + '\n' + '\n' + 'Im so alone' + '\n' + 'Wont somebody tell me whats wrong with me?' + '\n' + 'Anybody, anybody, anybody?' + '\n' + '\n' + 'Anybody' + '\n' + 'Grod in the sky, please tell me why')
song_lyrics[3] = ('Bacon pancakes, makin bacon pancakes' + '\n' + 'Take some bacon and Ill put it in a pancake' + '\n' + 'Bacon pancakes, thats what its gonna make' + '\n' + 'Bacon pancake')
song_lyrics[4] = ('Lets go in the garden' + '\n' + 'Youll find something waiting' + '\n' + 'Right there where you left it' + '\n' + 'Lying upside down' + '\n' + 'When you finally find it' + '\n' + 'Youll see how its faded' + '\n' + 'The underside is lighter' + '\n' + 'When you turn it around' + '\n' + '\n' + 'Everything stays' + '\n' + 'Right where you left it' + '\n' + 'Everything stays' + '\n' + 'But it still changes' + '\n' + 'Ever so slightly' + '\n' + 'Daily and nightly' + '\n' + 'In little ways' + '\n' + 'When everything stays')
song_lyrics[5] = ('Did you think I was lying?' + '\n' + 'I said Im evil without even trying' + '\n' + 'Already dead so Im not scared of dying' + '\n' + 'Drinking the red from your heart in one sitting' + '\n' + 'You think youve got me pegged, you must be kidding' + '\n' + 'I raise the dead up and they do my bidding' + '\n' + 'Girl, Im a thousand years old; Im a riddle' + '\n' + 'Bad little boy, yes, Im bad but not little')
song_lyrics[6] = ('[Verse 1]' + '\n' + 'Come along with me' + '\n' +  'And the butterflies and bees' + '\n' + 'We can wander through the forest' + '\n' + 'And do so as we please' + '\n' +  'Come along with me' + '\n' +  'To a cliff under a tree' + '\n' +  'Where we can gaze upon the water' + '\n' +  'As an everlasting dream' + '\n' + '\n' +   '[Chorus]' + '\n' +  'All of my collections' + '\n' +  'Ill share them all with you' + '\n' +  'Maybe by next summer' + '\n' +  'We wont have changed our tunes' + '\n' + '\n' +  '[Verse 2]' + '\n' +  'I still want to be' + '\n' +  'With the butterflies and bees' + '\n' +  'Making up new numbers' + '\n' +  'And living so merrily' + '\n' + '\n' +   '[Chorus]' + '\n' +  'All of my collections' + '\n' +  'Ill share them all with you' + '\n' + 'Ill be here for you always' + '\n' +  'And always be with you' + '\n' + '\n' +   '[Outro]' + '\n' +  'Come along with me' + '\n' +  'And the butterflies and bees' + '\n' +  'We can wander through the forest' + '\n' +  'And do so as we please'+ '\n' +  'Living so merrily')
song_lyrics[7] = ('[Intro]'+ '\n' + 'Sachiko' + '\n' + ' I am sorry' + '\n' +' I love you sooooo muuuch' + '\n' + 'Okay? ' + '\n' + '\n' + '[Outro]' + '\n' + 'Sachikoooo..')
print(title + '\n' + 'Here are the list of songs we currently have | (• ◡•)| (❍ᴥ❍ʋ)')


def printList():
    song_number = 0
    for x in song_list:
        print(song_number, x)
        song_number += 1

def askUser():
    user_input = int(input('Choose your song by picking a number:' + '\n'))
    if user_input >= 0 and user_input <= 7:
        print('\n' + song_lyrics[user_input] + '\n')
    else:
        print('Sorry, please pick a number from the given list.')
        askUser()

printList()
while continue_ON == True:
    askUser()
    user_decision = input('Do you want to see another lyrics? (yes/no) or type (list) to get song list again.' + '\n')
    if user_decision.lower() == "no":
        continue_ON = False
    elif user_decision.lower() == "list":
        printList()

