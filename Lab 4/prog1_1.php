<?php
function compute($a1){
    $a2 = array_unique($a1);
    $a3 = array_values($a2);
	return $a3;
}
$a1 = array("a","b","c","a","d","e");
$a2 = compute($a1);
print "The unique elements are\n";
for($x1=0;$x1<count($a2);$x1++){
	print $a2[$x1]." ";
}
?>