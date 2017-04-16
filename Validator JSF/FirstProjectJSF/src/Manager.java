import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

/**
 * Created by zguindouos on 06/03/17.
 */
@ManagedBean
public class Manager {

    private String nom;
    private String prenom;
    private String adresse;
    private String password;
    private double montant;
    private ArrayList<Manager> mList = new ArrayList<Manager>();

    public ArrayList<Manager> getmList() {
        return mList;
    }

    public void setmList(ArrayList<Manager> mList) {
        this.mList = mList;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPassword() {
        return password;
    }

    public double getMontant() {
        return montant;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Manager() {}

    public Manager(String nom, String prenom, String adresse, String password, double montant) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.password = password;
        this.montant = montant;
    }

    public void addManager() {
        mList.add(new Manager(this.nom, this.prenom, this.adresse, this.password, this. montant));
    }

    public void printManagers() {

    }

}
