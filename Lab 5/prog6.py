from bs4 import BeautifulSoup
import requests

def scrapeSite(url,out):
    r = requests.get(url)
    txt = r.text
    htmlCode = BeautifulSoup(txt,'html.parser')
    if htmlCode.h1:
        ans = htmlCode.find_all('h1')
        for i in ans:
            out.write(str(i.string) + "\n")
    if htmlCode.p:
        ans = htmlCode.find_all('p')
        for i in ans:
            out.write(str(i.string) + "\n")

try:
    url = input("Enter a url:")
    out = open("out6.txt","w")
    scrapeSite(url,out)
    out.close()
except IOError as e:
    print(e)