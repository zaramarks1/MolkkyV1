package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.beans.Team;
import com.opencsv.CSVReader;

/**
 * Servlet implementation class Home
 */
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/teams.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post team");
		
		if(request.getParameter("teams") != null) {
			
			Team team1 = new Team(request.getParameter("team1").toString());
			Team team2 = new Team(request.getParameter("team2").toString());
			
			team1.setIsTurn(true);
			
			request.setAttribute( "team1", team1);
			request.setAttribute( "team2", team2);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
			
		}else if (request.getParameter("teamsWithCSV") != null) {
			System.out.println(request.getParameter("file"));
			//FileReader fileReader = new FileReader(request.getParameter("file"));
			//File file = new File(request.getParameter("file"));
			/*try (CSVReader reader = new CSVReader(file)){
				 List<String[]> r = reader.readAll();
		         r.forEach(x -> System.out.println(Arrays.toString(x)));
			}*/
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/teamsWithCSV.jsp").forward(request, response);
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
		
		//System.out.println("post teams");
		//this.getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
	}

	/*<!-- <p><c:out value="${ variable }">Valeur par défaut</c:out></p>
<c:set var="pseudo" value="Mateo21" scope="page" />
<c:remove var="pseudo" scope="page" />
<c:set target="${ auteur }" property="prenom" value="Mathieu" />
<p><c:out value="${ auteur.prenom }" /></p>

IF 

<c:if test="${ 50 > 10 }" var="variable">
    C'est vrai !
</c:if>

CASE
<c:choose>
    <c:when test="${ variable }">Du texte</c:when>
    <c:when test="${ autreVariable }">Du texte</c:when>
    <c:when test="${ encoreUneAutreVariable }">Du texte</c:when>
    <c:otherwise></c:otherwise>
</c:choose> 

FOR
<c:forEach var="i" begin="0" end="10" step="2">
    <p>Un message n°<c:out value="${ i }" /> !</p>
</c:forEach>

<c:forEach items="${ titres }" var="titre" varStatus="status">
    <p>N°<c:out value="${ status.count }" /> : <c:out value="${ titre }" /> !</p>
</c:forEach>

<c:forTokens var="morceau" items="Un élément/Encore un autre élément/Un dernier pour la route" delims="/ ">
    <p>${ morceau }</p>
</c:forTokens>
-->

*/
}
