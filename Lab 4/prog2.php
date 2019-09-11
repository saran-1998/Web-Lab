<?php
function greetingCall(){
    define("GREETING1","Have a nice day.");
    define("GREETING2","Thank you.");
    define("GREETING3","Welcome.");
    define("GREETING4","Nice meeting you.");
    define("GREETING5","Hope to see you again.");
    $greet = array(GREETING1,GREETING2,GREETING3,GREETING4,GREETING5);
    $index = rand(0,4);
    echo "<div>".$greet[$index]."</div>";
}
greetingCall();
?>
