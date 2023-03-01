package metier;

public class Postulant {
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	private String email;
	private String telephone;
	private String specialite;
	private String niveau;
	private String experiencepro;
	
	public Postulant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Postulant(String nom, String prenom, int age, String adresse, String email, String telephone,
			String specialite, String niveau, String experiencepro) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.specialite = specialite;
		this.niveau = niveau;
		this.experiencepro = experiencepro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getExperiencepro() {
		return experiencepro;
	}

	public void setExperiencepro(String experiencepro) {
		this.experiencepro = experiencepro;
	}

	@Override
	public String toString() {
		return "Postulant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse
				+ ", email=" + email + ", telephone=" + telephone + ", specialite=" + specialite + ", niveau="
				+ niveau + ", experiencepro=" + experiencepro + "]";
	}
	
	
	
	

}
