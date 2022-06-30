import java.sql.Date;
import java.util.ArrayList;

public class Client {
	private int idClient;
	private String nomClient;
	private String prenomClient;
	private Date dateNaissanceClient;
	private String adresseClient;
	private String telClient;
	private String mailClient;
	private String civilite;
	public static int nombreClient=0;
	private ArrayList<Compte> comptes = new ArrayList<Compte>();
	private ArrayList<DemandeCredit> credit = new ArrayList<DemandeCredit>();

	
	
	public int getIdClient() {
		return idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}
	
	public Date getDateNaissanceClient() {
		return dateNaissanceClient;
	}
	
	public String getAdresseClient() {
		return adresseClient;
	}
	
	public String getTelClient() {
		return telClient;
	}
	
	public String getMailClient() {
		return mailClient;	
	}
	
	public String getCivilite() {
		return civilite;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}	
	
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	
	public void setDateNaissanceClient(Date dateNaissanceClient) {
		this.dateNaissanceClient = dateNaissanceClient;
	}
	
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	
	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}
	
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	public Client() {
		nombreClient++;
	}
	
	
	
	
	
	public Client(int idClient, String nomClient, String prenomClient) {
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		nombreClient++;
	}

	public Client(int idClient, String nomClient, String prenomClient, Date dateNaissanceClient, String adresseClient, String telClient, String mailClient, String civilite) {
		this.idClient = idClient;
		this.nomClient =nomClient;
		this.prenomClient = prenomClient;
		this.dateNaissanceClient = dateNaissanceClient;
		this.adresseClient = adresseClient;
		this.telClient = telClient;
		this.mailClient = mailClient;
		this.civilite = civilite;
		nombreClient++;
	}
	
	public Client(int idClient, String nomClient, String prenomClient, Date dateNaissanceClient) {
		this.idClient = idClient;
		this.nomClient =nomClient;
		this.prenomClient = prenomClient;
		this.dateNaissanceClient = dateNaissanceClient;

		nombreClient++;
	}


	//Constructeur de copie
	public Client (Client c) {
		this.idClient = c.idClient;
		this.nomClient =c.nomClient;
		this.prenomClient = c.prenomClient;
		this.dateNaissanceClient = c.dateNaissanceClient;
		this.adresseClient = c.adresseClient;
		this.telClient = c.telClient;
		this.mailClient = c.mailClient;
		this.civilite = c.civilite;
		nombreClient++;
		//this = reference vers l'objet qui utilse la classe
	}
	
	public String toString() {
		   return idClient +"--" + nomClient +"--"+ prenomClient;
		}
	public boolean equals() {
		return idClient == idClient && nomClient == nomClient;
	}
	
	
	public void ajouterCompte(Compte c) {
		comptes.add(c);
	}
	public void afficherCompte() {
		for(Compte c: comptes) {
			System.out.println(c);
		}
		
	}	
	
	public void ajouterDemandeCredit(DemandeCredit dc) {
		credit.add(dc);
	}
	
	public void afficherDemandeCredit() {
		for(DemandeCredit dc: credit) {
			System.out.println(dc);
		}
	}
	
	
	public void afficher() {
		System.out.println("ID: " + idClient);
		System.out.println("Nom: " + nomClient);
		System.out.println("Prenom: " + prenomClient);
		System.out.println("Date de naissance client: " + dateNaissanceClient);
		System.out.println("Adresse client: " + adresseClient);
		System.out.println("Nombre de telephone client: " + telClient);
		System.out.println("Mail client: " + mailClient);
		System.out.println("Civilité: " + civilite);
		afficherCompte();
		afficherDemandeCredit();
	}
}

