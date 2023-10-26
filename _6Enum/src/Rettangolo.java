public class Rettangolo extends Forma {
    private int lato1;
    private int lato2;
    private TipoForma type;

    public Rettangolo(int lato1, int lato2,TipoForma type) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.type = type;

    }

    public int getLato1() {
        return lato1;
    }

    public int getLato2() {
        return lato2;
    }



    public int calcolaArea(){
        return lato1*lato2;
    }

    public TipoForma getType() {
        return type;
    }
}
