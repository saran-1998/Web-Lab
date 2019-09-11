import webbrowser
f = open("helloworld1.html","w")

msg="""<!DOCTYPE html>
<html>
    <head>
        <title>Result page </title>
        <style>
            .intro{
                text-align:center;
            }
            #result-login{
                display:inline-block;
                width: 100%;
                text-align:center;
            }
            #details{
                text-align:center;
            }
            #publish-result{
                visibility: hidden;
            }
            table{
                width: 70%;
            }
            table,th,td{
                border: 1px solid black;
            }
            th, td {
                padding: 15px;
                text-align: center;
            }
        </style>
        <script>
            function myFunction(){
                var reg = document.getElementById("roll_no").value;
                var pass = document.getElementById("pwd").value;
                if(reg.length ==0 && pass.length == 0){
                    alert("Please fill in both Register number and password");
                }
                if(reg.length== 0){
                    alert("Roll No is required");
                }
                if(pass.length ==0){
                    alert("Password is required")
                }
                var url = "http://127.0.0.1:3005/result/"+reg+"&"+pass;
                var xmlHttp = new XMLHttpRequest();
                xmlHttp.open("GET",url,false);
                xmlHttp.send();
                var ans = xmlHttp.responseText;
                console.log(ans);
                var arr = ans.split("#");
                if(arr.length == 1){
                    alert(arr);
                    document.getElementById("roll_no").value = "";
                    document.getElementById("pwd").value = "";    
                }else{
                    arr = arr.slice(1);
                    console.log(arr)
                    document.getElementById("student-name").value = arr[0];
                    document.getElementById("student-reg").value = arr[1];
                    document.getElementById("student-sem").value = arr[2];
                    document.getElementById("sub1-id").innerHTML = arr[3];
                    document.getElementById("sub1-name").innerHTML = arr[4];
                    document.getElementById("sub1-grade").innerHTML = arr[5];
                    document.getElementById("sub2-id").innerHTML = arr[6];
                    document.getElementById("sub2-name").innerHTML = arr[7];
                    document.getElementById("sub2-grade").innerHTML = arr[8];
                    document.getElementById("result-login").style.display = "none";
                    document.getElementById("publish-result").style.visibility = "visible";
                }
            }
        </script>
    </head>
    <body>
        <div class="intro">
            <h1>Madras Institue of Technology</h1>
        </div>
        <div id="result-login">
            Roll No : <input type="text" id="roll_no" />
            <br> <br>
            Password : <input type="password" id="pwd" />
            <br><br>
            <button onclick="myFunction()">Login</button>
        </div>
        <div id="publish-result">
            <div id = "details">
                Name : <input type = "text" id="student-name" value="" />
                <br><br>
                Register Number : <input type = "text" id="student-reg" value="" />
                <br><br>
                Sem : <input type = "text" id="student-sem" value="" />
                <br> <br>
            </div>
            <table class="result" align="center">
                <tr>
                    <th>Course Id</th>
                    <th>Course Name</th>
                    <th>Grade</th>
                </tr>
                <tr>
                    <td id="sub1-id"></td>
                    <td id="sub1-name"></td>
                    <td id="sub1-grade"></td>
                </tr>
                <tr>
                    <td id="sub2-id"></td>
                    <td id="sub2-name"></td>
                    <td id="sub2-grade"></td>
                </tr>
            </table>
        </div>
    </body>
</html>"""
f.write(msg)
f.close()
webbrowser.open_new_tab("helloworld1.html")