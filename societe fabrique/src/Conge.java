public abstract class Conge {
    private Jour jourdebut;
    private Jour jourfin;
    private int numeroconge;

     int calculenbreconge()
    {

        return numeroconge;
    }
    public Jour getJourdebut() {
        return jourdebut;
    }

    public void setJourdebut(Jour jourdebut) {
        this.jourdebut = jourdebut;
    }

    public Jour getJourfin() {
        return jourfin;
    }

    public void setJourfin(Jour jourfin) {
        this.jourfin = jourfin;
    }

    public int getNumeroconge() {
        return numeroconge;
    }

    public void setNumeroconge(int numeroconge) {
        this.numeroconge = numeroconge;
    }
}
