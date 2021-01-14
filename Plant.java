public class Plant {

    String plantName;
    float plantAgeInYears;

    public Plant(String plantName) {
        this.plantName = plantName;
    }

    public  void grow(){
        System.out.println("Your have new plant, it's " + plantName + "!");
    }

    public void dead(){
        System.out.println(plantName + " is dead");
    }

    public void setAge(float currentAge){
        this.plantAgeInYears = currentAge;
        System.out.println(plantName + " is " + currentAge + " years old now");
    }

    public float getPlantAgeInYears(){
        return plantAgeInYears;
    }


}
