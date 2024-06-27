package mentoring2;



public class ToyotaAssemblyFactoryInUSA {
    public static void main(String[] args){

        PartsSupplierForToyotaInJapan refer = new PartsSupplierForToyotaInJapan();
        refer.MainBody();
        refer.CarSeats();
        refer.Accessories();

        Engine();


    }
    // in USA
    static void Engine(){

        System.out.println("This Factory makes Engines");
    }


}
