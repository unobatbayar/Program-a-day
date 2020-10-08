from tkinter import *

#@author unobatbayar
#@program 5
#@date 16-10-2018 
# This is my schedule of grind, 16 hour programming sessions

root = Tk()

#Days 
monday = StringVar()
tuesday = StringVar()
wednesday = StringVar()
thursday = StringVar()
friday = StringVar()
saturday = StringVar()
sunday = StringVar()


#Add labels
label1 = Label( root, textvariable=monday, relief=RAISED )
label2 = Label( root, textvariable=tuesday, relief=RAISED )
label3 = Label( root, textvariable=wednesday, relief=RAISED )
label4 = Label( root, textvariable=thursday, relief=RAISED )
label5 = Label( root, textvariable=friday, relief=RAISED )
label6 = Label( root, textvariable=saturday, relief=RAISED )
label7 = Label( root, textvariable=sunday, relief=RAISED )

#Put s  trings in them
monday.set("MONDAY: PROGRAMMING, PROJECT, BIG DATA")
tuesday.set("TUESDAY: PROGRAMMING, SEMI-STRUCTURED, BIG-DATA")
wednesday.set("WEDNESDAY: PROGRAMMING, BIG-DATA, STRATEGY ESSAY")
thursday.set("THURSDAY: PROGRAMMING, SUPERVISOR MEETING")
friday.set("FRIDAY: PROGRAMMING, BIG-DATA, SEMI-STRUCTURED")
saturday.set("SATURDAY: WORK, PROGRAMMING, ESSAY")
sunday.set("SUNDAY: WORK, ARTIFICIAL INTELLIGENCE, ESSAY")



#Pack
label1.pack()
label2.pack()
label3.pack()
label4.pack()
label5.pack()
label6.pack()
label7.pack()

root.mainloop()
