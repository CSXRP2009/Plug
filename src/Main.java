public class Main {
    public static void main(String[] args) {
       Plug amerPlug = new AmericanPlug(3);
       Plug euroPlug = new EuropeanPlug(2);
       Socket amerSocket = new AmericanSocket(3);
       Socket euroSocket = new EuropeanSocket(2);

       System.out.println(amerPlug);
       System.out.println(euroPlug);
       System.out.println(amerSocket);
       System.out.println(euroSocket);

       AmerToEuroAdapter adapter1 = new AmerToEuroAdapter();
       EuroToAmerAdapter adapter2 = new EuroToAmerAdapter();

       adapter1.connect(amerPlug, euroSocket);
       adapter2.connect(euroPlug,amerSocket);

       adapter1.connect(euroPlug, amerSocket);
       adapter2.connect(amerPlug,euroSocket);
    }
}