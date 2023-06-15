package SealedClasses;

final class Parent extends Family {

    // Constructors
    Parent(String familyName, String soulfood) {
        super(familyName, soulfood);
    }

    @Override
    void getSoulfood() {
        System.out.println(this.soulFood);
    }

    @Override
    public String printSoulFoodFamilyName() {
        return this.familyName + "_" + this.soulFood;
    }
}
