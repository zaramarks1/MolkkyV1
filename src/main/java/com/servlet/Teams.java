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
		
		if(request.getParameter("teams") != null) {
			
			Team team1 = new Team(request.getParameter("team1").toString());
			Team team2 = new Team(request.getParameter("team2").toString());
			
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
		
		//System.out.println("post teams");
		//this.getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
	}

}
