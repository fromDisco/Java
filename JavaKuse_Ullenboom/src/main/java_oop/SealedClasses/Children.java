package SealedClasses;

/**
 * non-sealed makes sublasses of this class possible
 * while Parent.class doesn't know about them.
 * So, Parent.class still as defined number of children
 */
non-sealed class Children extends Family {
    // Constructors
    Children(String familyName, String soulfood) {
        super(familyName, soulfood);
    }

    @Override
    void getSoulfood() {
        System.out.println(this.soulFood);
    }

    @Override
    public String printSoulFoodFamilyName() {
        return this.soulFood + "_" + this.familyName;
    }
}
