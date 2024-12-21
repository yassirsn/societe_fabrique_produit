import java.util.ArrayList;
import java.util.List;

public class Salarie {
    private  int numeroSalrie;
    private String nomsalrie;
    private Double salary;

    public int getNumeroSalrie() {
        return numeroSalrie;
    }

    public void setNumeroSalrie(int numeroSalrie) {
        this.numeroSalrie = numeroSalrie;
    }

    private List<Emploier>  listemplouyer=new ArrayList<Emploier>();
    private List<Salarie> listeSalarie=new ArrayList<>();
    public String getNomsalrie() {
        return nomsalrie;
    }

    public void setNomsalrie(String nomsalrie) {
        this.nomsalrie = nomsalrie;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Salarie> getListeSalarie() {
        return listeSalarie;
    }

    public void setListeSalarie(List<Salarie> listeSalarie) {
        this.listeSalarie = listeSalarie;
    }

    public List<Emploier> getListemplouyer() {
        return listemplouyer;
    }

    public void setListemplouyer(List<Emploier> listemplouyer) {
        this.listemplouyer = listemplouyer;
    }
}
