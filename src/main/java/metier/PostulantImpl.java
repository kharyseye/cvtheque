package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostulantImpl implements IPostulant {

	@Override
	public Postulant addPostulant(Postulant p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement
					("INSERT INTO POSTULANT(NOM,PRENOM,AGE,ADRESSE,EMAIL,TELEPHONE,SPECIALITE,NIVEAU,EXPERIENCEPRO) VALUES(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getNom());
			ps.setString(2, p.getPrenom());
			ps.setInt(3, p.getAge());
			ps.setString(4, p.getAdresse());
			ps.setString(5, p.getEmail());
			ps.setString(6, p.getTelephone());
			ps.setString(7, p.getSpecialite());
			ps.setString(8, p.getNiveau());
			ps.setString(9, p.getExperiencepro());
			ps.executeUpdate();
			
			PreparedStatement ps2 = connection.prepareStatement
					("SELECT MAX(id) as MAXID FROM POSTULANT");
			ResultSet rs = ps2.executeQuery();
			if(rs.next()) {
				p.setId(rs.getInt("MAXID"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Postulant> listPostulant() {
		Connection connection = SingletonConnection.getConnection();
		List<Postulant> postulant = new ArrayList<Postulant>();
		
		try {
			PreparedStatement ps = connection.prepareStatement
					("SELECT * FROM POSTULANT ");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Postulant p = new Postulant();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				p.setAge(rs.getInt("age"));
				p.setAdresse(rs.getString("adresse"));
				p.setEmail(rs.getString("email"));
				p.setTelephone(rs.getString("telephone"));
				p.setSpecialite(rs.getString("specialite"));
				p.setNiveau(rs.getString("niveau"));
				p.setExperiencepro(rs.getString("experiencepro"));
				postulant.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return postulant;
	}

	@Override
	public Postulant updatePostulant(Postulant p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement
					("UPDATE POSTULANT SET NOM=?,PRENOM=?,AGE=?,ADRESSE=?,EMAIL=?,TELEPHONE=?,SPECIALITE=?,NIVEAU=?,EXPERIENCEPRO=?  WHERE ID=?");
			ps.setString(1, p.getNom());
			ps.setString(2, p.getPrenom());
			ps.setInt(3, p.getAge());
			ps.setString(4, p.getAdresse());
			ps.setString(5, p.getEmail());
			ps.setString(6, p.getTelephone());
			ps.setString(7, p.getSpecialite());
			ps.setString(8, p.getNiveau());
			ps.setString(9, p.getExperiencepro());
			ps.setInt(10, p.getId());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Postulant getPostulant(int id) {
		Connection connection = SingletonConnection.getConnection();
		Postulant p = new Postulant();
		try {
			PreparedStatement ps = connection.prepareStatement
					("SELECT * FROM POSTULANT WHERE ID=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				p.setAge(rs.getInt("age"));
				p.setAdresse(rs.getString("adresse"));
				p.setEmail(rs.getString("email"));
				p.setTelephone(rs.getString("telephone"));
				p.setSpecialite(rs.getString("specialite"));
				p.setNiveau(rs.getString("niveau"));
				p.setExperiencepro(rs.getString("experiencepro"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void delete(int id) {
		Connection connection = SingletonConnection.getConnection();
		Postulant p = new Postulant();
		try {
			PreparedStatement ps = connection.prepareStatement
					("DELETE FROM POSTULANT WHERE ID=?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
