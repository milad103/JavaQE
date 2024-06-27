package mentoring3;

public class IPad implements Tablet {


    @Override
    public void touchScreen() {
        System.out.println("OLED type touchscreen");

    }

    @Override
    public void operatingSystem() {
        System.out.println("Apple iOS 14.3");

    }

    @Override
    public void rechargeableBattery() {
        System.out.println("up to 8 hours lithium rechargeable battery");

    }

    @Override
    public void rectangularShape() {
        System.out.println("rectangular shape is a must have design");

    }

    void frontandRearCamera(){
        System.out.println( "8 MP for front and 14 MP for the rear");

    }
    void appDownloadingStore(){
        System.out.println("Apple Store secure apps downloading");
    }
}
