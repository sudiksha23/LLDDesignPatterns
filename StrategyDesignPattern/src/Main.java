//Can be implemented if you have 2 child classes with the same properties which are not there in the parent class.
// So both those children classes are redundant.
public class Main {

    public static void main(String[] args) {
        Vehicle sportVehile=new SportsVehicle();
        sportVehile.drive();

        Vehicle goodsVehicle=new GoodsVehicle();
        goodsVehicle.drive();

    }
}