import java.util.ArrayList;
import java.util.List;

public class Usine {
    private int numusin;
    private List<Emploier> listemployer=new ArrayList<Emploier>();
    private List<Emploier> listemployerenconger=new ArrayList<>();
    private List<Emploier> listemployerencongermaladie=new ArrayList<>();
    private List<Emploier> listemployerenacciden=new ArrayList<>();
    private List<Produit> liseProduit=new ArrayList<>();

    public List<Emploier> getListemployerenacciden() {
        return listemployerenacciden;
    }

    public void setListemployerenacciden(List<Emploier> listemployerenacciden) {
        this.listemployerenacciden = listemployerenacciden;
    }

    public List<Emploier> getListemployerencongermaladie() {
        return listemployerencongermaladie;
    }

    public void setListemployerencongermaladie(List<Emploier> listemployerencongermaladie) {
        this.listemployerencongermaladie = listemployerencongermaladie;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    private Societe societe;
    public Usine(List<Emploier> listemployer) {
        this.listemployer = listemployer;
    }

    public List<Produit> getLiseProduit() {
        return liseProduit;
    }

    public void setLiseProduit(List<Produit> liseProduit) {
        this.liseProduit = liseProduit;
    }

    public int getNumusin() {
        return numusin;
    }

    public void setNumusin(int numusin) {
        this.numusin = numusin;
    }

    public List<Emploier> getListemployer() {
        return listemployer;
    }

    public void setListemployer(List<Emploier> listemployer) {
        this.listemployer = listemployer;
    }

    public List<Emploier> getListemployerenconger() {
        return listemployerenconger;
    }

    public void setListemployerenconger(List<Emploier> listemployerenconger) {
        this.listemployerenconger = listemployerenconger;
    }
}
