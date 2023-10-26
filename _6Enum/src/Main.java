public class Main {
    public static void main(String[] args) {
        Rettangolo rett = new Rettangolo(3,4,TipoForma.RETTANGOLO);
        Triangolo triang = new Triangolo(3,4, TipoForma.TRIANGOLO);

        System.out.println(rett.getType());
        System.out.println("Base: "+ rett.getLato1() +", altezza: "+ rett.getLato2());
        System.out.println("Area= " + rett.calcolaArea());
        System.out.println();
        System.out.println(triang.getType());
        System.out.println("Base: "+ triang.getBase() +", altezza: "+ triang.getAltezza());
        System.out.println("Area= " + triang.calcolaArea());


    }
}