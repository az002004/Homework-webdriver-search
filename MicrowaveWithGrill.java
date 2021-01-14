public class MicrowaveWithGrill extends Microwave {
    boolean hasGrill;

    public MicrowaveWithGrill(String color) {
        mColor = color;
    }

    public MicrowaveWithGrill() {

    }

    public void grill(){
        System.out.println("Food grilled");
    }

    public void setColor(String currentColor){
        mColor = currentColor;
    }


}
