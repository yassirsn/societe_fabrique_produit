import java.util.ArrayList;
import java.util.List;

public class Produit {
    private int  numeroproduit;
    private int prix;
    private List<Produit> listproduits=new ArrayList<Produit>();

    public int getNumeroproduit() {
        return numeroproduit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setNumeroproduit(int numeroproduit) {
        this.numeroproduit = numeroproduit;
    }

    public List<Produit> getListproduits() {
        return listproduits;
    }

    public void setListproduits(List<Produit> listproduits) {
        this.listproduits = listproduits;
    }
}
