package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.IPostulant;
import metier.Postulant;
import metier.PostulantImpl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="controleur", urlPatterns = "*.php")
public class PostulantControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       IPostulant metier;
    
	@Override
	public void init() throws ServletException {
		metier = new PostulantImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/index.php")) {
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
			
		}else if(path.equals("/creation.php")){
			request.setAttribute("postulant", new Postulant());
			request.getRequestDispatcher("creation.jsp").forward(request, response);
			
		}else if(path.equals("/visualisercv.php")) {
			PostulantImpl po = new PostulantImpl();
			List<Postulant> p = new ArrayList<Postulant>();
			p = po.listPostulant();
			request.setAttribute("postulant", p);
			request.getRequestDispatcher("visualisercv.jsp").forward(request, response);
			
		}else if(path.equals("/supprimer.php")) {
			int id = Integer.parseInt(request.getParameter("id"));
			metier.delete(id);
			response.sendRedirect("visualisercv.php");
	}
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/ajouter.php")) {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			int age = Integer.parseInt(request.getParameter("age"));
			String adresse = request.getParameter("adresse");
			String email = request.getParameter("email");
			String telephone = request.getParameter("telephone");
			String specialite = request.getParameter("specialite");
			String niveau = request.getParameter("niveau");
			String experience = request.getParameter("experience");
			
			Postulant p = metier.addPostulant(new Postulant(nom, prenom, age, adresse, email, telephone, specialite, niveau, experience));
			request.setAttribute("postulant", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);


		}
	}

}
