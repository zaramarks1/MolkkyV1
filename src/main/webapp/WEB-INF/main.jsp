<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="utf-8" />
<title>Game page</title>
</head>
<body>
	<p>Lets play!</p>
	<h2>
		<c:out value="Equipe 1 :  ${ team1.name }"></c:out>
	</h2>
	<h4>
		<c:out value="Score  :  ${ team1.score }"></c:out>
	</h4>
	<h4>
		<c:out value="Turn  :  ${ team1.turn }"></c:out>
	</h4>
	<h2>
		<c:out value="Equipe 2 :  ${ team2.name }"></c:out>
	</h2>
	<h4>
		<c:out value="Score  :  ${ team2.score }"></c:out>
	</h4>
	<h4>
		<c:out value="Turn  :  ${ team2.turn }"></c:out>
	</h4>

		
		<form  action="${pageContext.request.contextPath}/main"method="post">
				
			<table style="with: 80%">
					<c:choose>
				    <c:when test="${ team1.isTurn }">
				   		<h2><c:out value="It is ${ team1.name } turn to play "></c:out></h2>
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
				
				<tr>
				<input type='hidden' name='team1Name' value="${ team1.name}"/> 
				<input type='hidden' name='team2Name' value="${ team2.name}"/> 
				
				<input type='hidden' name='team1Score' value="${ team1.score}"/> 
				<input type='hidden' name='team2Score' value="${ team2.score}"/> 
				
				<input type='hidden' name='team1IsTurn' value="${ team1.isTurn }"/> 
				<input type='hidden' name='team2IsTurn' value="${ team2.isTurn }"/> 
				
				<input type='hidden' name='team1Turn' value="${ team1.turn }"/> 
				<input type='hidden' name='team2Turn' value="${ team2.turn }"/> 
				
				<input type='hidden' name='team1IsWinner' value="${ team1.isWinner}"/> 
				<input type='hidden' name='team2IsWinner' value="${ team2.isWinner }"/> 
				</tr>
				<tr>
					<td><c:out value="Add new Score" /></td>
					<td><input type="text" name="score" /></td>
				</tr>
				<td colspan="3">
			</table>
			<input type="submit" name="main" value="Send score" />
		</form>

	</div>
</body>


</html>