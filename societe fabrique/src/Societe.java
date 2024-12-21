import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Societe implements ISociete{
    private int refsociete;
    private Usine usine;
    private List<Emploier> listeEmploier=new ArrayList<Emploier>();
    private List<Produit>  ListeProduit = new ArrayList<>();
    private List<Client> Listeclient = new ArrayList<>();
    private List<Commend> ListeCommend = new ArrayList<>();
    private Map<Integer,Commend> listcommendrecues = new HashMap<Integer, Commend>() ;
    private List<Conge>  listConge = new ArrayList<>();
    private List<Client> listeemployerarriveinconger = new ArrayList<>();
    private List<Salarie> ListeSalarie = new ArrayList<>();

    public List<Salarie> getListeSalarie() {
        return ListeSalarie;
    }

    public void setListeSalarie(List<Salarie> listeSalarie) {
        ListeSalarie = listeSalarie;
    }

    public List<Commend> getListeCommend() {
        return ListeCommend;
    }

    public void setListeCommend(List<Commend> listeCommend) {
        ListeCommend = listeCommend;
    }

    public Map<Integer,Commend> getListcommendrecues() {
        return listcommendrecues;
    }

    public void setListcommendrecues(Map<Integer,Commend> listcommendrecues) {
        this.listcommendrecues = listcommendrecues;
    }

    public List<Conge> getListConge() {
        return listConge;
    }

    public void setListConge(List<Conge> listConge) {
        this.listConge = listConge;
    }

    public List<Client> getListeemployerarriveinconger() {
        return listeemployerarriveinconger;
    }

    public void setListeemployerarriveinconger(List<Client> listeemployerarriveinconger) {
        this.listeemployerarriveinconger = listeemployerarriveinconger;
    }

    public int getRefsociete() {
        return refsociete;
    }

    public void setRefsociete(int refsociete) {
        this.refsociete = refsociete;
    }

    public Usine getUsine() {
        return usine;
    }

    public void setUsine(Usine usine) {
        this.usine = usine;
    }

    public List<Emploier> getListeEmploier() {
        return listeEmploier;
    }

    public void setListeEmploier(List<Emploier> listeEmploier) {
        this.listeEmploier = listeEmploier;
    }

    public List<Produit> getListeProduit() {
        return ListeProduit;
    }

    public void setListeProduit(List<Produit> listeProduit) {
        ListeProduit = listeProduit;
    }

    public List<Client> getListeclient() {
        return Listeclient;
    }

    public void setListeclient(List<Client> listeclient) {
        Listeclient = listeclient;
    }



    @Override
    public Client consulterClientParNumer(int num) {
        Client temp=null;
        for(Client client :listeclient){
            if(client.getNumeroclient()==num){
                temp=client;
                break;
            }
        }
        return temp;
    }

    @Override
    public Client consulterClientNomClient(String nomclient) {
        Client temp=null;
        for(Client client :listeclient){
            if(client.getNomclient()==nomclient){
                temp=client;
                break;
            }
        }
        return temp;

    }

    @Override
    public List<Client> consulterListClient() {
        return listeclient;
    }

    @Override
    public Salarie consulterSalarieParNumerosalarie(int numerosalarie) {
        Salarie temp=null;
        for(Salarie salarie : ListeSalarie){
            if(salarie.getNumeroSalrie()==temp.getNumeroSalrie()){
                temp=salarie;
                break;
            }
        }
        return temp;
    }

    @Override
    public List<Salarie> consulterListSalarie() {
        return ListeSalarie;
    }

    @Override
    public double consulterSalarieTotaletouslessalaries() {
        double totalToutSalarie=0;

         for(Salarie salarie : ListeSalarie){
          totalToutSalarie=totalToutSalarie+salarie.getSalary();
         }
        return totalToutSalarie;
    }

    @Override
    public Map<Integer, Commend> consulterlistecommendrecues() {
        return listcommendrecues;
    }

    @Override
    public Commend consultercomendparnumerocommend(int numcommend) {
        Commend temp=null;
        for(Commend cmd : listecommend){
            if(cmd.getNumerocommand() ==numcommend){
                temp=cmd;
                break;
            }
        }
        return temp;
    }

    @Override
    public List<Emploier> consulterListemployer(Usine usine) {
        List<Emploier> temp=null;
        for(Usine usine1:listusin){
            if(usine1==usine){
                temp= usine1.getListemployer();
            }
        }
        return temp;
    }

    @Override
    public List<TacheJOUR> consulterListTachejour(Usine usine, Emploier emploier) {
        Emploier temp=null;
        for (Emploier emp: usine.getListemployer()){
            if(emp.getNumeroompoyer()==emploier.getNumeroompoyer()){
                temp=emp;
            }
        }
        return temp.getListtachejour();
    }

    @Override
    public List<TacheMons> consulterlistTachemoins(Usine usine, Emploier emploier) {
        Emploier temp=null;
        for (Emploier emp: usine.getListemployer()){
            if (emp.getNumeroompoyer()==emploier.getNumeroompoyer()){
                temp=emp;
            }
        }
        return temp.getListtachemons();
    }

    @Override
    public List<Tache> consulterListTacheparemployer(Usine usine, Emploier emploier) {
        Emploier temp=null;
        for(Emploier emp: usine.getListemployer()){
            if(emp.getNumeroompoyer()==emploier.getNumeroompoyer()){
                temp=emp;
                break;
            }
        }
        return temp.getListtache();
    }

    @Override
    public int consulterNombreTotalTachEffectuerparEmploye(Usine usine, Emploier emploier) {
        Emploier temp=null;
        for (Emploier emp: usine.getListemployer()){
            if (emp.getNumeroompoyer()==emploier.getNumeroompoyer()){
                temp=emp;
                break;
            }
        }
        int i=temp.getListtache().size();
        return i ;
    }

    @Override
    public double PrixTotaleProduit(Client client) {
        double prixTotal=0;
        Commend cmdtemp =null ;
        Client client1 = null;
        for(Client client2:listeclient){
            if(client2.getNumeroclient()==client.getNumeroclient()) {
                client1=client2;
                break;
            }
        }
        client1.getListcomand();
        for(Commend cmd : client1.getListcomand()){
            cmd.getListproduit();
            for(int i=0;i<cmd.getListproduit().size();i++){
                prixTotal+=cmd.getListproduit().get(i).getPrix();
            }
        }

        return prixTotal;
    }

    @Override
    public int NombreTotalEmployes(Usine usine) {

        return usine.getListemployer().size();
    }

    @Override
    public int NombreTotaldesTachEffectueeParTousLesEmployes(Usine usine) {
        int nbrTotalTache=0;
        for(Emploier emp : usine.getListemployer()){
            nbrTotalTache+=emp.getListtache().size();
        }
        return nbrTotalTache;
    }

    @Override
    public int NombreTotaldesTachJourEffectueeParTousLesEmployes(Usine usine) {
        int nbrtoutale=0;
        for(Emploier emp : usine.getListemployer()){
            nbrtoutale+=emp.getListtachejour().size();
        }
        return nbrtoutale;
    }

    @Override
    public int NombreTotaldesTachMoisEffectueeParTousLesEmployes(Usine usine) {
        int nbrtoutale=0;
        for(Emploier emp : usine.getListemployer()){
            nbrtoutale+=emp.getListtachemons().size();
        }
        return nbrtoutale;
    }

    @Override
    public int DureeTootalCongeeParEmploye(Usine usine, Emploier emploier) {
        int dureeTotalconge=0;
        Emploier empt=null;
        for (Emploier emp : usine.getListemployer()) {
            if(emp.getNumeroompoyer()==emploier.getNumeroompoyer()){
                empt=emploier;
            }
        }
        empt.getListtachejour();
        for(Conge conge:empt.getListconge()){
            dureeTotalconge+=conge.calculenbreconge();
        }
        return dureeTotalconge;
    }

    @Override
    public int TotaleDesEmployeEnCongeMaladie(Usine usin) {

        return usin.getListemployer().size();
    }

    @Override
    public int TotaleDesEmployeEnAccidentTravail(Usine usine) {
        return usine.getListemployerenacciden().size();
    }

    @Override
    public int TotalDesCommendEffectueParClient(Client client) {
        return client.getListcomand().size();
    }

    @Override
    public List<Facture> consulterListFactureClient(Client client) {
        return client.getListfactur();
    }

    @Override
    public List<Facture> consulterListFacturePayee(Client client) {
        List<Facture> listefacturepaye=new ArrayList<>();
        for (Facture facture : client.getListfactur()) {
            if (facture.isPaye()==true) {
                listefacturepaye.add(facture);
            }
        }
        return listefacturepaye;
    }

    @Override
    public List<Facture> consulterListFactureNonPayee(Client client) {
        List<Facture> listefacturenonpaye=new ArrayList<>();
        for (Facture facture : client.getListfactur()) {
            if (facture.isPaye()==false) {
                listefacturenonpaye.add(facture);
            }
        }
        return listefacturenonpaye;
    }

    public  void fabriquer(Commend cmd) {
        this.getListeEmploier();
        List<Emploier> listemployepasentravaill = new ArrayList<>();
        distrubuertache(cmd,listemployepasentravaill);
    }
    public void distrubuertache(Commend cmd,List<Emploier> listemployepasentravaill) {
        Tache tache = new Tache();
        TacheMons tachemons= new TacheMons();
        TacheJOUR tachejour = new TacheJOUR();
        int i=0;
        Produit produit = null;
        List<Produit> listProduitAfabrique=cmd.getListproduit();
        if(listemployepasentravaill.size()==listProduitAfabrique.size()){
            for (Emploier emp : listemployepasentravaill) {
                emp.getListtache().add(tache);
                produit= listProduitAfabrique.get(i);
                tache.getListProduit().add(produit);
                i++;

            }
        }
        if (listProduitAfabrique.size()>10) {
            for(Emploier emp : listemployepasentravaill){
                emp.getListtachemons().add(tachemons);
                emp.getListtache().add(tachemons);
                produit= listProduitAfabrique.get(i);
                tachemons.getListProduit().add(produit);
                i++;
            }

        }
        if (listProduitAfabrique.size()<10){
            for (Emploier emp : listemployepasentravaill) {
                emp.getListtachejour().add(tachejour);
                emp.getListtache().add(tachejour);
                produit= listProduitAfabrique.get(i);
                tache.getListProduit().add(produit);
                i++;

            }
        }
        if(listProduitAfabrique.size()==listemployepasentravaill.size()){
            for (int j = 1; j <listemployepasentravaill.size()-1; j++) {
                Emploier emp = listemployepasentravaill.get(j);
                emp.getListtache().add(tache);
                produit= listProduitAfabrique.get(i);
                tache.getListProduit().add(produit);
                i++;
            }
        }
    }
    public void demanderConge(Jour jourdebut,Jour jourfin,Chefequipe chefequipe) {
        Conge conge=null ;


    }
}

