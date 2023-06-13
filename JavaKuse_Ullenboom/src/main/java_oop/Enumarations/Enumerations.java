package Enumarations;

public class Enumerations {
    // public static final String STAR = "\u2735";
    // public static final String FOUR_RHOMBS = "\u2755";
    private Identifier identifierSymbol;

    public String getIdentifierSymbol() {
        return this.identifierSymbol.getSIGN();
    }

    /**
     * @param identifier is Instance of Identifier {@link Identifier}
     */
    public void setIdentifierSymbol(Identifier identifier) {
        if (identifier != null) {
            this.identifierSymbol = identifier;
        }
    }

    // ####################################################
    // Test Reflections
    /**
     etIdentifierSymbol takes String name and changes camelCase to UPPER_CASE
     result is a constant class attribute, then gets that field, reads the value
     nd declares this value as the identifierSymbol
     param String name: name of constant name
     throws NoSuchFieldException
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    public void setIdentifierSymbolReflectionTest(String name) throws NoSuchFieldException, IllegalAccessException {
        String addUnderScores = name.replaceAll("([A-Z])", "_$1");
        String constant_name = addUnderScores.toUpperCase();

        // get object attribute
        java.lang.reflect.Field field = this.getClass().getDeclaredField(constant_name);
        field.setAccessible(true);
        String fieldValue = (String)field.get(this);
        // this.identifierSymbol = fieldValue;
    }

    public Identifier getIdentifier_symbol() {
        return identifierSymbol;
    }
    // ####################################################

    public String toString() {
        return "Enumerations{" +
                "identifierSymbol = " + identifierSymbol.getSIGN() +
                "}";
    }
}
