<?php
function findMax($file,$fname)
{
    # code...
    $filecontents = file_get_contents($fname);
    $words = preg_split('/[\s|:]+/', $filecontents, -1, PREG_SPLIT_NO_EMPTY);
    $arr = array_count_values($words);
    print_r($words);
    $max = 0;
    $word = "";
    foreach ($arr as $key => $value) {
        # code...
        if($value > $max)
        {
            $max = $value;
            $word = $key;
        }
    }
    return $word;
}

$fname = "prog1_6.txt";
$file = fopen($fname,"r") or die("Unable to open file");
echo findMax($file,$fname);
?>