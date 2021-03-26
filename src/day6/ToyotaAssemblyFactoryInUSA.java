package day6;

//Toyota Factory/Assembly line in Texas, USA
public class ToyotaAssemblyFactoryInUSA {
    public static void main(String[] args) {


        Engine();

        PartsSupplierForToyotaInJapan j = new PartsSupplierForToyotaInJapan();
        j.Accessoriez();

        PartsSupplierForToyotaInJapan u = new PartsSupplierForToyotaInJapan();
        u.CarSeats();

        PartsSupplierForToyotaInJapan z = new PartsSupplierForToyotaInJapan();
        z.MainBody();


    }
        //Toyota Factory in Michigan, USA
        static void Engine(){
            System.out.println("This Factory in Michigan makes engines for Toyota");
        }



}
