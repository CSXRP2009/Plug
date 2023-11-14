public class AmerToEuroAdapter {
    private AmericanPlug amerPlug;
    private EuropeanSocket euroSocket;

    public void connect(Plug plug, Socket socket){
        if (!(plug instanceof AmericanPlug)){
            System.out.println("Must have a American plug for this adapter");
        }
        if (!(socket instanceof EuropeanSocket )){
            System.out.println("Must have an Euro socket for this adapter");
        }
        if(plug instanceof AmericanPlug && socket instanceof EuropeanSocket) {
            amerPlug=(AmericanPlug) plug;
            euroSocket= (EuropeanSocket) socket;
            System.out.println("American plug has been connected to an European socket");
        }
    }
}
