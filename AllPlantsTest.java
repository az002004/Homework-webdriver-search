import org.testng.Assert;
import org.testng.annotations.Test;

public class AllPlantsTest {

    @Test
    public void test001Plant() {
        Plant myPlantOne = new Plant("Pine");

        myPlantOne.grow();

        myPlantOne.setAge(5.5F);

        myPlantOne.dead();

        System.out.println("Do you know the age of your plant?");
        System.out.println("Sure, it was " + myPlantOne.getPlantAgeInYears() + " years old");

        int enoughAgeForPlant = 5;

        if (myPlantOne.getPlantAgeInYears() > enoughAgeForPlant) {
            System.out.println("It's Ok for such an old plant to die, sorry");
        } else {
            System.out.println("Your " + myPlantOne.plantName + " was so young, sorry!");
        }

        Assert.assertTrue(myPlantOne.getPlantAgeInYears() > enoughAgeForPlant);
    }

    @Test
    public void test002HomePlant() {
        homePlant myHomePlantTwo = new homePlant("Cactus");

        myHomePlantTwo.grow();

        myHomePlantTwo.revealPotDimensions(); //default

        myHomePlantTwo.displantTo(15, 15);
        myHomePlantTwo.revealPotDimensions();

        Assert.assertTrue(myHomePlantTwo.plantName == "Cactus");
    }

    @Test
    public void test003MedicalHomePlant() {
        medicalHomePlant myMedicalHomePlantThree = new medicalHomePlant("Aloe");

        myMedicalHomePlantThree.revealPotDimensions(); // from homePlant

        myMedicalHomePlantThree.cut(); // from medicalHomePlant

        myMedicalHomePlantThree.setAge(6); // from Plant

        myMedicalHomePlantThree.setPoison(); // from medicalHomePlant

        Assert.assertTrue(myMedicalHomePlantThree.isPoison == false);
    }
}
