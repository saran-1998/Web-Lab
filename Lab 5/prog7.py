import webbrowser
from urllib.request import urlopen

f = open("helloworld.html","w")
res = urlopen("https://www.google.com")
print(res.info())
res.close()

message = """<html>
<head></head>
<body><p>"""+ "Hello" + """</p></body>
</html>"""

f.write(message)
f.close()

webbrowser.open_new_tab('helloworld.html')  