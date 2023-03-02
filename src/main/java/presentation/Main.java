package presentation;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import metier.Postulant;
import metier.PostulantImpl;
import metier.SingletonConnection;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Connection con = SingletonConnection.getConnection(); if(con != null) {
		 * System.out.println("connexion etablie"); }else {
		 * System.out.println("echec de la connexion"); }
		 */

		PostulantImpl p = new PostulantImpl();
		
//AJOUTER UN POSTULANT
		
		/*
		 * Postulant p1 = p.addPostulant(new Postulant("diagne", "malick",
		 * 45,"Grand Yoff", "malickdiagne@gmail.fr", "769800321", "Gardien",
		 * "bfem","gardien waytocall")); Postulant p2 = p.addPostulant(new
		 * Postulant("lo", "astou", 65, "Keur Massar", "doumdoum@gmail.com","709877654",
		 * "Caissiere", "bac+1", "Caissiere CBAO")); System.out.println(p1.toString());
		 * System.out.println(p2.toString());
		 */
		 

//MODIFIER UN POSTULANT
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("saisir l'ID du Postulant :"); int id =
		 * Integer.parseInt(scan.nextLine()); System.out.println("saisir le nom :");
		 * String nom = scan.nextLine(); System.out.println("saisir le prenom :");
		 * String prenom = scan.nextLine(); System.out.println("saisir l'age :"); int
		 * age = Integer.parseInt(scan.nextLine());
		 * System.out.println("saisir l'adresse :"); String adresse = scan.nextLine();
		 * System.out.println("saisir le email :"); String email = scan.nextLine();
		 * System.out.println("saisir le telephone :"); String telephone =
		 * scan.nextLine(); System.out.println("saisir le specialite :"); String
		 * specialite = scan.nextLine(); System.out.println("saisir le niveau :");
		 * String niveau = scan.nextLine();
		 * System.out.println("saisir le experiencepro :"); String experiencepro =
		 * scan.nextLine();
		 * 
		 * Postulant pos = new Postulant(); pos.setId(id); pos.setNom(nom);
		 * pos.setPrenom(prenom); pos.setAge(age); pos.setAdresse(adresse);
		 * pos.setEmail(email); pos.setTelephone(telephone);
		 * pos.setSpecialite(specialite); pos.setNiveau(niveau);
		 * pos.setExperiencepro(experiencepro); p.updatePostulant(pos); if(id!=0) {
		 * System.out.println(pos.toString());
		 * 
		 * }
		 */
		 
//OBTENIR UN PRODUIT
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("saisir l'ID :");
		 * int id = Integer.parseInt(scan.nextLine()); Postulant po = new Postulant();
		 * po=p.getPostulant(id); System.out.println(po.toString());
		 */
		 
//SUPPRIMER UN PRODUIT
	
		/*
		 * Postulant po = new Postulant(); Scanner scan = new Scanner(System.in);
		 * System.out.println("saisir l'ID :"); int id =
		 * Integer.parseInt(scan.nextLine()); p.delete(id);
		 * System.out.println("Postulant supprimé!");
		 */
		 
//AFFICHER UNE LISTE
		
		/*
		 * System.out.println("lister les CV"); List<Postulant> postulant =
		 * p.listPostulant(); for(Postulant po : postulant) {
		 * System.out.println(po.toString()); }
		 */
}

}
