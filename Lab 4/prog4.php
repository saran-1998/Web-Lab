<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>
        Program 4
    </title>
</head>
<body>
    <?php
    $mobileErr = "";
    $mobile = "";
    $name = "";
    if ($_SERVER["REQUEST_METHOD"] == "POST")
    {
        if(empty($_POST["mobile"])) {
            $mobileErr = "Mobile number is required";
        } else {
            $mobile = test_input($_POST["mobile"]);
            if(!preg_match("/\+\d{2}-\d{4}-\d{6}/", $mobile))
            {
                $mobileErr = "invalid Format";
            }
        }
    }
    function test_input($data) {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
    }
    ?>

    <h2>Form Validation</h2>
    <form method="post" action="<?php htmlspecialchars($_SERVER["PHP_SELF"]);?>">
        Name: <input type="text" name="name" value="<?php echo $name;?>" /><br><br>
        Mobile: <input type="text" name="mobile" value="<?php echo $mobile;?>" />
        <span class="error">* <?php echo $mobileErr;?></span>
        <br /><br />
        <input type="submit" name="submit" value="Submit" />
    </form>

</body>
</html>