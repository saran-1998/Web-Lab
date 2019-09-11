<?php
function compute($a1){
	$a3 = preg_split('/[\s]+|\.|\,/',$a1);
    $a2 = array_values($a3);
    $ff = array();
    for($x=0;$x<count($a2);$x++){
        if(strlen($a2[$x])>3){
            array_push($ff,$a2[$x]);
        }
    }
    $map = array_count_values($ff);
	arsort($map);
	$ans = array_keys($map);
	return $ans;
}
$a1 =" hello,  there welcome. a vdgdhfghj, welcome.";
$a2 = compute($a1);
print "The top 3 elements are\n";
for($x1=0;$x1<3;$x1++){
	print $a2[$x1];
	print " ";
}
?>