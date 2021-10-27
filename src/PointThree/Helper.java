package PointThree;

public class Helper {
    private Human firstKid = new Kid();
    private Kid secondKid = new Kid();

    public String getKidName() {
        return firstKid.sayName();
    }

    public String getKidPlaysWithToys() {
        // This will not work, Human does not have playsWithToys() implemented.
        // return firstKid.playsWithToys();

        // This will work
        return secondKid.playsWithToys();
    }
}
