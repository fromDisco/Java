package Association;

public class Client {
    public static void main(String[] args) {
        Association association = new Association("Ancestor");
        System.out.println(association);

        association.setFriendMotto("Heute hier und morgen dort");
        System.out.println("friendmotto: " + association.getFriend().getMotto());

        System.out.println(association.getFriend().getAssociation());

        // Create Association-Array
        Association[] objects = new Association[2];
        Association object01 = new Association("First");
        Association object02 = new Association("First");
        objects[0] = object01;
        objects[1] = object02;
        System.out.println("\n# object01 is the same as objects[0]");
        System.out.println(object01);
        System.out.println(objects[0]);
        System.out.println(objects);
    }
}
