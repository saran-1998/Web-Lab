<?php
function filter($a, &$p, &$n)
{
    # code...
    $num = count($a);
    for ($i=0; $i < $num; $i++) { 
        # code...
        if($a[$i] > 0)
        {
            array_push($p,$a[$i]);
        }
        elseif($a[$i] < 0)
        {
            array_push($n,$a[$i]);
        }
    }    
}

$numbers=array(-1,2,-3,4,-5);
$pos = array();
$neg = array();
filter($numbers,$pos,$neg);

echo "Positive array:\n";
for ($i=0; $i < count($pos); $i++) { 
    # code...
    echo($pos[$i]." ");
}
echo "\n";
echo "Negative array:\n";
for ($i=0; $i < count($neg); $i++) { 
    # code...
    echo($neg[$i]." ");
}

echo "\n";

?>