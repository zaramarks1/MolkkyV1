package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.beans.Team;

/**
 * Servlet implementation class Main
 */
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get main");
		this.getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Team team1 = new Team(request.getParameter("team1Name"), 
				Integer.valueOf(request.getParameter("team1Score").trim()), 
				Integer.valueOf(request.getParameter("team1Turn").trim()), 
				Boolean.parseBoolean(request.getParameter("team1IsWinner")), 
				Boolean.parseBoolean(request.getParameter("team1IsTurn"))
				);
		Team team2 = new Team(request.getParameter("team2Name"), 
				Integer.valueOf(request.getParameter("team2Score").trim()), 
				Integer.valueOf(request.getParameter("team2Turn").trim()), 
				Boolean.parseBoolean(request.getParameter("team2IsWinner")), 
				Boolean.parseBoolean(request.getParameter("team2IsTurn"))
				);
		
		if(!team1.getIsTurn()) {
			team1.setScore(team1.getScore()+Integer.valueOf(request.getParameter("score")) );
			team1.setTurn(team1.getTurn()+1);
		}else if (!team2.getIsTurn()) {
			team2.setScore(team2.getScore()+Integer.valueOf(request.getParameter("score")) );
			team2.setTurn(team2.getTurn()+1);
		}
		
		if(team1.getScore() >50) {
			team1.setScore(team1.getScore() - 25 );
		}else if(team1.getScore()  == 50) {
			team1.setIsWinner(true);
		}
		
		if(team2.getScore() >50) {
			team2.setScore(team2.getScore() - 25 );
		}else if(team2.getScore()  == 50) {
			team2.setIsWinner(true);
		}
		
		request.setAttribute("team1", team1);
		request.setAttribute("team2", team2);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
		//doGet(request, response);
	}

}
