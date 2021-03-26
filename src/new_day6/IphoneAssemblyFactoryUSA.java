package new_day6;

public class IphoneAssemblyFactoryUSA {

    public static void main(String[] args) {

        PartsForIphoneFromMexico mexico = new PartsForIphoneFromMexico();
        mexico.screen();
        mexico.battery();
        mexico.chargingPort();

        iPhoneAssemblyLine();


    }

    static  void iPhoneAssemblyLine(){
        System.out.println("iPhone is being assembled in California");

    }

}
