public class Triangolo extends Forma{
    private int base;
    private int altezza;
    private TipoForma type;



    public Triangolo(int base, int altezza, TipoForma type) {
        this.base = base;
        this.altezza = altezza;
        this.type = type;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public int calcolaArea(){
        return (base*altezza)/2;
    }

    public TipoForma getType() {
        return type;
    }
}
