import java.util.ArrayList;
import java.util.List;

public class Client {
    private int numeroclient;
    private String nomclient;
    private List<Commend>  listcomand=new ArrayList<Commend>();
    private List<Facture>  listfactur=new ArrayList<>();

    public int getNumeroclient() {
        return numeroclient;
    }

    public void setNumeroclient(int numeroclient) {
        this.numeroclient = numeroclient;
    }

    public String getNomclient() {
        return nomclient;
    }

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }

    public List<Commend> getListcomand() {
        return listcomand;
    }

    public void setListcomand(List<Commend> listcomand) {
        this.listcomand = listcomand;
    }

    public List<Facture> getListfactur() {
        return listfactur;
    }

    public void setListfactur(List<Facture> listfactur) {
        this.listfactur = listfactur;
    }
}
