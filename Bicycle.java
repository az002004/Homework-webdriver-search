public class Bicycle {

    int numberOfWheels;
    float speed;
    boolean hasBasket = false;
    String bikeColor;

        // constructor-1:
    public Bicycle(int wheelsParameter) {
        numberOfWheels = wheelsParameter;
    }

    // methods:

    public void ride(){
        System.out.println("Now moving");
    }

    public  void changeSpeedTo(float newSpeed){
        setSpeed(newSpeed);
        System.out.println("Speed has been changed to  " + getSpeed() + " mph");

    }

    public void setSpeed(float currentSpeed) {
        speed = currentSpeed;
    }



    public void stop(){
        System.out.println("Bicycle stopped");

    }

    public void carryLuggage(){
        System.out.println("Bicycle has basket and can carry luggage");

    }

    public int getHowManyWheels() {
        return numberOfWheels;
    }

    public void setColor(String currentColor) {
        bikeColor = currentColor;
    }

    public void setBasket(boolean actualBasket) {
        hasBasket = actualBasket;
    }

    public boolean getBasket() {
        return hasBasket;
    }

    public String getColor() {
        return bikeColor;
    }

    public float getSpeed() {
        return speed;
    }
}
