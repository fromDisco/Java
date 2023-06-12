package Enumarations;

public enum Identifier {
    STAR("\u2735"),
    FOUR_RHOMBS("\u2755");

    private final String SIGN;
    Identifier(String sign) {
        this.SIGN = sign;
    }

    public String getSIGN() {
        return this.SIGN;
    }
}
