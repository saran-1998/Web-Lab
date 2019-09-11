<?php
function compute($a1){
	$a3 = explode(' ',$a1);
	$a2 = array_values($a3);
	for($x1=0;$x1<count($a2);$x1++){
		if(strlen($a2[$x1]) == 4){
			$ans = $a2[$x1];
			return $ans;
		}
	}
	return "false";
}
$a1 ="1 2 34 12 3455";
$a2 = compute($a1);
print $a2 . "\n";
$a1 ="1 2 34 12 345";
$a2 = compute($a1);
print $a2 . "\n";
?>