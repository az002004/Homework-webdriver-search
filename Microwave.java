public class Microwave {
    int maxWatt;
    String mColor;
    int capacity;

    public Microwave(String color) {
        mColor = color;
    }

    public Microwave(){     //nothing inside but {} needed

    }

    public void warmFood() {
        System.out.println("Your food is now warm");
    }

    public void unfreezeFood() {
        System.out.println("Your food unfreezed");
    }

    public void setTime(int workingTimeInSec) {
        System.out.println("Time was set up to " + workingTimeInSec + " seconds");
    }


}


