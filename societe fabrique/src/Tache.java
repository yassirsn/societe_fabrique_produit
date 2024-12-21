import java.util.ArrayList;
import java.util.List;

public class Tache {
    private int  numTache;
    private List<Tache> listTache=new ArrayList<>();
    private List<Produit> listProduit=new ArrayList<>();

    public int getNumTache() {
        return numTache;
    }

    public void setNumTache(int numTache) {
        this.numTache = numTache;
    }

    public List<Tache> getListTache() {
        return listTache;
    }

    public List<Produit> getListProduit() {
        return listProduit;
    }

    public void setListProduit(List<Produit> listProduit) {
        this.listProduit = listProduit;
    }

    public void setListTache(List<Tache> listTache) {
        this.listTache = listTache;
    }
}
