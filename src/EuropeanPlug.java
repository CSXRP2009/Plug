public class EuropeanPlug extends Plug {
    public EuropeanPlug(int numProngs) {
        super(numProngs);
    }
    public String toString(){
        return "European plug with "+ getNumProngs() + " prongs";
    }
}
