<!DOCTYPE html>
<html>
<head>
	<title>End Sem Prac</title>
</head>
<body>

	<?php 
		$acc=$_GET["acc"];
	 ?>

	<form method="post" action=<?php echo "mainaction.php?acc=".$acc ?>>
		Account No:<input type="text" name="accno" value=<?php echo $acc; ?>>*<br>
		Amount: <input type="text" name="amnt"><br>
		Action Type:<br>
		<input type="radio" name="bankAction" value="Deposit">Deposit
		<input type="radio" name="bankAction" value="Withdraw">Withdraw
		<input type="radio" name="bankAction" value="CheckBalance">Checkbalance*<br>
		<input type="submit" name="submit">	
	</form>
	<br><br>

	<?php

		if($_SERVER["REQUEST_METHOD"] == "POST")
		{
			$server = "localhost";
			$username = "root";
			$password = "";
			$dbname = "weblab";

		 	$accno = $_POST["accno"];
		 	$amnt = $_POST["amnt"];
		 	$action = $_POST["bankAction"];

		 	$echoError = "";

		 	if(empty($accno))
		 	{
		 		$echoError = "account number required";
		 		die("account number required");
		 	}

			else
		 	{
		 		$conn = new mysqli($server, $username, $password, $dbname);

				if($conn -> connect_error)
			 	{
			 		die("database connection error");
			 	}
				$sql = "SELECT accountno, balance FROM bank where accountno='$accno'";

				$result = $conn->query($sql);

				

				if(empty($action))
			 	{
			 		$echoError = "action required";
			 		die("action required");
			 	}
			 	else
			 	{
			 		$balance = 0;

			 		if($result->num_rows != 0)
					{
						while($row = $result->fetch_assoc())
						{
							$balance = $row["balance"];

						}
					}
					else
					{
						$echoError = "invalid account number";
			 			die("invalid account number");		
					}

					if($action == "Withdraw")
					{
						if(empty($amnt))
					 	{
					 		$echoError = "amount required";
					 		die("amount required");
					 	}
						if($balance < $amnt)
						{
							$echoError = "insufficient balance";
			 				die("insufficient balance");
						}
						else
						{
							$balance = $balance - $amnt;
						}

						$sql = "UPDATE bank set balance='$balance' where accountno='$accno'";
						$conn->query($sql);

						echo "Balance deducted";
					}
					elseif ($action == "Deposit") {
						
						if(empty($amnt))
					 	{
					 		$echoError = "amount required";
					 		die("amount required");
					 	}

						$balance = $balance + $amnt;
						$sql = "UPDATE bank set balance='$balance' where accountno='$accno'";
						$conn->query($sql);

						echo "Balance Incremented";	
					}

					else 
					{
						echo "<table border='1'><tr><th>Acc Number:</th><th>Balance</th></tr><tr><td>";
						echo $accno."</td><td>".$balance."</td></tr></table>";
					}

			 	}

		 	}
		 }

	  ?>

</body>
</html>