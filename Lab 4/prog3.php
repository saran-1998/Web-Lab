<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>
        Program 3
    </title>
</head>
<body>
    <?php
        $display = "";
        $content = $artist = $name = $song = $composer = "";
        if ($_SERVER["REQUEST_METHOD"] == "POST")
        {
            $file = fopen("prog3.txt","r");
            $content = "Name: " . $_POST["name"] . "\n" . "Favorite Song: " . $_POST["song"] . "\n" . "Composer: " . $_POST["composer"] . "\n" . "Artist/Group: " . $_POST["artist"] . "\n\n";
            $myfile = file_put_contents('prog3.txt', $content.PHP_EOL , FILE_APPEND | LOCK_EX);
            $display = file('prog3.txt');
        }
    ?>

    <form method="post" action="<?php htmlspecialchars($_SERVER["PHP_SELF"]);?>">
        Name: <input type="text" name="name" id="name" value="<?php echo $name;?>"/><br />
        Favorite Song: <input type="text" name="song" id="song" value="<?php echo $song;?>"/><br />
        Composer: <input type="text" name="composer" id="composer" value="<?php echo $composer;?>"/><br />
        Performing Group (or) artist <input type="text" name="artist" id="artist" value="<?php echo $artist;?>"/><br />
        <input type="submit" value="submit" /><br />
        <br />
        <br />  
        <div><?php
            for ($i=0; $i < count($display); $i++) { 
                # code...
                echo $display[$i] . "<br>";
            } 
        ?></div>
    </form>
</body>
</html>