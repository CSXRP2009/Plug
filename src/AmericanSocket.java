public class AmericanSocket extends Socket {
    public AmericanSocket(int numHoles) {
        super(numHoles);
    }
    public String toString(){
        return "American socket with "+ getNumHoles() + " holes";
    }
}
