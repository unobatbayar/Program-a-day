import requests

# Website Downloader, like a $wget from GNU project
# @author unobatbayar
# Input website link and download to a directory
# @author unobatbayar
# @program 7 
# date 17-10-2018

print('Welcome to Website Downloader!' + '\n' )

def getUserInput():
  user_input = raw_input('Prove a website link to start (e.g https://www.google.com ):')
  return user_input

def downloadWebsite():
  website_link = getUserInput() 
  if website_link[:4] == "http": # we use http not http:// or  https:// websites can be different with the security
    send_request = requests.get(website_link)
    if send_request.status_code == 200: # check if request is successful
      # receive content and print everything

      print(send_request.content)
  else:
    print('Error, please provide a full link!')
    downloadWebsite()

downloadWebsite() #start
