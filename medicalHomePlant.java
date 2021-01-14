public class medicalHomePlant extends homePlant{

    boolean isPoison = false;

    //constructors:

    public medicalHomePlant(String plantName) {
        super(plantName);
    }

    public medicalHomePlant(String plantName, int potDiameterSm, int potHeightSm) {
        super(plantName, potDiameterSm, potHeightSm);
    }

    public medicalHomePlant(String plantName, int potDiameterSm, int potHeightSm, boolean isPoison) {
        super(plantName, potDiameterSm, potHeightSm);
        this.isPoison = isPoison;
    }

    public  void cut(){
        System.out.println(plantName + " was cut for medical purposes");
    }

    public void setPoison(){
        this.isPoison = true;
        System.out.println(plantName + " is a poison!");
    }


}
