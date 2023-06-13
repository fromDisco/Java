package Association;

public class Friend {
    String name;
    String motto;
    private Association association;
    private boolean hasAsscociation;

    // Constructors
    Friend(String name) {
        this.name = name;
        this.association = new Association(this, "Best friend");
        this.hasAsscociation = true;
    }

    /**
     * Constructor sets association to another class
     * @param association instance, to make the connection to.
     */
    Friend(Association association, String name) {
        this.name = name;
        this.association = association;
        this.hasAsscociation = true;
    }

    // Setters / Getters
    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getMotto() {
        return this.motto;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public Association getAssociation() {
        return this.association;
    }

    public void setHasAsscociation(boolean hasAsscociation) {
        this.hasAsscociation = hasAsscociation;
    }
}
