import mysql.connector
from flask import Flask, request

app = Flask(__name__,static_url_path = "")

@app.route('/result/<string:x>&<string:y>', methods = ['GET'])
def result(x,y):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="srini1998",database="Base1")
        print(db)
        cursor = db.cursor()

        sql = "SELECT * from Tab2 where id ='"+x+"' and password='"+y+"';"
        print(sql)
        # return "S"
        cursor.execute(sql)
        result = cursor.fetchall()
        print(result)
        if len(result) == 0:
            return "Please Verify Credentials"
        ans = ""
        for a in result:
            for b in range(0,len(a)-1):
                ans=ans+"#"+a[b]
        
        # return "S"
        return ans
        
    except mysql.connector.Error as e:
        print(e)
    

if __name__ == '__main__':
	app.run(host='127.0.0.1',port=3005,debug = True)