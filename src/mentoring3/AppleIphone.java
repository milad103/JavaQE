package mentoring3;

public abstract class AppleIphone implements CellPhone {

    @Override
    public void cellular() {
        System.out.println("uses cell towers to make phone calls");

    }

    @Override
    public void textMessaging() {
        System.out.println("text messaging for communication and authentication");

    }

    @Override
    public void mobility() {
        System.out.println("make phone calls from anywhere wherever service is available");

    }

    void AIcamera(){
        System.out.println("AI 360 degree camera");
    }
    abstract void BrandName();

}
