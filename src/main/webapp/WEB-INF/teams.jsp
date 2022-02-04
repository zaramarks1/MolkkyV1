<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="utf-8" />
<title>Home page</title>
</head>


<body>
	<div align="center">
		<h1 style="line-height: 3.5em;">Game Molkky Version 1 !</h1>
		<form method="post">
			<table style="with: 80%">
				<tr>
					<td><c:out value="Team 1"/></td>
					<td><input type="text" name="team1" /></td>
				</tr>
				<tr>
					<td><c:out value="Team 2"/></td>
					<td><input type="text" name="team2" /></td>
				</tr>
				<td colspan="3">
			</table>
			<input type="submit" name="teams" value="Lets Play" />
		</form>

		
		<form  name="teamsWithCSV" method="post">
			<table style="with: 80%">
				<td><b ><c:out value="Choose csv file to upload (not obligatory) :"/></b></td>
				<td><INPUT  NAME="file"
					TYPE="file"></td>
				</tr>
				<tr>
					<td colspan="2">
			</table>
			<input type="submit" name="teamsWithCSV" value="Add CSV file" />
		</form>
	</div>

</body>
</html>