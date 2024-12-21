import java.util.ArrayList;
import java.util.List;

public class Commend {
    private static int numerocommand;
    private Client client;
    private List<Commend> listcommand=new ArrayList<>();
    private List<Produit> listproduit=new ArrayList<>();


    public static int getNumerocommand() {
        return numerocommand;
    }

    public static void setNumerocommand(int numerocommand) {
        Commend.numerocommand = numerocommand;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Commend> getListcommand() {
        return listcommand;
    }

    public void setListcommand(List<Commend> listcommand) {
        this.listcommand = listcommand;
    }

    public List<Produit> getListproduit() {
        return listproduit;
    }

    public void setListproduit(List<Produit> listproduit) {
        this.listproduit = listproduit;
    }
}
