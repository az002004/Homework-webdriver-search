import org.testng.Assert;
import org.testng.annotations.Test;

public class BicycleTest {

    @Test
    public void testB001() {
        Bicycle myBicycleOne = new Bicycle(2);

        myBicycleOne.carryLuggage();

        int actualNumberOfWeels = myBicycleOne.getHowManyWheels();

        Assert.assertTrue(actualNumberOfWeels == 2);
    }

    @Test
    public void testB002() {
        Bicycle bicycle_01 = new Bicycle(2);
        Bicycle bicycle_02 = new Bicycle(3);

        bicycle_01.setColor("blue");
        bicycle_02.setColor("red");

        //bicycle_01.setBasket(true);
        bicycle_02.setBasket(true);


        if (bicycle_01.getBasket()){
            System.out.println("You can go shopping on " + bicycle_01.getColor() + " bike with " + bicycle_01.getHowManyWheels() + " wheels ");
        } else {
            System.out.println("Sorry, " + bicycle_01.getColor() + " bike is a wrong bike for shopping!");
        }

        boolean canShopGrocery_02 = bicycle_02.getBasket();

        if (canShopGrocery_02){
            System.out.println("You can go shopping on " + bicycle_02.getColor() + " bike with " + bicycle_02.getHowManyWheels() + " wheels ");
        } else {
            System.out.println("Sorry, " + bicycle_02.getColor() + " bike is a wrong bike for shopping!");
        }

        Assert.assertTrue(bicycle_01.getBasket() && bicycle_02.getBasket()); //if any bike is suitable for shopping
    }

    @Test
    public void test003Speed() {
        Bicycle bicycleToMove= new Bicycle(2);

        bicycleToMove.setSpeed(12);

        float distanceToShop = 8;

        float time = distanceToShop / bicycleToMove.getSpeed();

        System.out.println("You need " + time + " hours to get to the shop");

        Assert.assertTrue(time == 0.5);

    }
}
