<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8" />
<title>Main page</title>
</head>
<body>
	<p>Lets play!</p>
	<h1>
		<c:out value="Equipe 1 :  ${ team1.name }"></c:out>
	</h1>
	<h3>
		<c:out value="Score  :  ${ team1.score }"></c:out>
	</h3>
	<h1>
		<c:out value="Equipe 2 :  ${ team2.name }"></c:out>
	</h1>
	<h3>
		<c:out value="Score  :  ${ team2.score }"></c:out>
	</h3>


	<div align="center">
		<h1 style="line-height: 3.5em;">
			<c:out value="Game Molkky" />
		</h1>
		<form  method="post" name="round" >
			<table style="with: 80%">
				<tr>
				<c:choose>
				    <c:when test="${ team1.isTurn }">
				   		<td><c:out value="It is ${ team1.name } turn to play "></c:out></td>
	    				<c:set target="${ team1 }" property="isTurn" value="false" />
	    				<c:set target="${ team2 }" property="isTurn" value="true"  />
				    </c:when>
				    <c:when test="${ team2.isTurn }">
				    <td><c:out value="It is ${ team2.name } turn to play "></c:out></td>
	    				<c:set target="${ team2 }" property="isTurn" value="false" />
	    				<c:set target="${ team1 }" property="isTurn" value="true" />
				    </c:when>
				    
				    <c:otherwise></c:otherwise>
				</c:choose> 

				</tr>
				<tr>
					<td><c:out value="Add new Score" /></td>
					<td><input type="text" name="score" /></td>
				</tr>
				<td colspan="3">
			</table>
			<input type="submit" value="Send Score" />
		</form>

	</div>
</body>


</html>