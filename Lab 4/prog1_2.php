<?php
function Average($numbers)
{
    # code...
    $k = array_sum($numbers);
    $n = count($numbers);
    $ans = $k/$n;
    return $ans;
}

function Median($numbers)
{
    if (count($numbers)%2 === 0) {
        # code...
        $mid=count($numbers)/2;
        return (($numbers[$mid-1]+$numbers[$mid])/2);
    }
    else {
        $mid=(count($numbers)-1)/2;
        return $numbers[$mid];
    }    
}

$numbers=array(1,2,3,4,5);
echo ("AVERAGE: " .Average($numbers)."\n");
echo ("MEDIAN: ".Median($numbers)."\n");
?>