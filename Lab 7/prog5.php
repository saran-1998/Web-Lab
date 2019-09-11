<?php

$address[] = "Chennai TamilNadu 600001";
$address[] = "Salem TamilNadu 600002";
$address[] = "Madurai TamilNadu 600003";

$val = $_REQUEST["val"];
$fl = 0;
for($i=0;$i<sizeof($address);$i++){
    if($address[$i] == $val){
        $fl = 1;
        break;
    }
}
if($fl==0){
    echo 'inValid';
}
else{
    echo 'valid';
}

?>