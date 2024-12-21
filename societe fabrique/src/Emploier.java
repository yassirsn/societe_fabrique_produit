import java.util.ArrayList;
import java.util.List;

public class Emploier {
    private int numeroompoyer;
    private String nomemploye;
    private Usine usine;
    private double salaire;
    private boolean Is_Working=false;

    private List<Produit> listproduits = new ArrayList<Produit>();
    private List<Tache> listtache = new ArrayList<>();
    private List<TacheMons> listtachemons = new ArrayList<>();
    private List<TacheJOUR> listtachejour = new ArrayList<>();
    private List<Conge> listconge = new ArrayList<>();
    private List<CongeMaladi> listcongemaladi = new ArrayList<>();

    public Usine getUsine() {
        return usine;
    }

    public void setUsine(Usine usine) {
        this.usine = usine;
    }

    public List<CongeMaladi> getListcongemaladi() {
        return listcongemaladi;
    }

    public void setListcongemaladi(List<CongeMaladi> listcongemaladi) {
        this.listcongemaladi = listcongemaladi;
    }

    public int getNumeroompoyer() {
        return numeroompoyer;
    }

    public void setNumeroompoyer(int numeroompoyer) {
        this.numeroompoyer = numeroompoyer;
    }

    public String getNomemploye() {
        return nomemploye;
    }

    public void setNomemploye(String nomemploye) {
        this.nomemploye = nomemploye;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public boolean isIs_Working() {
        return Is_Working;
    }

    public void setIs_Working(boolean is_Working) {
        Is_Working = is_Working;
    }

    public List<Produit> getListproduits() {
        return listproduits;
    }

    public void setListproduits(List<Produit> listproduits) {
        this.listproduits = listproduits;
    }

    public List<Tache> getListtache() {
        return listtache;
    }

    public void setListtache(List<Tache> listtache) {
        this.listtache = listtache;
    }

    public List<TacheMons> getListtachemons() {
        return listtachemons;
    }

    public void setListtachemons(List<TacheMons> listtachemons) {
        this.listtachemons = listtachemons;
    }

    public List<TacheJOUR> getListtachejour() {
        return listtachejour;
    }

    public void setListtachejour(List<TacheJOUR> listtachejour) {
        this.listtachejour = listtachejour;
    }

    public List<Conge> getListconge() {
        return listconge;
    }

    public void setListconge(List<Conge> listconge) {
        this.listconge = listconge;
    }
}
