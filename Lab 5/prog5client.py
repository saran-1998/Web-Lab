import httplib2
http = httplib2.Http()
a = input("Enter a:")
b = input("Enter b:")
operation = "/add/"+str(a)+"&"+str(b)
url = "http://localhost:3006"+operation
(response_headers, content) = http.request(url, method="GET")
print(str(content))
