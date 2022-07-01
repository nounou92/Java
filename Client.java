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
	