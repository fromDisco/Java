package Enumarations;

public class Client {
    public static void main(String[] args) {
        Enumerations enumerations = new Enumerations();
        enumerations.setIdentifierSymbol(Identifier.STAR);
        System.out.println(enumerations.getIdentifierSymbol());

        // ####################################################
        // TEST REFLECTION
        boolean test = false;
        if (test) {
            try {
                enumerations.setIdentifierSymbolReflectionTest("fourRhombs");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException ie) {
                ie.printStackTrace();
            }
            System.out.println(enumerations.getIdentifier_symbol());
        }
        // ####################################################
    }
}
