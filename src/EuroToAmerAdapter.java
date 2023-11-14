public class EuroToAmerAdapter {
    private EuropeanPlug euroPlug;
    private AmericanSocket amerSocket;

    public void connect(Plug plug, Socket socket){
        if (!(plug instanceof EuropeanPlug)){
            System.out.println("Must have a Euro plug for this adapter");
        }
        if (!(socket instanceof AmericanSocket )){
            System.out.println("Must have an American socket for this adapter");
        }
        if(plug instanceof EuropeanPlug && socket instanceof AmericanSocket) {
            euroPlug=(EuropeanPlug) plug;
            amerSocket= (AmericanSocket) socket;
            System.out.println("European plug has been connected to an American socket");
        }
    }
}
