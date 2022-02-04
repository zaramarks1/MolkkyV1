<%@ page pageEncoding="UTF-8"%>
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
		<form action="action=" main.jsp" name="teams" method="post">
			<table style="with: 80%">
				<tr>
					<td>Team 1</td>
					<td><input type="text" name="team1" /></td>
				</tr>
				<tr>
					<td>Team 2</td>
					<td><input type="text" name="team2" /></td>
				</tr>
				<td colspan="3">
			</table>
			<input type="submit" name="teams" value="Lets Play" />
		</form>

		
		<form action="action=" teamsWithCSV.jsp" name="teamsWithCSV" method="post">
			<table style="with: 80%">
				<td><b >Choose csv file to upload (not obligatory) :</b></td>
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