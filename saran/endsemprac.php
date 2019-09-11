<!DOCTYPE html>
<html>
<head>
	<title>End Sem Prac</title>
</head>
<body>

	<?php
		session_start();
	?>

	<form method="post" action="endsemprac.php">
		Account No:<input type="text" name="accno">*<br>
		Password: <input type="password" name="password">*<br>
		<input type="submit" name="submit">	
	</form>

	<br><br>

	<?php

		$time = $_SERVER["REQUEST_TIME"];
		$timeout_duration = 1800;

		if(isset($_SESSION["lest_visited"]) && ($time - $_SESSION["lest_visited"]) > $timeout_duration)
		{
			session_unset();
			session_destroy();
			session_start();
		}

		if($_SERVER["REQUEST_METHOD"] == "POST")
		{
			$server = "localhost";
			$username = "root";
			$password = "";
			$dbname = "weblab";

		 	$accno = $_POST["accno"];
		 	$pwd = $_POST["password"];


		 	if(empty($accno))
		 	{
		 		die("account number required");
		 	}

		 	if(empty($pwd))
		 	{
		 		die("password required");
		 	}
			else
		 	{
		 		$conn = new mysqli($server, $username, $password, $dbname);

				if($conn -> connect_error)
			 	{
			 		die("database connection error");
			 	}
				$sql = "SELECT accountno, password FROM userdetails where accountno='$accno'";

				$result = $conn->query($sql);

		 		if($result->num_rows != 0)
				{
					while($row = $result->fetch_assoc())
					{
						$pass = $row["password"];
						if($pass != $pwd)
						{
							die("incorrect userid and/or pwd");
						}
						else
						{
							header('Location:mainaction.php?acc='.$accno);
						}
					}
				}
					

			 }

		 }
	  ?>

	  <script type="text/javascript">
	  	
	  </script>
</body>
</html>