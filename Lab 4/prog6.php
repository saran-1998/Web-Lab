<html>
<head>
    <style>
        body{
            display: inline-block;
            width:100%;
            height:100%;
            text-align:center;
        }
    </style>
</head>
    <body>
        <?php
            session_start();
        ?>
        <?php
        $regno = "";
        $pwd = "";
        $regErr = "";
        $pwdErr = "";
        $name = "";
        $address = "";
        $mobile = "";
        $time = $_SERVER['REQUEST_TIME'];
        $timeout_duration = 60;
        if (isset($_SESSION['LAST_ACTIVITY']) && ($time - $_SESSION['LAST_ACTIVITY']) > $timeout_duration) {
            session_unset();
            session_destroy();
            session_start();
        }
        if ($_SERVER["REQUEST_METHOD"] == "POST")
        {
            if(empty($_POST["regno"])) {
                $regErr = "Student Registeration number is required";
            } 
            if(empty($_POST["pwd"])) {
                $pwdErr = "Password is required";
            } 
            
            if(isset($_POST["reg"]) && isset($_POST["pwd"])){
                
                $servername = "localhost";
                $username = "root";
                $password = "susan6298";
                $dbname = "Base1";
                
                $conn = new mysqli($servername,$username,$password,$dbname);
                if($conn -> connect_error){
                    die("Connection failed: ".$conn->connect_error);
                }
            

                $regno = $_POST['regno'];
                $pwd = $_POST['pwd'];
                
                $sql = "SELECT name,address,mobile,id from Tab1 where id = '$regno' and password = '$pwd';";
                $result = $conn->query($sql);
                if($result->num_rows > 0){
                    while($row = $result->fetch_assoc()){
                        $name = $row["name"];
                        $address = $row["address"];
                        $mobile = $row["mobile"];
                        $regno = $row["id"];
                    }
                }
                else{
                    print "Data mismatch. Please try again.";
                    $regno = "";
                    $pwd = "";
                }
    
                $conn ->close();
            }
            $_SESSION['LAST_ACTIVITY'] = $time;
        }
        ?>
        <div><h1>Depatment of Computer Technology</h1></div>
        <br>
        <br>
        <form class = "form1" method="post" action="<?php htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <h3>
            Registeration No: <input type="text" name="regno" id ="regno" value="<?php echo $regno;?>" />
            <span class="error">* <?php echo $regErr;?></span>
            <br /><br />
            Password: <input type="password" name="pwd" id ="pwd" value="<?php echo $pwd;?>" />
            <span class="error">* <?php echo $pwdErr;?></span>
            <br /><br />
            <input type="submit" name="submit" value="submit" />
            <br>
            <br>
            <div>
                Student Name: <input type="text" name="name" id  = "name" value="<?php echo $name;?>" />
                Registeration No: <input type="text" name="reg" id  = "reg" value="<?php echo $regno;?>" />
                Address: <input type="text" name="address" id  = "address" value="<?php echo $address;?>" />
                Student Name: <input type="text" name="mobile" id  = "mobile" value="<?php echo $mobile;?>" />
            </div>
            </h3>
        </form>
    </body>
</html>