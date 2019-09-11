from flask import Flask

app = Flask(__name__,static_url_path = "")


@app.route('/add/<int:x>&<int:y>', methods = ['GET'])
def add(x,y):
	print("result:",str(x+y))
	return str(x+y)

if __name__ == '__main__':
	app.run(host='127.0.0.1',port = 3006,debug = True)
