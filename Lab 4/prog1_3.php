<?php
function compute($a1){
	$map = array_count_values($a1);
	arsort($map);
	$a2 = array_keys($map);
	return $a2;
}
$a1 = array("a","b","c","a","b","a","b","a","b","a");
$a2 = compute($a1);
print "The top 3 elements are\n";
for($x1=0;$x1<3;$x1++){
	print $a2[$x1];
	print " ";
}
?>