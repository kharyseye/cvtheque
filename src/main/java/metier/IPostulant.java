package metier;

import java.util.List;

public interface IPostulant {
	
	public Postulant addPostulant(Postulant p);
	public List<Postulant> listPostulant();
	public Postulant updatePostulant(Postulant p);
	public Postulant getPostulant(int id);
	public void  delete(int id);

}
