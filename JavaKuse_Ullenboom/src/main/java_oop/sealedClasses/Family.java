package sealedClasses;

abstract sealed class Family permits Parent, Children {
    String familyName;
    String soulFood;

    // Constructors
    Family(String familyName, String soulFood) {
        this.familyName = familyName;
        this.soulFood = soulFood;
    }

    // Getters / Setters
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setSoulFood(String soulFood) {
        this.soulFood = soulFood;
    }

    abstract void getSoulfood();

    abstract String printSoulFoodFamilyName();

    public String toString() {
        return "Family{" +
                "familyName=" + this.familyName +
                ", soulfood=" + this.soulFood +
                "}";
    }

}
