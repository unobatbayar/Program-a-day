import datetime as dt
# Date and time in any country
# @program 12 
# date 15-11-2018

user_input = input("What country? ")
x = dt.datetime.now()


def getCountry(country = "Country not found."):
  print("Time in " + country + ": ")
  print(x)

getCountry(user_input)
dt.datetime.now(getCountry("Europe/Madrid")).isoformat()


