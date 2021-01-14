public class homePlant extends Plant{

    int potDiameterSm = 10;
    int potHeightSm = 10;

    public homePlant(String plantName) {
        super(plantName);
    }

        public homePlant(String plantName, int potDiameterSm, int potHeightSm) {
        super(plantName);

        this.potDiameterSm = potDiameterSm;
        this.potHeightSm = potHeightSm;
    }

    public  void displantTo(int newPotDiameter, int newPotHeight){
        this.potDiameterSm = newPotDiameter;
        this.potHeightSm = newPotHeight;

        System.out.println("You put " + plantName +
                " into the new pot " + potDiameterSm + " sm diameter and " + potHeightSm + " sm height");
    }

    public  int getPotDiameterSm(){
        return potDiameterSm;
    }

    public  int getPotHeightSm(){
        return potHeightSm;
    }

    public  void revealPotDimensions(){
        System.out.println(plantName + "'s pot has " +
                getPotDiameterSm() + " sm in diameter and " + getPotDiameterSm()+ " sm in height");
    }


    public  void water(int waterML){
        System.out.println("You watered " + plantName + " with " + waterML + " mL");
    }




}
