import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface ISociete {
    public int numerosociete = 0;
    public List<Client> listeclient=new ArrayList<>();
    public List<Commend> listecommend=new ArrayList<>();
    public List<Conge> listeconge = new ArrayList<>();
    public List<Emploier> listemployer =new ArrayList<>();
    public List<Usine> listusin=new ArrayList<>();
    public Client consulterClientParNumer(int num);
    public Client consulterClientNomClient(String nomclient);
    public List<Client> consulterListClient();
    public Salarie consulterSalarieParNumerosalarie(int numerosalarie);
    public List<Salarie> consulterListSalarie();
    public double consulterSalarieTotaletouslessalaries();
    public Map<Integer,Commend> consulterlistecommendrecues();
    public Commend consultercomendparnumerocommend(int numcommend);
    public List<Emploier> consulterListemployer(Usine usine);
    public List<TacheJOUR> consulterListTachejour(Usine usine,Emploier emploier);
    public  List<TacheMons> consulterlistTachemoins(Usine usine,Emploier emploier);
    public  List<Tache> consulterListTacheparemployer(Usine usine,Emploier emploier);
    public int consulterNombreTotalTachEffectuerparEmploye(Usine usine,Emploier emploier);
    public double PrixTotaleProduit(Client client);
    public int NombreTotalEmployes(Usine usine);
    public int NombreTotaldesTachEffectueeParTousLesEmployes(Usine usine);
    public int NombreTotaldesTachJourEffectueeParTousLesEmployes(Usine usine);
    public int NombreTotaldesTachMoisEffectueeParTousLesEmployes(Usine usine);
    public int DureeTootalCongeeParEmploye(Usine usine,Emploier emploier);
    public int TotaleDesEmployeEnCongeMaladie(Usine usin);
    public int TotaleDesEmployeEnAccidentTravail(Usine usine);
    public int TotalDesCommendEffectueParClient(Client client);
    public List<Facture>  consulterListFactureClient(Client client);
    public List<Facture> consulterListFacturePayee(Client client);
    public List<Facture>  consulterListFactureNonPayee(Client client);

}
