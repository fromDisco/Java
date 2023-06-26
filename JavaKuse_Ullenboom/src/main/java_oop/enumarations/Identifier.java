package enumarations;

public enum Identifier {
    STAR("\u2735"),
    FOUR_RHOMBS("\u2755");

    private final String SIGN;

    // constructor creates enum object with Star, or FOUR_RHOMBS char as value
    Identifier(String sign) {
        this.SIGN = sign;
    }

    public String getSIGN() {
        return this.SIGN;
    }
}
