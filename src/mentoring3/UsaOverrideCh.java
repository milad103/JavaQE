package mentoring3;

public class UsaOverrideCh  extends CanadaOverrideP{


    void citizenShip(){

        System.out.println("Green Card holders can apply for citizenship after 5 years");
    }


    void canadianLaw(){

        super.citizenShip();
    }

    public static void main(String[] args) {
        UsaOverrideCh usa =new UsaOverrideCh();
        usa.citizenShip();
        usa.canadianLaw();
    }
}
