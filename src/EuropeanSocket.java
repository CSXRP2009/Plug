public class EuropeanSocket extends Socket{
    public EuropeanSocket(int numHoles) {
        super(numHoles);
    }
    public String toString(){
        return "European socket with "+ getNumHoles() + " holes";
    }
}
