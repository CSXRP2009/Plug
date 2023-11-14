public class AmericanPlug extends Plug{

    public AmericanPlug(int numProngs) {
        super(numProngs);
    }
    public String toString(){
        return "American plug with "+ getNumProngs() + " prongs";
    }
}
