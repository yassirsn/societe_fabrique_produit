import java.util.ArrayList;
import java.util.List;

public class Facture {
    private int numerofactur;
    private List<Produit> listproduit = new ArrayList<>();
    private boolean isPaye = false;
    private Commend cmd;
    private Client client;
    private Jour j;

    public int getNumerofactur() {
        return numerofactur;
    }

    public List<Produit> getListproduit() {
        return listproduit;
    }

    public boolean isPaye() {
        return isPaye;
    }

    public Commend getCmd() {
        return cmd;
    }

    public Client getClient() {
        return client;
    }

    public void setNumerofactur(int numerofactur) {
        this.numerofactur = numerofactur;
    }

    public void setListproduit(List<Produit> listproduit) {
        this.listproduit = listproduit;
    }

    public void setPaye(boolean paye) {
        isPaye = paye;
    }

    public void setCmd(Commend cmd) {
        this.cmd = cmd;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setJ(Jour j) {
        this.j = j;
    }

    public Jour getJ() {
        return j;
    }
}

