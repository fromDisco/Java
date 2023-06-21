package EnumCounters;

public enum Country {
    GERMANY("schön", false),
    FRANCE("beau", false),
    BELGIUM("prachtig", true) {
        public boolean isBeautiful() {
            return false;
        }
    };

    private final String comment;
    private boolean isMonarchy;

    // Constructors
    Country(String comment, boolean isMonarchy) {
        this.comment = comment;
        this.isMonarchy = isMonarchy;
    }

    // Getters / Setters
    public String getComment() {
        return this.comment;
    }

    public boolean isMonarchy() {
        return this.isMonarchy;
    }

    public void setMonarchy(boolean monarchy) {
        this.isMonarchy = monarchy;
    }

    public boolean isBeautiful() {
        return true;
    }

}
